package ConstructorsDemo;
import java.util.*;
public class carsVariables {
	static String color;
	static String brand;
	static String model;
	static int mfgyear;
	
	//constructor
	public carsVariables(String color, String brand, String model,int mfgyear){
		carsVariables.color=color;
		carsVariables.brand=brand;
		carsVariables.model=model;
		carsVariables.mfgyear=mfgyear;
	}
	//displaying details here
	public static void displayinfo() {
		System.out.println("Color :\n"+color
				+"Brand :\n"+brand
				+"model :\n"+model
				+"mfgyear :\n"+mfgyear);
	}
	


	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Car Color\n");
			color=scan.nextLine();
			System.out.println("Enter Car Brand\n");
			brand=scan.nextLine();
			System.out.println("Enter Car Mode\n");
			model=scan.nextLine();
			System.out.println("Enter Mfg Year\n");
			mfgyear=scan.nextInt();
			scan.close();
			
			displayinfo();
	}

}

