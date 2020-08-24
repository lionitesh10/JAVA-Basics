class Student{
	int roll_no;
	long ph_no;
	String address;
	String name;
	Student(int roll_no,long ph_no,String name,String address){
		this.roll_no=roll_no;
		this.ph_no=ph_no;
		this.name=name;
		this.address=address;
	}
	void displaydetail(){
		System.out.println("Roll no : "+roll_no+"\nPhone Number : "+ph_no+"\nAddress : "+address);
	}
	public static void main(String[] args) {
		Student n1=new Student(2,9812345678L,"Sam","Pokhara");
		Student n2=new Student(3,988764563L,"John","Kathmandu");
		Student arr[]={n1,n2};
		for(Student st:arr){
				System.out.println(st.name+" Details");
				st.displaydetail();
		}
			
	}
}