package polimorfismosobreposicao;
//Classe Filha
public class Peixe extends Animal {
    //Atributo
    private String corEscama;

    //M�todo constructor
    public Peixe(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;

    }

    //Polimorfismo
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    //Polimorfismo
    @Override
    public void alimentar() {
        System.out.println("Comendo subst�ncias");
    }

    //Polimorfismo
    @Override
    public void emitirSom() {
        System.out.println("Blu blu blu");
    }
    //M�todo
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }

    //M�todo de acesso e modifica��o
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }


}
