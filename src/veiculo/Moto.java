package veiculo;

// polimorfismo com interface = obrigatório alterar os métodos
public class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando a moto");
    }

    @Override
    public void frear() {
        System.out.println("Freando a moto");

    }
}
