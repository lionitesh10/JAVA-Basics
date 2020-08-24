class SumExceptPosition{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			if(i==5){
				continue;
			}else{
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum except Element at position 5 is "+sum);
	}
}
