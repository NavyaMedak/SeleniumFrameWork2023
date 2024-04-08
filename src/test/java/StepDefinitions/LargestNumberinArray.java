package StepDefinitions;

public class LargestNumberinArray {

	public static void main(String[] args) {
	
		int[] arr= {10,20,30,4};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Larget valu in array is:"+max);
		
		
		
		
		
		
}
}
