import java.sql.Date;

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    // Класс для расчета чистой зарплаты private class NetSalaryCalculator { public
    // int calculate() { int tax = (int) (baseSalary * 0.25);//calculate in otherway
    // return baseSalary - tax; } }

    public int calculateNetSalary() {
        return new NetSalaryCalculator().calculate();
    }
}
