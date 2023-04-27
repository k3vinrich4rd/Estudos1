package polimorfismosobreposicao;

public abstract class Animal { // Classe m�e
    protected double peso;
    protected int idade;
    protected int membros;

    //M�todos especiais (construtor)
    public Animal(double peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    //M�todo
    public void locomover() {

    }
    //M�todo
    public void alimentar() {

    }

    //M�todo
    public void emitirSom() {

    }

    //M�todos de modificadores e de acesso:
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
