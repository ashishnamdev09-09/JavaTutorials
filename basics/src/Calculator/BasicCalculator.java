package Calculator;
import java.util.*;
public class BasicCalculator {

	public static void main(String[] args) {
		
	int choice;
	double numone,numtwo;
	do {
	System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
	Scanner scan= new Scanner(System.in);
		System.out.println("Enter your Choice");
		choice=scan.nextInt();
		
		switch(choice) {
		
		case 1:System.out.println("Enter two numbers");
				numone=scan.nextDouble();
				numtwo=scan.nextDouble();
					System.out.println("addition of two numbers is "+(numone+numtwo));
					break;
		case 2:System.out.println("Enter two numbers");
			numone=scan.nextDouble();
			numtwo=scan.nextDouble();
			System.out.println("Subtraction of two numbers is "+(numone-numtwo));
			break;
			
	
		case 3: System.out.println("Enter two numbers");
		numone=scan.nextDouble();
		numtwo=scan.nextDouble();
		System.out.println("Multiplication of two numbers is "+(numone*numtwo));
		break;
		
		case 4: System.out.println("Enter two numbers");
		numone=scan.nextDouble();
		numtwo=scan.nextDouble();
		System.out.println("divison of two numbers is "+(numone/numtwo));
		break;
		
		case 5:System.out.println("---------Exiting------");
				return;
		default : System.out.println("Please choose valid option");
					break;
		
		}
		
		
	}while(choice!=7);
				

	}

}
