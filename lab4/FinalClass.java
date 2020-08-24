final class B1{
	void show(){
		System.out.println("Base Class B1 ");
	}
}
class B2 extends B1{
	void show2(){
		System.out.println("Derived Class B2");
	}
}
class FinalClass{
	public static void main(String[] args) {
		B2 bb1=new B2();
		bb1.show();
	}
}