/**
 * Supervisors.java
 * 
 * this class represents a supervisor with an annual salary and a bi-weekly bonus.
 * Calculates bi-weekly pay by adding the bonus to the base pay.
 * 
 * Modified by: Mario Valencia
 */

public class Supervisors extends Employees {
    private double biWeeklyBonus;

    public Supervisors(String name, double annualSalary, double biWeeklyBonus) {
        super(name, annualSalary);
        this.biWeeklyBonus = biWeeklyBonus;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + biWeeklyBonus;
    }
}
