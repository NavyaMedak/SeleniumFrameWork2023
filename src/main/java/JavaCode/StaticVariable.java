package JavaCode;

public class StaticVariable {

	 static int m=100;
	void Mul() 
	{
		int i=10;
		System.out.println("Local Variable: "+ i);
		System.out.println("Static Variable: "+ m);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=200;
		System.out.println("Instance Variable : "+ j);
		System.out.println("Static Variable: "+ m);
		StaticVariable s=new StaticVariable();
		s.Mul();

	}

}
