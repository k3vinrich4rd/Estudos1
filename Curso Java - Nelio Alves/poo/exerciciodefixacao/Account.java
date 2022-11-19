package poo.exerciciodefixacao;

public class Account {

    private int number; // N�mero da conta

    private String holder; //Propriet�rio(a)

    private double balance; // Saldo em conta


    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
        /*
        Para evitar mudan�as duplas, pois se a regra de neg�cio mudar, o construtor fica intacto
        e s� ser� necess�rio mudar o m�todo de dep�sito inicial, pois n�o estamos informando o valor do saldo,
        mas sim de dep�sito inicial (pois a conta nova tem um saldo zero

       Isso tamb�m � um caso de encapsulamento, pois estamos encapsulando a regra de neg�cio no m�todo
       protegendo somente um ponto de altera��o
         */
    }

    public String toString() {
        return
                "Account " + getNumber()
                        + ", "
                        + "Holder: " + getHolder()
                        + "," + " Balance: $ "
                        + String.format("%.2f", getBalance());
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) { //Deposito
        balance += amount; // or this.balance
    }

    public void withDraw(double amount) { //Saque
        balance -= amount + 5.0; // A quantia a ser sacada mais 5 (Que � o valor da taxa)
        // or this.balance
    }
}








