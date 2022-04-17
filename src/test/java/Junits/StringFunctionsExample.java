package Junits;

public class StringFunctionsExample {

	public static boolean isPalindrome(String data)
	{
		
		int length=data.length();
	
		int mid=length/2;
		
		for(int i=0;i<=mid;i++)
			
				{
								
					if(data.charAt(i)!=data.charAt(length-i-1))
					{
						System.out.println("The given text '" + data + "' is not a Palindrome");
						return false;
					}
				
						
		}	
		System.out.println("The given text '"+ data +"' is a Palindrome");
		return true;
		
	}
	

}
