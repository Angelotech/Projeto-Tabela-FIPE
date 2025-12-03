package Service;

import java.util.List;

public interface ICinverterDados {
    <T> List<T> ListaDados(String json, Class<T> classe);  /*listas*/
    <T> T ObjetoDados(String json, Class<T> classe); /*objetos*/


}
