package exercises;

//2. Imprima a soma	de 1 at� 1000.
public class Fibonacci {
    public static void main(String[] args) {

        int anterior = 0;
        int atual = 1;
        while (atual < 100) {
            System.out.println(atual);
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        System.out.println(atual);
    }
}
