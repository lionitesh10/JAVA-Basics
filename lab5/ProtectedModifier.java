class Aaa{
	protected int data=20;
}
class Bbb extends Aaa{
	void display(){
		System.out.println("Data : "+data);
	}
}
class ProtectedModifier{
		public static void main(String[] args) {
			Bbb b1=new Bbb();
			b1.display();
		}
}