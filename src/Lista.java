import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lista {
    public static void main(String[] args) {
        List<String> nomes =  new ArrayList<>();
        nomes.add("Victor");
        nomes.add("Silva");
        nomes.add("Guedes");

        System.out.println(nomes);

        System.out.println("\nMétodo 1");
        nomes.forEach(nome -> System.out.println(nome));

        System.out.println("\nMétodo 2");
        for (String nome :nomes){
            System.out.println(nome);
        }
    }
}