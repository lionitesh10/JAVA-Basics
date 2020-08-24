class Mobile{
	int price;
	void setPrice(){
		price=15000;
	}
	void display(){
		System.out.println("Price of Mobile is "+price);
	}
}
class Samsung extends Mobile{
	void display(){
		System.out.println("Average price of mobile "+price);
		System.out.println("New Samsung Price = "+(price+5000));
	}
}
class MethodOverriding{
	public static void main(String[] args) {
		Samsung s1=new Samsung();
		s1.setPrice();
		s1.display();
	}
}