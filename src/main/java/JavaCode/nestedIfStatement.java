package JavaCode;

public class nestedIfStatement {

	public static void main(String[] args) {
		int x=10,y=40;
		if(x>5)
		{
			System.out.println("x is greaterh then 5:"+x);
			if(x>y)
			{
				System.out.println("x is smaller then y:"+y);
			}
			else 
			{
				System.out.println("Default values of x is:"+x);
				System.out.println("Default values of y is:"+y);
			}
			
		
		}

	}

}
