package polimorfismosobreposicao;
//Classe filha
public class Mamifero extends Animal {

    private String corDoPelo;

    //Constructor
    public Mamifero(double peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros);
        this.corDoPelo = corDoPelo;
    }

    //Polimorfismo
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }


    //Polimorfismo
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }


    //Polimorfismo
    @Override
    public void emitirSom() {
        System.out.println("Som de mam�fero");
    }


    //M�todos de acesso e modifica��o
    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
}
