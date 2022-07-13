package AbstractClassDemo;
abstract class Bank{
	
	abstract void currentbalance();
}


 public  class SavingsCurrent extends Bank{
	 //overridden method
	void currentbalance() {
		System.out.println("this is current balance ");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank object = new SavingsCurrent();
		object.currentbalance();
	}



}
