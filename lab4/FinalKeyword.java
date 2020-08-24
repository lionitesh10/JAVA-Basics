class Gravity{
	final double g=9.8;

	void calculateWeight(double mass){
		double wt=mass*g;
		System.out.println("Your Weight is "+wt);
	}
}
class FinalKeyword{
	public static void main(String[] args) {
		Gravity g1=new Gravity();
		g1.calculateWeight(10.5D);
	}
}