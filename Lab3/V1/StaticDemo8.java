class StaticDemo8{
	static int count=0;
	StaticDemo8(){
		System.out.println("Object Created !! ");
		increamentCount();
	}
	static void increamentCount(){
		count++;
	}
	public static void main(String[] args) {
			System.out.println("Initial Value of Count = "+count);
			StaticDemo8 st1=new StaticDemo8();
			System.out.println("Value of Count = "+count);
			StaticDemo8 st2=new StaticDemo8();
			System.out.println("Value of Count = "+count);
		}	
}