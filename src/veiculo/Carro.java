package veiculo;

// polimorfismo com interface = obrigatório alterar os métodos
public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro");
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro");

    }
}
