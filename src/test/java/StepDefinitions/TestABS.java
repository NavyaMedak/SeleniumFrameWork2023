package StepDefinitions;

abstract class Vehicle //Abstract class
{
  public abstract int getNoOfWheels();	 //Abstract method
}
class Bus extends Vehicle //Using child class to implement abstract class method
{
	public int getNoOfWheels()
	{
		return 6;
	}
}

class Auto extends Vehicle
{
	 public int getNoOfWheels()
	 {
	     return 3;
	 }
}

public class TestABS 
{

	public static void main(String[] args) {
	Bus b=new Bus(); // we can create the object to Bus, bcz Bus is not abstract class
	System.out.println(b.getNoOfWheels());
	
	Auto a=new Auto();
	System.out.println(a.getNoOfWheels());

	}

}
