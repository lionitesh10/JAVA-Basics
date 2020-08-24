class Triangle{
	double l,b,h;
	Triangle(){
		l=3;
		b=4;
		h=5;
	}
	double area(){
		return 0.5*b*h;
	}
	double perimeter(){
		return l+b+h;
	}
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		System.out.println("Area = "+t1.area()+"\nPerimeter = "+t1.perimeter());
	}
}