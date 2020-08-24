interface CreateExtendInterface1{
	static int data=10;
}
interface ex1a extends CreateExtendInterface1{
	abstract void display();
}
class CreateExtendInterface implements ex1a{
	public void display(){
		System.out.println("Data : "+data);
	}
	public static void main(String[] args) {
			CreateExtendInterface c1=new CreateExtendInterface();
			c1.display();
	}
}