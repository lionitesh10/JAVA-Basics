class ReversePrint{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		System.out.println("Printing Array Elements in Reverse : ");
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}