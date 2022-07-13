package VoteEligible;
import java.util.*;
public class Voting {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		//voting eligibility
		System.out.println("Enter Age");
		int age=scan.nextInt();
		if(age < 18) {
			System.out.println("Eligible");
		}else {
			System.out.println(" Not Eligible");
		}
		scan.close();
		

	}

}
