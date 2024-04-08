package StepDefinitions;

public class DuplicateString {

	public static void main(String[] args) {
		String s="Shivva Naresh";
		int len=s.length();
		char[] str=s.toCharArray();
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println(str[j]);
				}
			}
			
		}

	}

}
