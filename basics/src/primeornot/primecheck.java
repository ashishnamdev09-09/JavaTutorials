package primeornot;
import java.util.*;
public class primecheck {
	
	  static void primechecker(int number) {
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter a number");
//		int number=scan.nextInt();
//		scan.close();
		 if(number==0 || number==1) {
			 System.out.println("Not a Prime");
			 return;
		 }else if(number==2) {
			 System.out.println("prime number");
			 return;
		 }
		  
		  
		  
		if(number%2!=0) {
			if(number%3!=0 || number%5!=0 || number%7!=0) {
				System.out.println("prime number");
			}
			else {
				System.out.println("Not a Prime Number");
			}
		}
		else {
			System.out.println("not a prime number");
		}
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primechecker(2);
		primechecker(3);
		primechecker(5);
		primechecker(7);
		primechecker(10);
			
	}

}
