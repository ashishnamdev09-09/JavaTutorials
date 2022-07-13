import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitTestingImplemenation {

	
	
	
	@Test
	public void twonumaddition() {
		int excepted =10;
		int actual = Math.addExact(5, 5);
		assertEquals(actual,excepted);
	}


	public static void main(String[] args) {
		
		System.out.println("single unit implementation");
		System.out.println("testing went good");
		
		UnitTestingImplemenation object = new UnitTestingImplemenation();
	

	}

}
