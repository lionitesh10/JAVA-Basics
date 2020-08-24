import java.util.Scanner;
class Area{
	int length,breadth;
	void setDim(int l,int b){
		length=l;
		breadth=b;
	}
	int getArea(){
		return length*breadth;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Area a1=new Area();
		System.out.println("Enter length and breadth of rectangle : ");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		a1.setDim(length,breadth);
		System.out.println("Area of rectangle is "+a1.getArea());
	}
}