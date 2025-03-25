public class TesteCarro {
    public static void main(String[]args){
        Carro civic = new Carro("Honda", "CIVIC", 2025);

        civic.atualizarQuilometragem(1000.00);
        civic.atualizarQuilometragem(1000.00);
        civic.fazerRevisao();
        civic.atualizarQuilometragem(1000.00);
        civic.fazerRevisao();
    }
}
