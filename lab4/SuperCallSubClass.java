class MainBase{
	int a,b;
	MainBase(int a,int b){
		this.a=a;
		this.b=b;
	}
}
class SubBase extends MainBase{
	int c;
	SubBase(int a,int b,int c){
		super(a,b);
		this.c=c;
	}
	void sum(){
		System.out.println("Sum = "+(a+b+c));
	}
}
class SuperCallSubClass{
	public static void main(String[] args) {
		SubBase sb1=new SubBase(1,2,3);
		sb1.sum();
	}
}