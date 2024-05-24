import java.util.HashSet;
import java.util.Set;

/*
HashSet -> coleção no Java que armazena elementos únicos
Ao contrário do HashMap, que possui uma chave e um valor, o HashSet só armazena o valor
Podemos adicionar elementos ao HashSet usando o método Add e remover elementos usando o método Remove
Também podemos verificar se um elemento existe no HashSet usando o método Contains
No entanto, ao contrário de uma lista, o HashSet não mantém uma ordem específica dos elementos e não podemos acessar elementos pelo índice
O HashSet é útil quando não precisamos de uma ordem específica e queremos garantir que os elementos sejam únicos.
 */
public class ColecaoHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(11);
        numeros.add(12);

        numeros.remove(12);
        System.out.println(numeros.size());

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println(numeros.contains(12));
    }
}
