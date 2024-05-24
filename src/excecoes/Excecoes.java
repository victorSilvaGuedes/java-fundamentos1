package excecoes;

import pessoaHeranca.Pessoa;

public class Excecoes {
    // Checked -> exige que trate a exceção, conseguimos prever a exceção

    // Unchecked -> não temos controle sobre elas, como erros de execução do programa (ex: divisão por 0)
    public static void main(String[] args) {
        // Checked
        try {
            validarNumero();
        } catch (Exception e) {
            System.out.println("ERRO!");
            e.printStackTrace();
        }

        // Unchecked
        Pessoa p = null;
        p.getCpf();
    }

    public static void validarNumero() throws Exception {
        int numero = 10;

        if (numero < 100) {
            throw new Exception("Numero menor que 100");
        }
    }
}
