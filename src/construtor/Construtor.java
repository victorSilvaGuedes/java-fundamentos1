package construtor;

public class Construtor {
    private int numero;

    public Construtor(int numero) {
        this.numero = numero;
        System.out.println("Construtor apenas com número");
    }

    public Construtor(int numero, String texto) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
