package br.com.alura.estudos.javacurso.lambda.formasdeimplementarumainterface;

public class ImplementandoUmaInterfaceComLambda2 {
    public static void main(String[] args) {

        //Aqui o lambda � feita sem chaves, pois s� � necess�rio usar chaves quando se tem retorno
        Taxi taxi = () -> System.out.println("Reserva efetuada");
        taxi.reservar();

    }
}