package Model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosAnos(@JsonAlias("codigo") String cod_Ano,
                        @JsonAlias("nome") String nome_ano) {
}
