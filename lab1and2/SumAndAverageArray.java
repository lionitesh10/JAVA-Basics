class SumAndAverageArray{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int sum=0;
		double avg;
		for(int i=0;i<5;i++){
			sum=sum+arr[i];
		}
		avg=sum/5;
		System.out.printf("Sum = %d and Average = %f",sum,avg);
	}
}
