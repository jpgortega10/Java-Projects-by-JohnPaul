import java.util.Scanner;

public class palindromeChecker {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		System.out.println("Enter a word please:");
		String word = io.nextLine();
		for(int i =0;i<word.length();i++)
		{
			for(int j = word.length();j>0;j++)
				if(word.charAt(i)==word.charAt(j))
				{
					System.out.println("palindrome");
					break;
				}
		}
		
		
		
		

	}

}
