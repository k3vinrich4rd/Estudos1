package poo.exercises.conta;

public class Conta {

    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;


    public Conta() {

    }

    public Conta(String titular) {
        this.titular = titular;
    }

    void sacar(double quantia) {
        if (quantia > this.saldo) {
            System.out.println("Não posso sacar um valor maior do que o saldo!");
        } else {
            this.saldo -= quantia;
        }
    }

    void depositar(double quantia) {
        this.saldo += quantia;
    }

    double getRendimento() {
        return this.saldo * 0.1;
    }

    String recuperarDadosParaImpressao() {
        return
                "Informações da conta: \n" +
                        "Nome do proprietário da conta: " + this.getTitular() + "\n" +
                        "Numero da conta: " + this.getNumero() + "\n" +
                        "Agência da conta: " + this.getAgencia() + "\n" +
                        "Saldo da conta: " + this.getSaldo() + "\n" +
                        "Rendimento da conta: " + this.getRendimento() + "\n" +
                        "Data de abertura: " + this.getDataDeAbertura().formatada();
    }

    String getTitular() {
        return this.titular;
    }

    void setTitular(String titular) {
        this.titular = titular;
    }

    int getNumero() {
        return this.numero;
    }

    void setNumero(int numero) {
        this.numero = numero;
    }

    String getAgencia() {
        return this.agencia;
    }

    void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    double getSaldo() {
        return this.saldo;
    }

    Data getDataDeAbertura() {
        return this.dataDeAbertura;
    }

    void setDataDeAbertura(Data data) {
        this.dataDeAbertura = data;
    }
}
