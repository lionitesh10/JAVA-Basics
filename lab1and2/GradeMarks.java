import java.util.Scanner;
class GradeMarks{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mark of student");
		double marks=sc.nextDouble();
		if(marks>100){
			System.out.println("Sorry ! Enter Valid Marks : ");
		}else if(marks<0){
			System.out.println("Sorry ! Enter Valid Marks : ");
		}else{
			if(marks>=80){
				System.out.println("Distinction..");
			}else if(marks>=60 && marks<80){
				System.out.println("First Division..");
			}else if(marks>=50 && marks<60){
				System.out.println("Second Division..");
			}else if(marks>=32 && marks<50){
				System.out.println("Third Division..");
			}else{
				System.out.println("Fail..");
			}
		}
	}
}

