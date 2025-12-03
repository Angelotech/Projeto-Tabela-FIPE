package View;

import Model.DadosModelo;
import Model.DadosValor;
import Model.DadosVeiculos;
import Service.ConverteDados;
import Service.CosumoAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exibirmenu {

    private CosumoAPI cosumoAPI = new CosumoAPI();
    private ConverteDados converteDados = new ConverteDados();
    private String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";

    private String Marcas = "/marcas";
    private String Modelo = "/modelos";
    private String Anos = "/anos";

    public Scanner vei = new Scanner(System.in);
    public Scanner veil = new Scanner(System.in);

    public void EXibir() {

        System.out.println("**** OPÇÕES ****\n" +
                "\n" +
                "Carro\n" +
                "\n" +
                "Moto\n" +
                "\n" +
                "Caminhão\n" +
                "\n" +
                "Digite uma das opções para consultar valores:");

        var resposta = vei.nextLine();

        if (resposta.toLowerCase().contains("carr")) {
            resposta = "carros";
        } else if (resposta.toLowerCase().contains("mot")) {
            resposta = "motos";
        } else {
            resposta = "caminhao";
        }

        String cons = (ENDERECO + resposta.replace(" ", "+") + Marcas);
        var json = cosumoAPI.ObterDados(cons);
        var RetornoVeiculo = converteDados.ListaDados(json, DadosVeiculos.class);

        RetornoVeiculo.stream()
                .sorted(Comparator.comparing(DadosVeiculos::codigo))
                .forEach(System.out::println);


        System.out.println("Informe o código da marca para consulta: ");
        var codigo = veil.nextLine();
        String cons1 = (cons + "/" + codigo + Modelo);
        var json2 = cosumoAPI.ObterDados(cons1);
        var modelo = converteDados.ObjetoDados(json2, DadosModelo.class);
        modelo.modelos().stream()
                .sorted(Comparator.comparing(DadosVeiculos::codigo))
                .forEach(System.out::println);

        System.out.println("\nDigite um trecho do nome do carro a ser buscado");
        var nomeVeiculo = vei.nextLine();

        List<DadosVeiculos> modeloFil = modelo.modelos().stream()
                .filter(m -> m.nome().toLowerCase().contains((nomeVeiculo.toLowerCase())))
                .collect(Collectors.toList());
        System.out.println("\nModelos filtrados");
        modeloFil.forEach(System.out::println);

        System.out.println("Digite o codigo do modelo para buscar os valores da avaliação");
        var codigoModelo = vei.nextLine();
        String cons2 = (cons1 + "/" + codigoModelo+ "/" + Anos);
        var json3 = cosumoAPI.ObterDados(cons2);

        List<DadosVeiculos> ano = converteDados.ListaDados(json,DadosVeiculos.class);
        List<DadosValor> valores = new ArrayList<>();

        for (int i = 0; i < ano.size(); i++) {
            var enderecoanos = ENDERECO + "/" + ano.get(i).codigo();
            json3 = cosumoAPI.ObterDados(enderecoanos);
            DadosValor valor = converteDados.ObjetoDados(json3, DadosValor.class);
            valores.add(valor);
        }
        System.out.println("\navaliações de veiculos por ano: ");
        valores.forEach(System.out::println);

    }
}