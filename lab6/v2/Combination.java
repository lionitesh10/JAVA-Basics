class CustomException extends Exception{
	CustomException(String msg){
		super(msg);
	}
}
class Combination{
	static void validate(int age) throws CustomException{
		if(age<0)
			throw new CustomException("Age Cannot be Negative ");
		else
			System.out.println("Age is Valid ");
	}
	public static void main(String[] args) {
		try{
			validate(-10);
		}catch(CustomException e){
			System.out.println(e);
		}
	}
}