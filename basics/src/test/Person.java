package test;

public class Person {
	Person father;
	Person son;
	 String name;
	String Address;
	
	Person(String name,String Address){
		this.Address=Address;
		this.name=name;
	}
	
	
	 public Person topMostAncestor() {
		Person temp=this;
		//this will be having ar[6] since we can use this to declare a variable also
		if(temp.father==null) {
			return temp;
		}
		else {
			while(temp.father.father!=null) {
				temp=temp.father;
			}return temp.father;
		}
		
		
		
	}
	
	 public Person yongestPredcessor() {
		
		 Person temp=this;
			if(temp.son==null) {
				return temp;
			}
			else
			{
				while(temp.son.son!=null) {
					temp=temp.son;
				}
				return temp.son;
			}
	
		
	}
	
	
	
	public static void main(String[] args) {
	Person ar[]= new Person[10];
	ar[0]=new Person("ashish","mysore");
	ar[1]=new Person("divit","blore");
	ar[2]=new Person("akash","hubli");
	ar[3]=new Person("mohan","belgaum");
	ar[4]=new Person("Prasad","bidar");
	ar[5]=new Person("Prajwal","Kerela");
	ar[6]=new Person("Prajwal","Kerela2");
	ar[7]=new Person("Prajwal","Kerela3");
	ar[8]=new Person("Prajwal","Kerela4");
	ar[9]=new Person("Prajwal","Kerela5");
	
	ar[0].son=null;
	ar[1].father=ar[1];
	
	for(int i=1;i<9;i++) {
		ar[i].son=ar[i+1];
		ar[i].father=ar[i-1];
		
	}
	ar[9].father=ar[8];
	ar[9].son=null;
	
	Person oldest=ar[6].topMostAncestor();
	Person young=ar[4].yongestPredcessor();
	System.out.println(young.name +" "+young.Address);
	System.out.println(oldest.name+ " "+oldest.Address);
	
	
	

	
	}

}
