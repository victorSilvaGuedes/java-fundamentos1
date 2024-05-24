package pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "123456789";
        pessoa1.nome = "Victor";
        pessoa1.idade= 22;

        System.out.println(pessoa1.imprimirDados());
    }
}
