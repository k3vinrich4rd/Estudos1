package poo.test.conta;

public class TestBanco2 {
    public static void main(String[] args) {

        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.deposita(1000.0);
        boolean consegui = minhaConta.saca(200);

        if (consegui) {
            System.out.println("Consegui sacar");
        } else {
            System.out.println("Não consegui sacar");
        }


    }
}
