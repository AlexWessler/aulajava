public class TestePonto2D {
    public static void main(String[]args){
        Ponto2D p = new Ponto2D();

        p.definirCoordenadas(10.0, 12.0);

        for(double valor : p.obterCoordenadas()){
            System.out.println(valor);
        }
    }
}
