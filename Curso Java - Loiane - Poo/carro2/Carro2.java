package carro2;

public class Carro2 {
    String marca;
    String modelo;
    int numeroDePassageiros;
    double capacidadeDeCombustivel;
    double consumoDeCombustivel;

    double obterAutonomia(){
        return capacidadeDeCombustivel * consumoDeCombustivel;
    }
    //M�todo com par�metros � usado quando n�o se tem a informa��o necess�ria na classe
    double cacularCombustivel(double km){
        double quantidadeDeCombustivel = km/consumoDeCombustivel;
        return quantidadeDeCombustivel;
    }
}
