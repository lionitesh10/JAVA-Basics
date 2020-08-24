import java.util.Scanner;
class Armstrong{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no : ");
		int n=sc.nextInt();
		int a=n;
		int sum=0,rev=0,r;
		while(n!=0){
			r=n%10;
			rev+=r*r*r;
			n=n/10;
		}
		if(a==rev){
			System.out.println("Armstrong ...");
		}else{
			System.out.println("Not Armstrong ...");
		}
	}
}
