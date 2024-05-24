package pessoaHeranca;

public class Professor extends Pessoa {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    String imprimirDados() {
        System.out.println(super.imprimirDados());
        return "Você é professor";
    }
}
