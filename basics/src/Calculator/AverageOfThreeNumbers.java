package Calculator;
import java.util.*;
public class AverageOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numone,numtwo,numthree;
			System.out.println("Enter the first Number");
			numone=scan.nextDouble();
			System.out.println("Enter the Second Number");
			numtwo=scan.nextDouble();
			System.out.println("Enter the Third Number");
			numthree=scan.nextDouble();
			
				scan.close();
				System.out.println("Average of three numbers is :"+((numone+numtwo+numthree)/3));
				
	}

}
