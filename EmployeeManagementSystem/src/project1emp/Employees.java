package project1emp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class Employees {

		    private static final String fileName = "employees.txt";

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        while (true) {
		            System.out.println("Main Menu");
		            System.out.println("1. Add an Employee");
		            System.out.println("2. Display All");
		            System.out.println("3. Exit");
		            System.out.print("Enter your choice: ");

		            int choice = scanner.nextInt();
		            scanner.nextLine();  // Consume newline

		            switch (choice) {
		                case 1:
		                    addEmployee(scanner);
		                    break;
		                case 2:
		                    displayAllEmployees();
		                    break;
		                case 3:
		                    System.out.println("Exiting the application.");
		                    scanner.close();
		                    return;
		                default:
		                    System.out.println("Invalid choice.");
		            }
		        }
		    }

		    private static void addEmployee(Scanner scanner) {
		        System.out.print("Enter Employee ID: ");
		        int id = scanner.nextInt();
		        scanner.nextLine();  // Consume newline

		        System.out.print("Enter Employee Name: ");
		        String name = scanner.nextLine();

		        System.out.print("Enter Employee Age: ");
		        int age = scanner.nextInt();

		        System.out.print("Enter Employee Salary: ");
		        double salary = scanner.nextDouble();

		        Employee employee = new Employee(id, name, age, salary);
		        saveEmployeeToFile(employee);
		    }

		    private static void saveEmployeeToFile(Employee employee) {
		        try (FileWriter fw = new FileWriter(fileName, true);
		             BufferedWriter bw = new BufferedWriter(fw);
		             PrintWriter out = new PrintWriter(bw)) {
		            out.println(employee);
		        } catch (IOException e) {
		            System.out.println("An error occurred while saving the employee data.");
		        }
		    }

		    private static void displayAllEmployees() {
		        try (FileReader fr = new FileReader(fileName);
		             BufferedReader br = new BufferedReader(fr)) {
		            String line;
		            System.out.println("----Report----");
		            while ((line = br.readLine()) != null) {
		                System.out.println(line);
		            }
		            System.out.println("----End of Report----");
		        } catch (IOException e) {
		            System.out.println("An error occurred while reading the employee data.");
		        }
		    }
		}


