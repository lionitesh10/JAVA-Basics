class Animal{
	int noOflegs;
	Animal(){
		noOflegs=4;
	}
	void displayAnimal(){
		System.out.println("Animal has commonly "+noOflegs+" legs");
	}
}
class Tiger extends Animal{
	String sound="roar";
	void displayTiger(){
		System.out.println("Tiger has "+noOflegs+" legs");
		System.out.println("Tiger "+sound);
	}
}
class Dog extends Animal{
	String sound="bark";
	void displayDog(){
		System.out.println("Dog has "+noOflegs+" legs");
		System.out.println("Dog "+sound);
	}
}
class HierarchicalInheritance{
	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.displayAnimal();
		Tiger t1=new Tiger();
		t1.displayTiger();
		Dog d1=new Dog();
		d1.displayDog();
	}
}