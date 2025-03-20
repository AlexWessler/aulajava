import java.time.LocalDate;

public class TesteConta {
    public static void main(String[]args){

        Conta contaAluno = new Conta();
        contaAluno.name = "João";
        contaAluno.numero = 33658;
        contaAluno.agencia = 9999;
        contaAluno.saldo = 0.0;
        contaAluno.dataCriacao = LocalDate.now();

        Conta contaProfessor = new Conta();
        contaProfessor.name = "João";
        contaProfessor.numero = 33658;
        contaProfessor.agencia = 9999;
        contaProfessor.saldo = 0.0;
        contaProfessor.dataCriacao = LocalDate.now();

        //contaAluno.depositar(100.00);
        //contaAluno.sacar(1000.00);
        //contaAluno.calcularRendimento();
        System.out.println(contaAluno.recuperarDadosParaImpressao());
        System.out.println(contaProfessor.recuperarDadosParaImpressao());

        // comparando usando ==
        if(contaAluno == contaProfessor){
            System.out.println("SIM são iguais");
        }else{
            System.out.println("NÃO são iguais");
        }

        if(contaAluno.equals(contaProfessor)){
            System.out.println("SIM são iguais");
        }else{
            System.out.println("NÃO são iguais");
        }
    }
}