interface intrf1{
	final static int data=10;
	void show();
}
class InterfaceImplementation implements intrf1{
	public void show(){
		System.out.println("data= "+data);
	}
	public static void main(String[] args) {
		InterfaceImplementation a1=new InterfaceImplementation();
		a1.show();
	}
}