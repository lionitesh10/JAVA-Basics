class StudentN{
	int roll_no;
	String name;
	StudentN(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
	}
	public static void main(String[] args) {
		StudentN n1=new StudentN(2,"John");
		System.out.println("Roll no : "+n1.roll_no+"\nName : "+n1.name);
	}
}