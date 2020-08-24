class Rectangle{
	int length,breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	int Area(){
		return length*breadth;
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(4,5);
		Rectangle r2=new Rectangle(5,8);
		System.out.println("Area of r1 is "+r1.Area());
		System.out.println("Area of r2 is "+r2.Area());
	}
}