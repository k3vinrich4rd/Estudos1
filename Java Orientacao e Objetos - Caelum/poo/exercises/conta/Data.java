package poo.exercises.conta;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    String formatada() {
        return "Dia: " + this.getDia() + "\n"
                + "Mês: " + this.getMes() + "\n"
                + "Ano: " + this.getAno();
    }

    int getDia() {
        return this.dia;
    }

    void setDia(int dia) {
        this.dia = dia;
    }

    int getMes() {
        return this.mes;
    }

    void setMes(int mes) {
        this.mes = mes;
    }

    int getAno() {
        return this.ano;
    }

    void setAno(int ano) {
        this.ano = ano;
    }

}
