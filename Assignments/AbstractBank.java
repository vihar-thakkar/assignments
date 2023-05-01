package Assignments;
abstract class Bank{
	public abstract int getBalance();
}
class BankA extends Bank{
	private int balance=100;

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
}
class BankB extends Bank{
	private int balance =150;

	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

}
class BankC extends Bank {
	private int balance = 200;
	@Override
	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
}


public class AbstractBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA b1 = new BankA();
		BankB b2 = new BankB();
		BankC b3 = new BankC();

		System.out.println("Bank A balance " +b1.getBalance()+" $");
		System.out.println("Bank B balance " +b2.getBalance()+" $");
		System.out.println("Bank C balance " +b3.getBalance()+" $");



	}

}


