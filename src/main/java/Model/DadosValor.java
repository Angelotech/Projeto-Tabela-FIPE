package Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosValor(@JsonAlias("Valor") String valor,
                         @JsonAlias("Marca") String marca,
                         @JsonAlias("Modelo") String modelo,
                         @JsonAlias("AnoModelo") int ano,
                         @JsonAlias("Combustivel") String combustivel,
                         @JsonAlias("CodigoFipe") String codigoFipe,
                         @JsonAlias("MesReferencia") String mesDeReferencia,
                         @JsonAlias("SiglaCombustivel") String sigla) {
}
