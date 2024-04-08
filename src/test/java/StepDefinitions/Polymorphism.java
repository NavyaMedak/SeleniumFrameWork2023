package StepDefinitions;
class Bank
{
	float getRateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 8.4f;
	}
}

class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 7.3f;
	}
	
}

class AXIX extends Bank
{
	float getRateOfInterest()
	{
		return 6.9f;
	}
}


public class Polymorphism {
	
	
	public static void main(String[] args)
	{
		Bank b=new Bank();
		System.out.println("SBI Rate of Interest is: "+b.getRateOfInterest());
		b=new SBI();
		System.out.println("SBI Rate of Interest is: "+b.getRateOfInterest());
		b=new ICICI();
		System.out.println("SBI Rate of Interest is: "+b.getRateOfInterest());
		b=new AXIX();
		System.out.println("SBI Rate of Interest is: "+b.getRateOfInterest());
	}

}
