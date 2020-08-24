class ThrowDemo{
	public static void main(String[] args) {
		try{
			int a=10/0;
			throw new ArithmeticException("Divide by Zero Not Computable ");
		}catch(ArithmeticException e){
			System.out.println("Exception Thrown by Throw Keyword\n"+e);

		}
	}
}