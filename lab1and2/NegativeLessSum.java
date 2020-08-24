import java.util.Scanner;
class NegativeLessSum{
	public static void main(String[] args) {
		int arr[]={1,2,3,-1,4};
		int sum=0,i;
		for(i=0;i<5;i++){
			if(arr[i]<0){
				break;
			}else{
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of previous Elements before Negative Elements is "+sum);
	
	}
}
