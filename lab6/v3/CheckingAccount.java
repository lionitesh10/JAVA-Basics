class InsufficientFundsException extends Exception{
	InsufficientFundsException(String msg){
		super(msg);
	}
}
class CheckingAccount{
	long acno;
	double balance;
	CheckingAccount(long acno,double balance){
		this.acno=acno;
		this.balance=balance;
	}
	void deposit(double newblnc){
		balance+=newblnc;
	}
	void withdraw(double wblnc) throws InsufficientFundsException{
		if(wblnc>balance){
			throw new InsufficientFundsException("Funds are insuffient to withdraw from your Account ");
		}else{
			balance-=wblnc;
			displaybln();
			System.out.println("After Withdraw");
		}
	}
	void displaybln(){
		System.out.println("Your Balance is "+balance);
	}
	public static void main(String[] args){
		CheckingAccount a1=new CheckingAccount(1122334455667788L,25000D);
		a1.displaybln();
		a1.deposit(15000D);
		try{
			a1.withdraw(100000D);
		}catch(InsufficientFundsException e){
			System.out.println(e);
		}
	}
}
