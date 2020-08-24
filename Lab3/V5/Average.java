import java.util.Scanner;
class Average{
	float a,b,c;
	float avg;
	Average(float a,float b,float c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void calculate(){
		avg=(a+b+c)/3;
	}
	void printAverage(){
		System.out.println("The Average is "+avg);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 nos ");
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		Average a1=new Average(a,b,c);
		a1.calculate();
		a1.printAverage();
	}
}