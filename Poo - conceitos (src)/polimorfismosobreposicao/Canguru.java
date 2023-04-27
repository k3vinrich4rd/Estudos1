package polimorfismosobreposicao;

public class Canguru extends Mamifero { // classe neta

    //M�todo construtor
    public Canguru(double peso, int idade, int membros, String corDoPelo) {
        super(peso, idade, membros, corDoPelo);
    }

    //M�todo
    public void usarBolsa() {
        System.out.println("Usando a bolsa");
    }

    //Polimorfismo
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }

}

