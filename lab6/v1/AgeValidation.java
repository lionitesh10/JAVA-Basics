import java.util.Scanner;
class CustomExcep extends Exception{
	CustomExcep(String msg){
		super(msg);
	}
}
class AgeValidation{
	static void systemThrow(int age){
		try{
			if(age>18){
				System.out.println("Age Validated");
			}else{
				throw new Exception("invalid age");
			}
		}catch(Exception e){
			System.out.println("System Exception ..");
			System.out.println(e);
		}
	}
	static void customThrow(int age){
		try{
			if(age>18){
				System.out.println("Age Validated");
			}else{
				throw new CustomExcep("invalid age");
			}
		}catch(CustomExcep e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		systemThrow(age);
		customThrow(age);
	}
}