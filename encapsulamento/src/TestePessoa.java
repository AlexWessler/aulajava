public class TestePessoa {

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Alex", 24);
        var menina = new Pessoa("Maria"
        );

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

        System.out.println(menina.getNome());
        System.out.println(menina.getIdade());
    }
}
