package Finalkeyword;

class BaseClass{
	final int number=200;
}



public class finaldemo extends BaseClass{
	//Not possible to do hence final variable can't be reintialized.
	//number=2000;

	
	public static void main(String[] args) {
		
		finaldemo object= new finaldemo();
		System.out.println(object.number);
		
	}

}
