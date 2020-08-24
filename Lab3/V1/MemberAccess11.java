class Myclass2{
	int a;
	void setA(int a){
		this.a=a;
	}
	int getA(){
		return a;
	}
}
class MemberAccess11{
	public static void main(String[] args) {
		Myclass2 m2=new Myclass2();
		m2.setA(10);
		System.out.println("a = "+m2.getA());	
	}
}