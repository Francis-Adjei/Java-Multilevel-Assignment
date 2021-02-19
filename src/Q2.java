class Account{
	String customer_name;
	int account_no;
	
	public Account(String customer_name, int account_no) {
		super();
		this.customer_name = customer_name;
		this.account_no = account_no;
	}

	public void display(){
		System.out.println(customer_name + " " + account_no);
	}
}

class Saving_Account extends Account{
	double min_bal;
	double saving_bal;
	
	public Saving_Account(String customer_name, int account_no, double min_bal,
			double saving_bal) {
		super(customer_name, account_no);
		this.min_bal = min_bal;
		this.saving_bal = saving_bal;
	}

	public void display(){
		System.out.println(customer_name + " " + account_no + " " + min_bal + " " + saving_bal);
		}
}
class Account_Details extends Saving_Account{
	double deposite;
	double withdraw;
	
	 public Account_Details(String customer_name, int account_no,
			double min_bal, double saving_bal, double deposite, double withdraw) {
		super(customer_name, account_no, min_bal, saving_bal);
		this.deposite = deposite;
		this.withdraw = withdraw;
	}

	public double getDeposite() {
		return deposite;
	}
	 
	 public double getWithdraw() {
		return withdraw;
	}
	
	public void display(){
		System.out.println("The name of the customer is: " + customer_name);
		System.out.println("Account no:" + account_no);
		System.out.println("Minimum Balance: " + min_bal);
		System.out.println("Saving Balance: " + saving_bal);
		System.out.println("Amount deposited:" + deposite);
		System.out.println("Amount withdraw: " + withdraw);
		  
	}
}
public class Q2 {
	 public static void main(String[] args){
		 
		Account_Details mum = new Account_Details("Francis Adjei", 124554778, 12.5, 25.2, 5009.50, 58.20);
	     mum.display();
	    
	 }

}
