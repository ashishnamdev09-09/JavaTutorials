package ConstructorDemo;
import java.util.*;
public class constructors {
	
	 static int empid;
	  static String empname;
	 static String department;
	 static float salary;
	
public constructors(int empid, String empname,String department,float salary ) {
	// accessing static members using class name 
	constructors.empid=empid;
	constructors.empname=empname;
	constructors.department=department;
	constructors.salary=salary;
	
	System.out.println("this is inside constructors");
}

public void displayinfo() {
	System.out.println("ID"+empid+"NAME :"+empname+"DEPT :"+department+"Salary"+salary);
	
}

	public static void main(String[] args) {
		
		//constructors object =new constructors(empid,empname,department,salary);

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Employee id");
		empid=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter Employee Name");
		empname=scan.nextLine();
		//scan.hasNext();
		System.out.println("Enter Employee dept");
		department=scan.nextLine();
		//scan.hasNext();
		System.out.println("Enter Employee salary");
		salary=scan.nextFloat();
		scan.close();
		
		
		constructors object =new constructors(empid,empname,department,salary);
		object.displayinfo();
		

	}

}
