package StaticandNotstatic;

public class staticnonstatic {
	
	static void display() {//static method
		System.out.println("this is static method");
	}
	void function() {//non-static method
		System.out.println("this non-static function");
	}
	

	public static void main(String[] args) {
		display();//call to static method
		staticnonstatic object = new staticnonstatic();
		object.function();//call to non-static method


	}

}
