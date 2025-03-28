public class Aluno {
    private String nome;
    private Integer matricula;
    private Curso curso;

    public Aluno(String nome, Integer matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
