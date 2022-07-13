
import java.util.Scanner;

class Account{
	public int accno;
	public String acctype;
	public int balance;

	
	
	public void deposit(int amount) {
		balance+=amount;
	}
	
	public void withdraw(int amount) {
		balance-=amount;
	}
public Account(int accno, String acctype, int balance) {
		
		this.accno = accno;
		this.acctype = acctype;
		this.balance = balance;
	}
	public void show() {
			System.out.println("The current balance is :"+balance);
	}
	
	
	
}
class SavingsAccount extends Account{
	public int interest;
	

	public SavingsAccount(int accno, String acctype, int balance,int interest) {
		super(accno, acctype, balance);
		this.interest=interest;
		
	}
	
	public void addInterest(int interest) {
		balance+=balance*interest;

	}
	public void show() {
		System.out.println("Now the balance in savings account is :"+balance);
		
	}
}

class CurrentAccount extends Account{
    public int overdraft;
	public CurrentAccount(int accno, String acctype, int balance,int overdraft) {
		super(accno, acctype, balance);
		this.overdraft=overdraft;
		
	}
	
	public void checkOver() {
		if(balance<overdraft) {
			System.out.println("No money");
			
		}
		else {
			System.out.println("Sufficient");
		}
	}
	
}
public class Bank {
	public static void main(String args[]) {
		Scanner inp=new Scanner(System.in);

		int accno,balance=0;
		String acctype;
	
		System.out.println("Enter account type:");
		acctype=inp.nextLine();

		System.out.println("Enter account no:");
		accno=inp.nextInt();
	
		
		Account obj=new Account(accno,acctype,balance);
		int amt;
		System.out.println("Deposit money in the account for opening it");
		amt=inp.nextInt();
		obj.deposit(amt);
		if(acctype=="Savings") {
			int interest;
			System.out.println("Add 
			SavingsAccount object=new SavingsAccount(accno,acctype,balance
		}
		
	}
	

}
