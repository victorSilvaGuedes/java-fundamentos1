package pessoaHeranca;

public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    String imprimirDados() {
        System.out.println(super.imprimirDados());
        return "Você é aluno";
    }
}
