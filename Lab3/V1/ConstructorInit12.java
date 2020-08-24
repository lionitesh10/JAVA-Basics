class Myclass3{
	int a;
	Myclass3(int a){
		this.a=a;
		System.out.println("Object is Initialized Automatically !! ");
	}
	int getA(){
		return a;
	}
}
class ConstructorInit12{
	public static void main(String[] args) {
		Myclass3 m2=new Myclass3(5);
		System.out.println("a = "+m2.getA());
	}
}