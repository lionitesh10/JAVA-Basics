import java.util.Scanner;
class DigitsSum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no : ");
		int n=sc.nextInt();
		int a=n;
		int sum=0,r;
		while(n!=0){
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum of digits of "+a+" is "+sum);
	}
}
