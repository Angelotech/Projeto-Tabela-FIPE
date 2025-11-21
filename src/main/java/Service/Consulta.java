package Service;

import Model.DadosModelos;
import Model.DadosVeiculos;

public class Consulta {

    private CosumoAPI cosumoAPI = new CosumoAPI();

    private ConverteDados converteDados = new ConverteDados();

    private String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";

    private String Marcas = "/marcas";
    private String Modelo = "/modelos";
    private String Anos = "/anos";

    public String Modelos(String veiculos){
        var json = cosumoAPI.ObterDados(ENDERECO + veiculos.replace(" ","+") + Marcas);
       return(json);

    }











}
