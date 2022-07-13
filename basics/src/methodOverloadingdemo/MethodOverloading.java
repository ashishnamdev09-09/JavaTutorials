package methodOverloadingdemo;

public class MethodOverloading {

	public void disp(int num) {
		System.out.println(num);
	}

	public void disp(int num,char letter) {
		System.out.println(num+" "+letter);
	}
	
	public void disp(int num,float percentage) {
		System.out.println(num+" "+percentage);
	}
	public void disp(int num,double marks) {
		System.out.println(num+" "+marks);
	}
	
	public static void main(String[] args) {
		MethodOverloading object = new MethodOverloading();
		object.disp(12);
		object.disp(13,'A');
		object.disp(14,14);
		object.disp(14,15);
		
	}
	
}
