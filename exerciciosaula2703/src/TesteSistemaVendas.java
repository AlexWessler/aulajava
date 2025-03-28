public class TesteSistemaVendas {

    public static void main(String[] args){
        var p1 = new Produto ("Maça", 10.90, 10);
        var p2 = new Produto ("Leite", 15.90,15);
        var p3 = new Produto ("Tomate", 12.90, 20);
        var p4 = new Produto ("Cebola", 7.90, 70);

        System.out.println(p1.getNome());
        System.out.println(p2.getNome());

        Produto[] lista1 = {p1, p2};
        Produto[] lista2 = {p3, p4};

        var pedido1 = new Pedido();
        var pedido2 = new Pedido();
        pedido1.setItens(lista1);
        pedido2.setItens(lista2);

        var joao = new Cliente("João", "123.122.111.00;");
        var maria = new Cliente("Maria", "163.222.555.15");

        System.out.println("Pedidos do joão");
        joao.adicionarPedido(pedido1);
        joao.adicionarPedido(pedido2);
        joao.relatorio();

        System.out.println("Pedidos da Maria");
        maria.adicionarPedido(pedido2);
        maria.relatorio();
    }
}
