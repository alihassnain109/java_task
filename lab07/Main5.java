class Employee {
    public double calculateSalary() {
        return 30000; 
}

class Manager extends Employee {
    @Override
    public double calculateSalary() {
        return 30000 + 20000; 
    }
}

class Worker extends Employee {
    @Override
    public double calculateSalary() {
        return 30000 + 5000; 
    }
}

public class Main5 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee mgr = new Manager();
        Employee wrk = new Worker();
 System.out.println("Employee Salary: " + emp.calculateSalary());
        System.out.println("Manager Salary: " + mgr.calculateSalary());
        System.out.println("Worker Salary: " + wrk.calculateSalary());
    }
}
