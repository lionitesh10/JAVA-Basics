class EvenPosition{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Printing elements of an array present in Even Positions ");
		for(int i=0;i<arr.length;i++){
			if(i%2==0)
				System.out.println(arr[i]);
		}
	}
}