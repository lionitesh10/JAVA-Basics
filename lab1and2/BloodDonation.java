import java.util.Scanner;
class BloodDonation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age and weight ");
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>=18 && weight>=50){
			System.out.println("You can Donate Blood ");
		}else{
			System.out.println("Sorry!! You Cannot Donate Blood ");
		}
	}
}
