/**
 * Consultants.java
 * 
 * This class represents a consultant with hourly pay and calculates pay based on 
 * regular hours and overtime.
 * 
 * Author: Mario Valencia
 */

public class Consultants extends Millers {
    private double hoursWorked;
    private double consultantWage;

    public Consultants(String name, double hoursWorked, double consultantWage) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.consultantWage = consultantWage;
    }

    @Override
    public double calculatePay() {
        double regularPay = hoursWorked <= 76 ? hoursWorked * consultantWage : 76 * consultantWage;
        double overtimePay = hoursWorked > 76 ? (hoursWorked - 76) * consultantWage * 1.5 : 0;
        return regularPay + overtimePay;
    }
}
