class A1{
	private int data=20;
	void display(){
		System.out.println("Data : "+data);
	}
}

class PrivateModifier{
	public static void main(String[] args) {
		A1 aa1=new A1();
		//Compile Time Error : System.out.println("Data : "+aa1.data);
		aa1.display();
	}
}