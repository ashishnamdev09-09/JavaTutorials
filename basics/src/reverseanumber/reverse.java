package reverseanumber;

public class reverse {
	
	static void numberreverse(int n) {
		if(n<10) {
			System.out.println(n);
		}
		else {
			System.out.println(n%10);
			numberreverse(n/10);
		}
		
	}
public static void main(String[] args) {
	numberreverse(1414);
}
}
