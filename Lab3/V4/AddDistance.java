class AddDistance{
	int ft,inch;
	AddDistance(int ft,int inch){
		this.ft=ft;
		this.inch=inch;
	}
	void add(AddDistance a1){
		int ft1=this.ft+a1.ft;
		int inch1=this.inch+a1.inch;
		System.out.println("Result = "+ft1+" ft and "+inch1+" inch");
	}
	public static void main(String[] args) {
		AddDistance a2=new AddDistance(5,8);
		AddDistance a3=new AddDistance(6,2);
		a2.add(a3);
	}
}