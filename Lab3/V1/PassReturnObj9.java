class PassReturnObj9{
	int a;
	PassReturnObj9(int a){
		this.a=a;
	}
	PassReturnObj9 addFive(PassReturnObj9 obj1){
		obj1.a=obj1.a+5;
		return obj1;
	}
	public static void main(String[] args) {
	 	PassReturnObj9 ob1=new PassReturnObj9(5);
	 	System.out.println(" Value of a = "+ob1.a);
	 	PassReturnObj9 ob2=ob1.addFive(ob1);
	 	System.out.println(" Value of a as from returned Object = "+ob2.a);
	 } 
}