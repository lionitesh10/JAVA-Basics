class FinallyExcep{
	public static void main(String[] args) {
		int arr[]={10,15};
		try{
			int result=arr[0]/arr[2];
			System.out.println("Result = "+result);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}catch(ArrayStoreException e){
			System.out.println(e.getMessage());
		}
		finally{
			int result=arr[0]/5;
			System.out.println("Result = "+result);
		}
	}
}