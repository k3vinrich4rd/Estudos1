package poo.exercises.conta;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {

    }

    public Data(int dia, int mes, int ano) {
        this.preencheData(dia, mes, ano);
    }

    private boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0) {
            return false;
        }
        int ultimoDiaDoMes = 31;    //	por	padrao	são	31	dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            if (ano % 4 == 0) {
                ultimoDiaDoMes = 29;
            } else {
                ultimoDiaDoMes = 28;
            }
        }
        if (dia > ultimoDiaDoMes) {
            return false;
        }
        return true;
    }


    void preencheData(int dia, int mes, int ano) {
        if (!isDataViavel(dia, mes, ano)) {
            System.out.println("A data:	" + dia + "/" + mes + "/" + ano + "não existe!");
        } else {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    String formatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }


    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}
