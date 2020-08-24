class Airthmetic{
	int a,b;
	Airthmetic(int a,int b){
		this.a=a;
		this.b=b;
		addition();
		subtraction();
		multiply();
		division();
	}
	void addition(){
		System.out.println("Sum = "+(a+b));
	}
	void subtraction(){
		System.out.println("Difference = "+(a-b));
	}
	void multiply(){
		System.out.println("Product = "+(a*b));
	}
	void division(){
		System.out.println("Division = "+(a/b));
	}
	public static void main(String[] args) {
		Airthmetic a1=new Airthmetic(10,5);
		Airthmetic a2=new Airthmetic(15,3);
	}
}