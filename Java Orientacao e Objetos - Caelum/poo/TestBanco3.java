package poo;

public class TestBanco3 {
    public static void main(String[] args) {

        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.balance = 1000.0;

        if (minhaConta.saca(2000)) {
            System.out.println("Consegui sacar");
        } else {
            System.out.println("Não consegui sacar");
        }


    }
}
