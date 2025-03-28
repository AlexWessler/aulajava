public class Cliente {

    private String nome;
    private String cpf;
    private Pedido[] pedidos;
    private int totalPedidos;

    public Cliente(){
        totalPedidos = 0;
        pedidos = new Pedido[100];
    }
    public Cliente(String nome, String cpf){
        this();
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void adicionarPedido(Pedido pedido){
        pedidos[totalPedidos] = pedido;
        totalPedidos++;
    }

    public void relatorio(){
        int count = 1;
        System.out.println("Total de pedidos: " + totalPedidos);
        for (Pedido pedido : pedidos){
            if (pedido == null)
                break;
            System.out.println("Pedido [" +count+"] total da compra");
            count++;
    }}
}
