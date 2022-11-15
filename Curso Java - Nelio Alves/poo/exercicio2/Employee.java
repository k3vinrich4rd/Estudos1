package poo.exercicio2;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() { //Sal�rio liquido
        return grossSalary - tax;
    }

    public void increaseSalary(double porcentagem) { // Aumentar sal�rio
        this.grossSalary += grossSalary * porcentagem / 100.0;
        // grossSalary  = grossSalary + grossSalary  *
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());

    }

/*
O This nos da possibilidade de referenciar o atributo recebendo as implementa��es j� feitas nele,
com as novas implementa��es que podemos fazer no decorrer do programa.
    Ficando nesse da aplica��o como: Salario Bruto - taxa + aumento salarial
 */

}
