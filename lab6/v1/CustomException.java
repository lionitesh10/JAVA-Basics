class OwnException extends Exception{
	OwnException(String msg){
		super(msg);
	}
}
class CustomException{
	public static void main(String[] args) {
		String username="Nitesh";
		try{
			if(username.length()<8)
				throw new OwnException("Username should be greater than 8");
		}catch(OwnException e){
			System.out.println(e.getMessage());
		}
	}
}