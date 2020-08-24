class Largest3{
	public static void main(String[] args) {
		int a=10,b=15,c=5;
		int max1=(a>b)?a:b;
		int max2=(max1>c)?max1:c;
		System.out.println("Largest of "+a+" "+b+" and "+c+" is "+max2);
	}
}
