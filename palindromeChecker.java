import java.util.Scanner;

public class palindromeChecker {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.println("Enter a word please:");
		String word = io.nextLine();
		
		boolean palindrome = true;
		
		for(int i =0;i<word.length();i++)
		{
				if(word.charAt(i)!=word.charAt(word.length()-1-i))
				{
					palindrome = false;
					break;
				}
				else
					palindrome = true;
		}
		if(palindrome)
			System.out.println("This word is a palindrome");
		else
			System.out.println("This word is not a palindrome");
		
		
		
		

	}

}
