package check_Palindrome;

import java.util.Scanner;
/*
	Write a recursive function that checks whether string A is a palindrome or Not.
	
	Return 1 if the string A is a palindrome, else return 0.
	
	Note: A palindrome is a string that's the same when read forward and backward.
	
	
	Input 1:
	A = "naman"
	
	Input 2:
	A = "strings"
	
	
	
	Example Output
	
	Output 1:
	1
	
	Output 2:
	0
*/
public class Check_Palindrome {
	
	private static boolean is_palindrome(String s,int start,int end) {
		
		if(start>end)
		{
			return true;
		}
		if(s.charAt(start)!=s.charAt(end))
		{
			return false;
		}
		
		return is_palindrome(s,start+1,end-1);
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		System.out.println(is_palindrome(s,0,s.length()-1));
	}

	

}
