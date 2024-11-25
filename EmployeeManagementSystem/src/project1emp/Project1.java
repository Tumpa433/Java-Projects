package project1emp;
import java.time.LocalDate;
import java.util.Scanner;
public class Project1 {
	// Arrays for employee data
	
	static int[] empNo= {1001,1002,1003,1004,1005,1006,1007};
	static String[] empName= {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
	LocalDate[] joinDate= {LocalDate.of(2009, 4, 01),
			LocalDate.of(2012, 8, 23),
			LocalDate.of(2008, 11, 12),
			LocalDate.of(2013, 1, 29),
			LocalDate.of(2005, 7, 16),
			LocalDate.of(2000, 1, 1),
			LocalDate.of(2006, 6, 12)
		
	};
	static String[] designationCode= {"e","c","k","r","m","e","c"};
	static String[] department= {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
	static int[] basic= {20000,30000,10000,12000,50000,23000,29000};
	static int[] HRA= {8000,12000,8000,6000,20000,9000,12000};
	static int[] IT= {3000,9000,1000,2000,20000,4400,10000};
	
	// Arrays for designation and DA
	
	static String[] designationCodes= {"e","c","k","r","m"};
	static String[] designationList= {"Engineer","Consultant","Clerk","Receptionist","Manager"};
	static int[] daList= {20000,32000,12000,15000,40000};
	
	public static void main(String[] args) {
		// Create scanner to read employee ID
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter employee ID: ");
		int empID = scanner.nextInt();
		scanner.close();
		
		boolean employeeFound = false;
		
		for(int i=0;i < empNo.length;i++) {
			if(empNo[i]==empID) {
				String designation = "";
				int DA = 0;
				
				// Determine designation and DA using switch-case
				switch (designationCode[i]) {
				case "e":
				designation = designationList[0];
				DA = daList[0];
				break;
				case "c":
				designation = designationList[1];
				DA = daList[1];
				 break;
				case "k":
				designation = designationList[2];
				DA = daList[2];
				break;
				case "r":
				designation = designationList[3];
				DA = daList[3];
				break;
				case "M":
				designation = designationList[4];
				DA = daList[4];
				break;
					}
				int salary = basic[i]+HRA[i]+DA-IT[i];
				
				
				// print employee details
				
				System.out.printf("%-10s %-10s %-15s %-15s %-10s\n", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
                System.out.printf("%-10d %-10s %-15s %-15s %-10d\n", empNo[i], empName[i], department[i], designation,salary);
				
				
				employeeFound = true;
				break;
				}
				}

				if (!employeeFound) {
				System.out.println("There is no employee with empid: " + empID);

				
		}

	}
	
}
