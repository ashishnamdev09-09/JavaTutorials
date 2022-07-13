package lamdaexperession;

interface greetings{
	public String say();
	
}

interface MyfunctionInterface{
	public String hello();
}



public class LamdaDemo {

	public static void main(String[] args) {
			greetings object= ()->{
				return "Good morning";
			};
			System.out.println(object.say());
			MyfunctionInterface obj= () -> {
				return "hello there";
			};
			System.out.println(obj.hello());

	}

}
