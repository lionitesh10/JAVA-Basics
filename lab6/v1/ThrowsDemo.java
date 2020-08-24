class ThrowsDemo{
	static void divide(int a,int b) throws ArithmeticException{
		System.out.println("Ans = "+(a/b)); 
	}
	public static void main(String[] args) {
		try{
			divide(10,0);
		}catch(ArithmeticException e){
			System.out.println("Exception "+e.getMessage());
		}
	}
}