class A1{
	final void show(){
		System.out.println("Final Method !!! ");
	}
}
class A2 extends A1{
	void show(){
		System.out.println("Overridden Prohibited !!! ");
	}
}
class FinalOvr{
	public static void main(String[] args) {
		A1 a2=new A1();
		a2.show();
		A2 a3=new A2();
		a3.show();
	}
}