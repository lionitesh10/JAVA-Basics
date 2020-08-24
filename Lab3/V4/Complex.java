import java.util.Scanner;
class Complex{
	int real,img;
	Complex(int real,int img){
		this.real=real;
		this.img=img;
	}
	void sum(Complex c1){
		int real1=this.real+c1.real;
		int img1=this.img+c1.img;
		System.out.println("Sum = "+real1+"+"+img1+"i");
	}
	void difference(Complex c1){
		int real1=this.real-c1.real;
		int img1=this.img-c1.img;
		System.out.println("Difference = "+real1+"-"+img1+"i");
	}
	void product(Complex c1){
		int real1=this.real*c1.real;
		int img1=this.img*c1.img;
		System.out.println("Product = "+real1+"*"+img1+"i");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter real and Imaginary Number for 1 st object ");
		int real=sc.nextInt();
		int img=sc.nextInt();
		Complex c2=new Complex(real,img);
		System.out.println("Enter real and Imaginary Number for 2 nd object ");
		real=sc.nextInt();
		img=sc.nextInt();
		Complex c3=new Complex(real,img);
		c2.sum(c3);
		c2.difference(c3);
		c2.product(c3);
	}
}