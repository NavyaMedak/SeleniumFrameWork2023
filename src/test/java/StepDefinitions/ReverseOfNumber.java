package StepDefinitions;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int number=2345;
		int temp=number;
		int rev=0;
		int rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;	
		}
		System.out.println("Reverse of String is:"+rev);
		

	}

}
