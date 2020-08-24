class Swap{
	void SwapValue(int a,int b){
		int temp=a;
		a=b;
		b=temp;
	}
}
class CallByValue5 {
    public static void main(String[] args) {
        int a=5,b=10;
        System.out.println("Before Swapping a = "+a+" b = "+b);
        Swap s1=new Swap();
        s1.SwapValue(a,b);
        System.out.println("After Swapping a = "+a+" b = "+b);
    }
}