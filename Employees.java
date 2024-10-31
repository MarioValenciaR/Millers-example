/**
 * Employees.java
 * 
 * This class Represents an employee with a fixed annual salary.
 * Calculates bi-weekly pay based on the annual salary.
 * 
 * Modified by:: Mario Valencia
 */

public class Employees extends Millers {
    private double annualSalary;

    public Employees(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 26; // Bi-weekly pay based on annual salary since a year has 52 weeks
    }
}
