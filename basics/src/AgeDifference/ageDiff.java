package AgeDifference;
import java.util.*;
public class ageDiff {

	public static void main(String[] args) {
		//Age categorize 
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Age");
		
		int age=scan.nextInt();
		
		if(age <=10) {
			System.out.println("Kid ");
		}else if (age > 13 && age <20) {
			System.out.println("Teenager");
		}else if(age >25 && age <50) {
			System.out.println("Adult");
		}else if(age >50 && age <100) {
			System.out.println("Old Age");
			
		}else {
			System.out.println("Uncategeriosed");
			
		}
		scan.close();
	
	}

}
