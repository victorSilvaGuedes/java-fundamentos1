package pessoaHeranca;

public class Teste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Plotze");
        professor.setCpf("123456");
        professor.setIdade(40);
        professor.setSalario(8000);

        System.out.println(professor.imprimirDados());

        Aluno aluno = new Aluno();
        aluno.setNome("Victor");
        aluno.setCpf("123456");
        aluno.setIdade(22);
        aluno.setMatricula("Eng de computação");

        System.out.println(aluno.imprimirDados());
    }
}
