package polimorfismosobreposicao;
//Classe neta
public class Cachorro extends Mamifero {

    //M�todo construtor
    public Cachorro(double peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros, corDoPelo);
    }

    //Polimorfismo
    @Override
    public void emitirSom() {
        System.out.println("Au Auuuuuuuu");
    }

    //M�todo
    public void enterrarOsso() {
        System.out.println("Enterrando o osso");
    }

    //M�todo
    public void abanarORabo() {
        System.out.println("Abanando o rabo");
    }

}
