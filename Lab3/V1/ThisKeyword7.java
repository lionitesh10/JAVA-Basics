class ThisKeyword7{
	int a,b;
	ThisKeyword7(int a,int b){
		this.a=a;
		this.b=b;
	}
	void sum(){
		System.out.println("Sum = "+(a+b));
	}
	public static void main(String[] args) {
		ThisKeyword7 k1=new ThisKeyword7(5,10);
		k1.sum();
	}
}