package poo.membrosestaticos.exerciciodefixacao;
// conversor de moeda
public class CurrencyConverter {
    public static double priceDollar; //pre�oDollar
    public static double amountOfDollarsPurchased; //quantidadeDeD�laresComprados

    public static double amountToBePaidInReais() { //ValorASerPagoEmReais
        double percentage = priceDollar * amountOfDollarsPurchased * 0.06;
        return percentage + (priceDollar * amountOfDollarsPurchased);
    }


}
