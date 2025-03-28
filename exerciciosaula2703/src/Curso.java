public class Curso {

    private String nome;
    private Integer codigo;
    private Aluno[] alunos;
    private Integer totalAlunos;

    public Curso(String nome, Integer codigo){
        this.nome = nome;
        this.codigo = codigo;
        this.totalAlunos = 0;
        this.alunos = new Aluno[10];
    }
    public String getNome(){return nome;}

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void matricularAluno(Aluno aluno){
        alunos[totalAlunos] = aluno;
        totalAlunos++;

    }
    public void removerAluno(Integer matricula){
        int idxRemoved = 0;
        for(int i = 0; i < totalAlunos; i++){
            if(alunos[i].getMatricula().equals(matricula)){
                alunos[i] = null;
                idxRemoved = i;
            }
        }
        for (int i = idxRemoved; i < totalAlunos - 1; i++){
            alunos[i] = alunos[i+i];
        }
        alunos[totalAlunos-1] = null;
        totalAlunos--;
    }
    public void relatorio(){
        System.out.println(nome + " tem " + totalAlunos + " alunos");
        for (int i = 0; i < totalAlunos; i++){
            System.out.println(alunos[i].getNome());
        }
    }

}
