import java.util.Scanner;
class NotMathchException extends Exception{
	NotMathchException(String msg){
		super(msg);
	}
}
class Nepal{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str=sc.next();
		try{
			if(!str.equals("Nepal"))
				throw new NotMathchException("String doesnot equals to Nepal ");
		}catch(NotMathchException e){
			System.out.println(e);
		}
	}
}