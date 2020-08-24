class Account{
	long acno;
	double balance;
	Account(long acno,double balance){
		this.acno=acno;
		this.balance=balance;
	}
	void deposit(double newblnc){
		balance+=newblnc;
		displaybln();
		System.out.println("After Deposit ");
	}
	void withdraw(double wblnc){
		if(wblnc>balance){
			System.out.println("Sorry your balance is insufficient to withdraw !! ");
		}else{
			balance-=wblnc;
			displaybln();
			System.out.println("After Withdraw");
		}
	}
	void displaybln(){
		System.out.println("Your Balance is "+balance);
	}
}
class Bank8{
	public static void main(String[] args) {
		Account a1=new Account(1122334455667788L,25000D);
		a1.displaybln();
		a1.deposit(15000D);
		a1.withdraw(10000D);
	}
}