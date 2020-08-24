import java.util.Scanner;
class AgeNotWithinRangeException extends Exception{
	AgeNotWithinRangeException(String msg){
		super(msg);
	}
}
class NameNotValidException extends Exception{
	NameNotValidException(String msg){
		super(msg);
	}
}
class Student{
	int roll_no,age;
	String name,course;
	boolean nameValidation(String name){
		boolean flag1=true,flag2=true;
		boolean flag;
		String no_arr[]={"0","1","2","3","4","5","6","7","8","9"};
		String symbols[]={"~","!","@","#","$","%","^","&","*","(",")","_","-",",",";","[","]","{","}",".","?","/"};
		for(int i=0;i<no_arr.length;i++){
			if(name.contains(no_arr[i]))
				flag1=false;
		}
		for(int i=0;i<symbols.length;i++){
			if(name.contains(symbols[i]))
				flag2=false;
		}
		flag=flag1 & flag2;
		return flag;
	}
	Student(int roll_no,String name,int age,String course){
		try{
			if(age>15 & age<21){
				try{
					if(nameValidation(name)){
						this.roll_no=roll_no;
						this.name=name;
						this.age=age;
						this.course=course;
					}else{
						throw new NameNotValidException("Name contains numbers or special symbols");
					}
				}catch(NameNotValidException e){
					System.out.println(e);
				}
			}else{
				throw new AgeNotWithinRangeException("Age is not within the range 15 and 21"); 
			}
		}catch(AgeNotWithinRangeException e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no, name , age and course ");
		int roll_no=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();
		String course=sc.next();
		Student s1=new Student(roll_no,name,age,course);
	}
}