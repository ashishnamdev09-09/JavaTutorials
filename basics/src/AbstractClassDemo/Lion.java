package AbstractClassDemo;

abstract class animals{
	abstract void roar();
	
}


public class Lion extends animals {
void roar() {
	System.out.println("lion is roaring");
}
	
	public static void main(String[] args) {
		animals obj= new Lion();
		obj.roar();
	}
}
