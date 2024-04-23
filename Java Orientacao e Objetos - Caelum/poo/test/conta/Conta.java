package poo.test.conta;

import poo.Cliente;

public abstract class Conta {
    private int number;
    private Cliente titular;

    private double balance;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    boolean saca(double quantity) {
        if (this.balance < quantity) {
            return false;
        } else {
            this.balance = this.balance - quantity;
            return true;
        }
    }

    void deposita(double quantity) {
        this.balance = +quantity;
    }

    void transfere(Conta contaDestino, double quantity) {
        boolean retirou = this.saca(quantity);
        if (!retirou) {
            System.out.println("Salado insuficiente");
        } else {
            contaDestino.deposita(quantity);
        }

    }

}

