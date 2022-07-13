package ConstructorsDemo;

 	class baseClass{
	int rollno;
	String name;
	String course;
	
	//parent class
	baseClass(int rollno,String name,String course){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
}
 	//child class
 	class derived extends baseClass{
 		String subject; 
 		int marks;
 		derived(int rollno,String name ,String course,String subject,int marks){
 			super(rollno,name,course);
 			this.subject=subject;
 			this.marks=marks;
 		}
 		//displaying all the details here
 		void display() {
 			System.out.println("Roll no :"+rollno
 					+"\nName :"+name
 					+"\ncourse :"+course
 					+"\nsubject :"+subject
 					+"\nmarks :"+marks);
 			
 		}
 		
 	}


public class inheritanceDemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived object =new derived(10,"ashish","cs","Java",200);
		object.display();
			
			
	}

}
