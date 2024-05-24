import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        /*
          HashMap, uma estrutura de dados do Java que permite armazenar pares de chave e valor
          É importante respeitar os tipos de chave e valor definidos ao adicionar elementos ao HashMap
         */
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Victor", 10);
        notas.put("Silva", 10);
        notas.put("Guedes", 9);

        var nota = notas.get("Victor");
        System.out.println(nota);

        for (Map.Entry<String, Integer> entry : notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("A chave é "+ key + ", e o valor é " + value);
        }
    }
}
