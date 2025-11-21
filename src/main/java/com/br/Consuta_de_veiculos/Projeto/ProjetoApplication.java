package com.br.Consuta_de_veiculos.Projeto;

import Model.DadosVeiculos;
import Service.Consulta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoApplication {

	public static void main(String[] args) {
        System.out.println("ola");
        Consulta consulta = new Consulta();
        String vl = "carros";
//        DadosVeiculos veic = consulta.Modelos(vl);

        System.out.println(consulta.Modelos("carros"));







	}

}
