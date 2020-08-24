class Box{
	double length,breadth,height;
	Box(double length,double breadth,double height){
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	double area(){
		return 2*((length*breadth)+(breadth*height)+(length*height));
	}
	double volume(){
		return length*breadth*height;
	}
	public static void main(String[] args) {
		Box b1=new Box(5.5D,6.5D,7.5D);
		System.out.println("Area = "+b1.area()+"\nVolume = "+b1.volume()); 
	}
}