##WorkerPayDemo

##code

import java.util.Scanner;
class Worker {
    protected String name;
    protected double salaryRate;
    Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }
    public double computePay(int hours) {
        return 0;
    }
    public void displayPay(int hours) {
        System.out.println("Worker Name: " + name);
        System.out.println("Total Pay: Rs." + computePay(hours));
    }
}
class DailyWorker extends Worker {
    DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    public double computePay(int hours) {
        return hours * salaryRate;
    }
}
class SalariedWorker extends Worker {
    SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }
    public double computePay(int hours) {
        return 40 * salaryRate;
    }
}
public class WorkerPayDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker worker = null; 
        while (true) {
        	System.out.println("URK24CS6006 - PUJITHA");
            System.out.println("\n--- Worker Pay System ---");
            System.out.println("1. Daily Worker");
            System.out.println("2. Salaried Worker");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            if (choice == 3) {
                System.out.println("Exiting... Goodbye!");
                break;
            }
            scanner.nextLine(); 
            System.out.print("Enter Worker Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Salary Rate (per hour): ");
            double rate = scanner.nextDouble();
            int hours = 0;
            if (choice == 1) {
                System.out.print("Enter Hours Worked: ");
                hours = scanner.nextInt();
                worker = new DailyWorker(name, rate);
            } else if (choice == 2) {
                System.out.print("Enter Hours Worked (any value, fixed pay will be calculated): ");
                hours = scanner.nextInt();
                worker = new SalariedWorker(name, rate);
            } else {
                System.out.println("Invalid Choice!");
                continue;
            }
            worker.displayPay(hours);
        }
    }
}

