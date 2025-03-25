public class TesteContaBancaria {
    public static void main(String[]args){
        ContaBancaria cc = new ContaBancaria();

        System.out.println(cc.depositar(100.00));
        System.out.println(cc.depositar(-150.00));

        System.out.println(cc.getSaldo());

        System.out.println(cc.sacar(50.00));
        System.out.println(cc.sacar(1000.00));

        System.out.println(cc.getSaldo());
    }
}
