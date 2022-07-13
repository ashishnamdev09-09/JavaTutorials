package fibinacciseries;

import java.util.*;

public class fibinaccinumber {
	static int n1=0,n2=1,n3=0;
		public static void series(int number) {
//			int n1=0,n2=1,count=0;
//			while(count<number) {
//				System.out.print(n1+" ");
//				
//				int n3=n1+n2;
//				n1=n2;
//				n2=n3;
//				count++;
			
			if(number>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			
			series(number-1);
			}
			
			}
			
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			series(20);
		
		Scanner scan= new Scanner(System.in);
		int range=scan.nextInt();
		System.out.println(n1+"\n"+n2);
		series(range-2);
				
	}

}
