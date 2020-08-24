import java.util.Scanner;
class RsPaisa{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount in Rupees .. ");
		double rs=sc.nextDouble();
		System.out.println("In Paisa "+(int)(rs*100));
	}
}
