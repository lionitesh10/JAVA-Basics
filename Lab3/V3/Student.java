class Student{
	String name;
	Student(){
		name="unknown";
	}
	Student(String name){
		this.name=name;
	}
	void printName(){
		System.out.println("Name = "+name);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.printName();
		Student s2=new Student("Nitesh Sapkota");
		s2.printName();
	}
}