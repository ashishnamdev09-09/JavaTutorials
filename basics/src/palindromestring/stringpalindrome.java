package palindromestring;

public class stringpalindrome {
	
	static void reverse(String s) {
		String rev="";
		int length=s.length();
		
		for(int i=length-1;i>=0;i--) 
			rev=rev+s.charAt(i);
			
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
		
	}
	public static void main(String[] args) {
		reverse("ashish");
	}
}
