/**
 * Millers.java
 * 
 * Abstract base class representing a worker with a name.
 * Requires subclasses to implement calculatePay() method for specific pay calculations.
 * 
 * Author: Mario Valencia
 */

public abstract class Millers {
    private String name;

    public Millers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract method to calculate pay, which will be overridden in each subclass
    //calculate payment method, to be override in each child class.  
    public abstract double calculatePay();

    @Override
    public String toString() {
        return "Name: " + name + ", Pay: $" + calculatePay();
    }
}
