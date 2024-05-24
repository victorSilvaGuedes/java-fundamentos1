package conta;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de: R$" + valor + "\nSaldo atual: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de: R$" + valor + "\nSaldo atual: R$" + saldo);
        }
    }
}
