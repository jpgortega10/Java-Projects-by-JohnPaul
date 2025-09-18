import java.util.Scanner;
public class TwoSumProblem {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		//Gets how many numbers are going to be inputed 
		System.out.print("How many numbers? ");
		int amountOfNumbers = io.nextInt();
		int[] userNumbers = new int[amountOfNumbers];
		int targetSum = 0;
		
		//Gets all the numbers the user wants to input
		System.out.print("Enter" + amountOfNumbers + "numbers: ");
		for(int i = 0;i<amountOfNumbers;i++)
			userNumbers[i] = io.nextInt();
		
		//Gets desired target sum
		System.out.print("Enter target: ");
		targetSum = io.nextInt();
		
		
		
			
		

	}

}
