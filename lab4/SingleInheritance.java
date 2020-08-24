class Base{
	int data;
	Base(){
		data=10;
	}
	void displayBase(){
		System.out.println("Data from Base Class "+data);
	}
}
class Derived extends Base{
	void displayDerived(){
		System.out.println("Data accessed in derived class "+data);
	}
}
class SingleInheritance{
	public static void main(String[] args) {
		Base b1=new Base();
		b1.displayBase();
		Derived d1=new Derived();
		d1.displayDerived();
	}
}