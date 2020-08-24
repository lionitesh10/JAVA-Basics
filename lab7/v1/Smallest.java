class Smallest{
	public static void main(String[] args) {
		int arr[]={10,9,8,7,6,5,4,3,2,1};
		int min=arr[0];
		for(int i:arr){
			if(i<min)
				min=i;
		}
		System.out.println("Smallest Element in this Array is : "+min);
	}
}