class EmployeeCons6{
	int id,age;
	String name;
	double salary;
	EmployeeCons6(int id,String name,int age,double salary){
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public static void main(String[] args) {
		EmployeeCons6 e6=new EmployeeCons6(1,"Nitesh Sapkota",21,25000D);
		System.out.println("ID = "+e6.id+"\nName = "+e6.name+"\nAge = "+e6.age+"\nSalary = "+e6.salary);
	}
}