class Room{
	double length,breadth,height;
	Room(double length,double breadth,double height){
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
		Room r1=new Room(11.5D,11.5D,10.5D);
		System.out.println("Room : Area = "+r1.area()+"\nVolume = "+r1.volume()); 
	}
}