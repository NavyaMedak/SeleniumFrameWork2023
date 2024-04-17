package StepDefinitions;

public class ReverseOfEachChar2 {
	 static void reverseEachWordOfString(String inputString)
	{
		String[] words=inputString.split(" ");
		String revString="";	
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseWord=" ";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+word.charAt(j);
			}
			revString=revString+reverseWord+" ";
		}
		System.out.println(revString);
	}
	public static void main(String[] args)
	{
		reverseEachWordOfString("I am Good With java");
	}	
}