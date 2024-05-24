package conta;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setNumero("2302");
        conta1.setTitular("Victor");

        conta1.depositar(2000);
        System.out.println("\n");
        conta1.sacar(1000);
        System.out.println("\n");
        conta1.sacar(2000);
    }
}
