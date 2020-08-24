interface Staff{
	static int sid=10;
	String level="Primary Teacher";
	void displayStaff();
}
class Teacher{
	int tid;
	String subject;
	void setData(int id,String sub){
		tid=id;
		subject=sub;
	}
	void displayTeacher(){
		System.out.println("Teacher ID : "+tid+" Subject : "+subject);
	}
}
class MultipleInheritance extends Teacher implements Staff{
	public void displayStaff(){
		System.out.println("Staff Id : "+sid+" Staff Level : "+level);
	}
	void displayall(){
		displayStaff();
		displayTeacher();
	}
	public static void main(String[] args) {
		MultipleInheritance m1=new MultipleInheritance();
		m1.setData(5,"Science");
		m1.displayall();
	}
}