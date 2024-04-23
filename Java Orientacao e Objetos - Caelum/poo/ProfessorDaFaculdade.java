package poo;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
    private int horasDeAula;

    @Override
    public double getGastos() {
        return this.getSalario() + this.horasDeAula * 10;
    }

    @Override
    public String getInfo() {
        String informacaoBasica = super.getInfo();
        return informacaoBasica + " horas de aula: " + this.horasDeAula;
    }

    public int getHorasDeAula() {

        return horasDeAula;
    }

    public void setHorasDeAula(int horasDeAula) {
        this.horasDeAula = horasDeAula;
    }
}

