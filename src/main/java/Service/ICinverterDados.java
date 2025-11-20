package Service;

public interface ICinverterDados {
    <T> T ObterDados(String json, Class<T> classe);


}
