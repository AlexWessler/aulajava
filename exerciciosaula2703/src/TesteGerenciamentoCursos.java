public class TesteGerenciamentoCursos {

    public static void main(String[] args){
        var aluno1 = new Aluno("Alex", 123,null);
        var aluno2 = new Aluno("Maria", 123,null);
        var aluno3 = new Aluno("Lucas", 321,null);
        var aluno4 = new Aluno("Guizera", 123,null);

        var curso1 = new Curso("medicina",1 );
        var curso2 = new Curso("Engenharia",2);

        curso1.matricularAluno(aluno1);
        curso1.matricularAluno(aluno2);
        curso1.matricularAluno(aluno3);
        curso1.relatorio();
        curso1.removerAluno(321);
        curso1.relatorio();

        curso2.matricularAluno(aluno4);
        curso2.relatorio();
    }
}
