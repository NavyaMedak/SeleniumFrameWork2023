package StepDefinitions;

class Student{
	int rollno;
	String Name;
	float fee;
   Student(int rollno, String Name,float fee) //Parametired consturctor
   {
	   this.rollno=rollno;  //by using this keyword we can call current class instance variable.
	   this.Name=Name;
	   this.fee=fee;
   }
		
	void display()
	{
		System.out.println(rollno+" "+Name+" "+fee+" ");
	}
	
}
public class JavaThisKeyword {

	public static void main(String[] args) {
		Student s1=new Student(101,"Shivva",3000f);
		s1.display();
		

	}

}
