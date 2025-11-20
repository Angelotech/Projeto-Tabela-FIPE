package Model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosModelos(@JsonAlias("codigo") String cod_Modelos,
                           @JsonAlias("nome") String nomes_Modelos) {
}
