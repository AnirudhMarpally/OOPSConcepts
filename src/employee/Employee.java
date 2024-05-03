package employee;

import java.util.Scanner;

import employee.AssistantManager;
import employee.Employee;
import employee.Manager;

public class Employee {
	private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double specialAllowance;
    private double hra;
    private double transportAllowance;
    private double tax = 2500;

    public Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }
    
    public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}
	public void setTransportAllowance(double transportAllowance) {
		this.transportAllowance = transportAllowance;
	}
	
	

    public void calculateNetSalary() {
    	hra = basicSalary * 0.5;
        double netSalary = (basicSalary + hra + specialAllowance + transportAllowance) - (tax);
        System.out.println("      Employee Name: " + employeeName +"      Net Salary: Rs. " + netSalary +"\n");
    }
    
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the manager details - employeeId, employeeName, basicsalary");
		Manager manager = new Manager(scanner.nextInt(), scanner.next(), scanner.nextInt());
		
		System.out.println("Enter the assistant manager details - employeeId, employeeName, basicsalary");
        AssistantManager assistantManager = new AssistantManager(scanner.nextInt(), scanner.next(), scanner.nextInt());
        
        System.out.println("Manager Net Salary is - ");
        manager.calculateNetSalary();
        
        System.out.println("Assistant Manager Net Salary is - ");
        assistantManager.calculateNetSalary();
        
        scanner.close();
    }

}




