public class Carro {
    private String marca;
    private String modelo;
    private Integer anoFabricacao;
    private Double quilometragem;



    public Carro(String marca, String modelo, Integer anoFabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = 0.0;
    }

    public void atualizarQuilometragem(Double valor){
        if(valor >= 0) {
            this.quilometragem += valor;
        }
    }
    public void fazerRevisao() {
        var message = String.format("Veiculo: %s %s, ano de fabricação %d com KM: %.2f",
                marca, modelo, anoFabricacao, quilometragem);
        System.out.println(message);
        if(quilometragem >= 2500){
            trocarOleo();
        }
        System.out.println("Revisão realizada com sucesso!");
    }

    public void trocarOleo(){
        System.out.println("Troca de oleo realizada com sucesso! nova troca deve ser com: " + (quilometragem + 2500) + " KM");
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }
}
