package enumeracoescomposicoes.exercicioresolvido1;

import enumeracoescomposicoes.exercicioresolvido1.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker { //Funcion�rio
    private String name; //Nome
    private WorkerLevel level; //N�vel
    private Double baseSalary; //Base salarial

    private Department department; //Departamento

    //A Lista come�a vazia, mas depois podemos adicionar valores a ela e remover tamb�m
    //Mas de forma algumas podemos alterar essa list por um m�todo set
    private List<HourContract> contracts = new ArrayList<>(); //Ao ter uma composi��o (tem muitos)
    // � orientado a n�o se colocar no construtor

    public Worker() {

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }


    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts) {
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if (year == c_year && month == c_month)
                sum += c.totalValue();
        }
        return sum;
    }

}
