package Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public record DadosVeiculos(@JsonAlias("codigo") String cod,
                            @JsonAlias("nome") String nomes){

}
