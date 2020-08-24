class TryCatch{
	public static void main(String[] args) {
		try{
			System.out.println("Division : "+(5/0));
		}catch(ArithmeticException e){
			System.out.println("Division by 0 not allowed");
		}
	}
}