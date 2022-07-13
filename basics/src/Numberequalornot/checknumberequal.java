



package Numberequalornot;

import java.util.Scanner;

public class checknumberequal {
	
	public static void main(String[] args) {
		//checking number equal or not 
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter two number");
		int a=scan.nextInt();
		int b=scan.nextInt();
			String result= (a==b)? "a is equal to b" : "a is not equal to b"; 
				System.out.println(result);
				scan.close();
	}

}
