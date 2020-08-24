class Myclass{
	int a;
}
class DotAccess10{
	public static void main(String[] args) {
		Myclass m1=new Myclass();
		m1.a=20;
		System.out.println("a = "+m1.a);
	}
}