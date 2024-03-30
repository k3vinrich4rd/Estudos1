package poo.exercises.conta;

public class Conta {

    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataDeAbertura;

    private int identificador;

    private static int proximoIdentificador;


    public Conta() {

    }

    public Conta(String titular) {
        this.titular = titular;
        this.identificador = Conta.proximoIdentificador++;
    }

    public void sacar(double quantia) {
        if (quantia > this.saldo) {
            System.out.println("Não posso sacar um valor maior do que o saldo!");
        } else {
            this.saldo -= quantia;
        }
    }

    public void depositar(double quantia) {
        this.saldo += quantia;
    }

    public double getRendimento() {
        return this.saldo * 0.1;
    }

    public String recuperarDadosParaImpressao() {
        return
                "Informações da conta: \n" +
                        "Nome do proprietário da conta: " + this.getTitular() + "\n" +
                        "Numero da conta: " + this.getNumero() + "\n" +
                        "Agência da conta: " + this.getAgencia() + "\n" +
                        "Saldo da conta: " + this.getSaldo() + "\n" +
                        "Rendimento da conta: " + this.getRendimento() + "\n" +
                        "Data de abertura: " + this.getDataDeAbertura().formatada();
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Data getDataDeAbertura() {
        return this.dataDeAbertura;
    }

    public void setDataDeAbertura(Data data) {
        this.dataDeAbertura = data;
    }

    public int getIdentificador() {
        return this.identificador = Conta.proximoIdentificador;
    }
}
