class Rectangle{
	double length,breadth;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double getArea(){
		return length*breadth;
	}
	double getPerimeter(){
		return 2*(length+breadth);
	}
}
class Rectangle7{
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(5.5D,6.5D);
		System.out.println("Area of Rectangle is "+r1.getArea()+" and Perimeter is "+r1.getPerimeter());
	}
}