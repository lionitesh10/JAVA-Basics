import java.util.Scanner;
class CountDigits{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no : ");
		int counter=0;
		int n=sc.nextInt();
		int a=n;
		while(n!=0){
			n=n/10;
			counter++;
		}
		System.out.println("No of digits in "+a+" is "+counter);
	}
}
