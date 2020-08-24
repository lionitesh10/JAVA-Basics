import java.util.Scanner;
class SearchArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		System.out.println("Enter value to be searched ");
		int value=sc.nextInt();
		int result=search(arr,value);
		if(result==-1){
			System.out.println("Sorry! Result Not Found ");
		}else{
			System.out.println(value+" is at "+result+" position");
		}

	}
	static int search(int[] arr,int value){
		int id=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				id=i;
				break;
			}
		}
		return id;
	}
}
