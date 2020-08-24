import java.util.Scanner;
class ReverseNo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no : ");
		int n=sc.nextInt();
		int a=n;
		int sum=0,rev=0,r;
		while(n!=0){
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reverse of "+a+" is "+rev);
	}
}
