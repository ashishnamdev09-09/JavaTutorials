package ConstructorsDemo;

public class statesandbehaviours {

	//states
	boolean running;
	int currspeed;
	
	//behaviours
	public void start() {
		System.out.println("car started");
		running=true;
		currspeed=10;
	}
	
	public void stop() {
		
		System.out.println("car stopped");
		running=false;
		currspeed=0;
	}
	
	public void accelarate() {
		System.out.println("Car accelarating");
		currspeed=50;
	}
	
	public static void main(String[] args) {
		
		statesandbehaviours object =new statesandbehaviours();
		//behaviour call
		object.start();
		System.out.println("rununig state :"+object.running +"Speed :"+object.currspeed);
		object.accelarate();
		object.stop();
		System.out.println("rununig state :"+object.running+"Speed :"+object.currspeed);

		
		
			
		
		
	}

}
