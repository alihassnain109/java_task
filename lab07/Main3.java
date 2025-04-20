class BankAccount {
	public double AccountInterstRate(){
return 0.5;
	}
}
class SavingAccount extends BankAccount{
   public double AccountInterstRate(){
   return 0.10;
   } 
}
public class Main3{
	public static void main (String []agrs){

		BankAccount acc=new BankAccount();
		SavingAccount svg =new SavingAccount();

		System.out.println("Account Interst Rate :"+acc.AccountInterstRate());
		System.out.println("Saving account rate  :"+svg.AccountInterstRate());
	}
}