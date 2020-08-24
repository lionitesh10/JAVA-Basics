class StudentMemFunc2{
	int id;
	String name;
	void setData(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		StudentMemFunc2 s1=new StudentMemFunc2();
		s1.setData(1,"Nitesh Sapkota");
		System.out.println("ID = "+s1.id+"\nName = "+s1.name);
	}
}