/**
 * MillersTest.java
 * 
 * Modified by: Mario Valencia
 * Date: October 31, 2024
 * 
 * Description:
 * This program manages and displays information about different types of workers ("Millers") 
 * including Consultants, Employees, and Supervisors. Each type of worker has specific attributes 
 * related to their pay structure. The program initializes a default list of millers, allows 
 * the user to add more millers interactively, and then displays pay information for all millers.
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MillersTest {
    public static void main(String[] args) {
        ArrayList<Millers> millersList = new ArrayList<>();

        // default data
        millersList.add(new Consultants("Mario", 80, 50));
        millersList.add(new Employees("Alberto", 52000));
        millersList.add(new Supervisors("Marlon", 60000, 200));

        // Display pay information for each miller
        for (Millers miller : millersList) {
            System.out.println(miller);
        }

        // add more millers by user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to add a new miller? (yes/no): ");
        String response = scanner.nextLine();

        while (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter miller name: ");
            String name = scanner.nextLine();
            System.out.print("Select type (1 for Consultant, 2 for Employee, 3 for Supervisor): ");
            int type = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (type == 1) {
                System.out.print("Enter hours worked: ");
                double hoursWorked = scanner.nextDouble();
                System.out.print("Enter wage per hour: ");
                double wage = scanner.nextDouble();
                millersList.add(new Consultants(name, hoursWorked, wage));
            } else if (type == 2) {
                System.out.print("Enter annual salary: ");
                double salary = scanner.nextDouble();
                millersList.add(new Employees(name, salary));
            } else if (type == 3) {
                System.out.print("Enter annual salary: ");
                double salary = scanner.nextDouble();
                System.out.print("Enter bi-weekly bonus: ");
                double bonus = scanner.nextDouble();
                millersList.add(new Supervisors(name, salary, bonus));
            }

            System.out.print("Would you like to add another miller? (yes/no): ");
            scanner.nextLine(); // consume newline
            response = scanner.nextLine();
        }

        System.out.println("\nMillers Pay Information:");
        for (Millers miller : millersList) {
            System.out.println(miller);
        }

        scanner.close();
    }
}
