package pessoa;

public class Pessoa {
    String nome;
    int idade;
    String cpf;

    String imprimirDados(){
        return "Nome: "+ nome + "\nIdade: " + idade + "\nCPF: "+ cpf;
    }
}
