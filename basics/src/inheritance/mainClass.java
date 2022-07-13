package inheritance;
import java.util.*;

//derived class
class subClass extends mainClass{
	
	//getting 4th character out of the given sentence
	void show() {
		String sentence="ashish";
		System.out.println("character at 4th place "+sentence.charAt(3));
	}
	
	//checking for voting eligible
	void votingeligible() {
		System.out.println("Enter the age");
		int age=scan.nextInt();
		if(age>=18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not eligible to vote");
		}
	}
	
}


//parent class
public class mainClass {
	Scanner scan =new Scanner(System.in);
	
	//checking number even or not
	void display() {
		System.out.println("Enter a number");
		int num=scan.nextInt();
		if(num%2==0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is not even");
		}
		
	}
	
	
	void print() {
		//checking number even or odd 
		System.out.println("Even and odd Number till 20");
		
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				System.out.println(i+" is odd");
			}else {
				System.out.println(i+" is even");
			}
		}
		
		
	}
	//checking largest among three numbers
	void largestNumber() {
		int numone,numtwo,numthree,largest;
		System.out.println("checking largest among 3 Numbers");
		System.out.println("Enter the first Number");
		numone=scan.nextInt();
		System.out.println("Enter the second Number");
		numtwo=scan.nextInt();
		System.out.println("Enter the three Number");
		numthree=scan.nextInt();
		
		largest=numthree>(numone>numtwo ? numone :numtwo) ? numthree :((numone>numtwo) ? numone :numtwo);
		System.out.println("largest number is "+largest);
	}
	

	public static void main(String[] args) {
		//derived class object
			subClass logic= new subClass();
			logic.display();
			logic.print();
			logic.show();
			logic.votingeligible();
			logic.largestNumber();
	}

}
