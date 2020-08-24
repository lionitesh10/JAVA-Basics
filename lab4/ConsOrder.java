class SuperClass{
	SuperClass(){
		System.out.println("Constructor of SuperClass ");
	}
}
class BaseClass1 extends SuperClass{
	BaseClass1(){
		System.out.println("Constructor of BaseClass1 ");
	}
}
class BaseClass2 extends BaseClass1{
	BaseClass2(){
		System.out.println("Constructor of BaseClass2" );
	}
}
class ConsOrder{
	public static void main(String[] args) {
		BaseClass2 b2=new BaseClass2();
	}
}