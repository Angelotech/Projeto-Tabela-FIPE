package Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements ICinverterDados {

    public ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T ObterDados(String json, Class<T> classe) {

        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
//    Isso cria um ObjectMapper do Jackson, que é a biblioteca responsável por:
//    ler JSON converter para objeto converter objeto para JSON


}

