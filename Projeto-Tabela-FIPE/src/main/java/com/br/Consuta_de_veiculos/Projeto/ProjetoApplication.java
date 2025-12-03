package com.br.Consuta_de_veiculos.Projeto;

import View.Exibirmenu;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoApplication {
    public static void main(String[] args) {

        Exibirmenu menu = new Exibirmenu();

        menu.EXibir();
    }
}







