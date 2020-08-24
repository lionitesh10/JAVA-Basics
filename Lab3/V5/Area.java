import java.util.Scanner;
class Area{
	int length,breadth;
	Area(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	int returnArea(){
		return length*breadth;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of a rectangle : ");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		Area a1=new Area(length,breadth);
		System.out.println("Area is "+a1.returnArea());
	}
}