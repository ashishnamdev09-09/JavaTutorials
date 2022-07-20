package com.spring.sweetshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.sweetshop.dao.SweetShopDao;
import com.spring.sweetshop.entites.Adminlogin;


public class App 
{
    public static void main( String[] args )
    {
    	
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/sweetshop/config.xml");
    	SweetShopDao sweetshopdao=context.getBean("sweetshopdao",SweetShopDao.class );
    	boolean go=true;
    	
       System.out.println("Welcome to sweet shop");
       System.out.println("please press the following options to login");
       System.out.println("1.Admin\n2.Customer");
       
       try {
    	   
    	   
    	   //for Admin section 
    	   
    	   //Admin login
		int loginchoice=Integer.parseInt(br.readLine());
		if(loginchoice==1) {
			System.out.println("Enter the Admin login ID");
			String adminId=br.readLine();
			System.out.println("Enter the Admin  Password");
			String adminpass=br.readLine();
		
			 Adminlogin student=sweetshopdao.adminlogin(adminId, adminpass);
			 
			 System.out.print("logged in as Admin");
			
		}
		
		//Customer Section 
		
		
		else if(loginchoice==2) {
			System.out.println("Customer login");
			boolean select = true;
			
			while(select) {
			 System.out.println("Please select any options");
			 System.out.println("1.Registration\n2.Login\n3.View sweet category\n4.View product\n5.View offer\n6.Place order\n7.Exit");
			 int customerchoice=Integer.parseInt(br.readLine());
			 
			 switch(customerchoice){
			 case 1:
				 
				 //registration
				 break;
			 case 2:
				 //login customer
				 break;
			 case 3:
				 //view sweet cat
				 break;
			 case 4:
				 //view product
				 break;
				 
			 case 5://view offer
				 break;
		
			 case 6://place order
				 break;
				 
			 case 7:select =false;
			 
				 break;
			 }
			 
		}
		}
		
		
	}
       
       catch (IOException e) {
	
    	   System.out.println("Invalid Input Try with another one !!!");
       	System.out.println(e.getMessage());
	}
    	
    	
    	 System.out.println("Thank you for using my application");
         System.out.println("See you again!");
         
       
    }
}
