class StudentCons3{
	int id;
	String name;
	StudentCons3(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		StudentCons3 s1=new StudentCons3(1,"Nitesh Sapkota");
		System.out.println("ID = "+s1.id+"\nName = "+s1.name);
	}
}