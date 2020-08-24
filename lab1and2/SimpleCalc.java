import java.util.Scanner;
class SimpleCalc{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of a,b and an operator ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		char op=sc.next().charAt(0);
		switch(op){
			case '+':
				System.out.printf("%d + %d = %d ",a,b,a+b);
				System.out.println("");
				break;
			case '-':
				System.out.printf("%d - %d = %d ",a,b,a-b);
				System.out.println("");
				break;
			case '*':
				System.out.printf("%d * %d = %d ",a,b,a*b);
				System.out.println("");
				break;
			case '/':
				System.out.printf("%d / %d = %d ",a,b,a/b);
				System.out.println("");
				break;
			default:
				System.out.println("Operator Not Recognized...!");
		}
	}
}
