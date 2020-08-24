class ExceptionPropagations{ 
	void divide() throws ArithmeticException{ 
		System.out.println("Ans = "+(10/0));
	} 
	void calldivide(){ 
		divide(); 
	} 
	void handler(){ 
		try{ 
			calldivide(); 
		}catch(Exception e) { 
			System.out.println("Exception handled \n"+e); 
		} 
	} 
	public static void main(String args[]) { 
		ExceptionPropagations e1=new ExceptionPropagations();
		e1.handler();
	} 
} 
