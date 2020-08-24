class Student{
	public static void main(String[] args) {
		int age=10,weight=30;
		try{
			if(age<12 & weight<40)
				throw new ArithmeticException("Student is not eligible for registration");
			else
				System.out.println("Student is eligible");
		}catch(ArithmeticException e){
			System.out.println(e);
		}		
	}
}