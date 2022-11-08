package lampada;

public class Lampada {
    String tipoDeLuz;
    double potenciaEmWatz;
    String marca;
    String cor;
    double preco;
    boolean ligada;

    public void ligarLampada(){
        if (ligada){
            System.out.println("A sua l�mpada est� ligada");
        }else {
            System.out.println("Erro, l�mpada desligada");
        }
    }
    public void desligarLampada(){
        if(!ligada){
            System.out.println("A sua l�mpada est� desligada");
        }else {
            System.out.println("Erro l�mpada ligada");
        }
    }

}
