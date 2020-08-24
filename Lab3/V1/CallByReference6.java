class SwapRef{
	int i,j;
	SwapRef(int a,int b){
		i=a;
		j=b;
	}
	void SwapValue(SwapRef s1){
		int temp;
		temp=s1.i;
		s1.i=s1.j;
		s1.j=temp;
	}
}
class CallByReference6{
	public static void main(String[] args) {
		int a=5,b=10;
        SwapRef s1=new SwapRef(a,b);
        System.out.println("Before Swapping a = "+s1.i+" b = "+s1.j);
        s1.SwapValue(s1);
        System.out.println("After Swapping a = "+s1.i+" b = "+s1.j);
	}
}