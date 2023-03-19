package level2_inheritance;

import java.math.BigDecimal;

public class Employee extends Person {
    private String title;   //직책
    private String employerName;    //고용자 이름
    private char employerGarde;   //직책단계
    private BigDecimal salary;     //월급

    public Employee(String name, String title) {
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public char getEmployerGarde() {
        return employerGarde;
    }

    public void setEmployerGarde(char employerGarde) {
        this.employerGarde = employerGarde;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    public String toString(){
        return super.toString() + "#" + title + " # " + employerName + " # " + employerGarde + " # ";
    }
}
