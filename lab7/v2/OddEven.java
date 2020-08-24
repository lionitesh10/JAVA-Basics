class OddEven{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		System.out.println("Printing Odd Elements from Array ");
		for(int i:arr){
			if(!(i%2==0))
				System.out.println(i);
		}
		System.out.println("Printing Even Elements from Array ");
		for(int i:arr){
			if(i%2==0)
				System.out.println(i);
		}
	}
}