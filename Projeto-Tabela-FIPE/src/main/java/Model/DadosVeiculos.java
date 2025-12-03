package Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosVeiculos(@JsonAlias("codigo") String codigo,
                            @JsonAlias("nome") String nome){


    @Override
    public String toString() {
        return "codigo: " + codigo +
                ",nome: " + nome + '\'';
    }
}
