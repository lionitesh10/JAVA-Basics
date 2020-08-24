class Base1{
	int data;
	Base1(){
		data=20;
	}
	void displayBase(){
		System.out.println("From Base Class "+data);
	}
}
class Derived1 extends Base1{
	int data2;
	Derived1(){
		data2=40;
	}
	void displayDerived1(){
		System.out.println("From Derived1 class "+data2+"\nOf Base Class "+data);
	}
}
class Derived2 extends Derived1{
	int data3;
	Derived2(){
		data3=60;
	}
	void displayDerived2(){
		System.out.println("From Derived2 Class "+data3+"\nFrom Derived1 class "+data2+"\nOf Base Class "+data);
	}	
}
class MultiLevelInheritance{
	public static void main(String[] args) {
		Base1 b1=new Base1();
		b1.displayBase();
		Derived1 d1=new Derived1();
		d1.displayDerived1();
		Derived2 d2=new Derived2();
		d2.displayDerived2();
	}
}