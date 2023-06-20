package mthds;

import java.util.Scanner;

interface Bank1
{
	public void showdetails();
	public void deposit();
	public void balnace();
	public void withdraw();
}

 class Sbi implements Bank1
{
	String customername="ATHIRA";
	 int acno;
	String bankdetails="SBI bank";
	int balance=10000;
	Scanner sc=new Scanner(System.in);
	@Override
	public void showdetails() {
		System.out.println("customer name " +customername);
		System.out.println("bank name " +bankdetails);
		System.out.println("enter acount no:");
		acno=sc.nextInt();
		System.out.println("account number "+acno);
		
		
	}
	@Override
	public void deposit() {
		System.out.println("enter deposit amount");
		int dep=sc.nextInt();
		balance=balance+dep;
		System.out.println("balance " +balance);
		}
	@Override
	public void balnace() {
		System.out.println("balnce amount is " +balance);
	}
	@Override
	public void withdraw() {
		System.out.println(" enter withdraw amount");
		int amount=sc.nextInt();
		balance=balance-amount;
		System.out.println("balance=" +balance);
		}
	}

public class Bankapp {

	public static void main(String[] args) {
		 Sbi ob=new Sbi();
		 ob.showdetails();
         ob.deposit();
        ob.withdraw();
        ob.balnace();
   
	}

}
