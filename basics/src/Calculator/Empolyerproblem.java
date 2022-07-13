package Calculator;
class person{
	public  String name;
	person(){
		name="ashish N.D";
	}
	
	
}


		class empl extends person{
		String empname;
		int joiningyear;
		double annSalary;
		String insNumber;
		
		empl(String empname, int joiningyear,double annSalary,String insNumber){
			this.empname=empname;
			this.joiningyear=joiningyear;
			this.annSalary=annSalary;
			this.insNumber=insNumber;
			
		}
		
		void displayinfo() {
			System.out.println("Emp Name:"+empname);
			System.out.println("Joining Year :"+joiningyear);
			System.out.println("Annual salary :"+annSalary);
			System.out.println("Natinal Ins Id :"+insNumber);
			
		}
		
		
	}
	


public class Empolyerproblem {

	public static void main(String[] args) {
		
		person obj =new person();
			String realname=obj.name;
		
			empl object = new empl(realname,2022,10000,"1a2c3d");
			object.displayinfo();
	}

}
