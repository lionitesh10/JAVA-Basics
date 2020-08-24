class EmployeeMemFunc5{
	int id,age;
	String name;
	double salary;
	void setData(int id,String name,int age,double salary){
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public static void main(String[] args) {
		EmployeeMemFunc5 e5=new EmployeeMemFunc5();
		e5.setData(1,"Nitesh Sapkota",21,25000D);
		System.out.println("ID = "+e5.id+"\nName = "+e5.name+"\nAge = "+e5.age+"\nSalary = "+e5.salary);
	}
}