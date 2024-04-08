package StepDefinitions;


class Animal{
	String color="yellow";
	void add()
	{
		int z=10;
		System.out.println(z);
	}
}
class Dog extends Animal{
	String color="white";
     void printColor()
     {
    	 System.out.println(color);
    	 System.out.println(super.color); //calling immediate parent class objects
    	 super.add(); //calling immediate parent class methods.
     }
}

public class Super {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.printColor();

	}

}
