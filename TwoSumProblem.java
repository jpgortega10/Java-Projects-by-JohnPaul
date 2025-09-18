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
		System.out.print("Enter " + amountOfNumbers + " numbers: ");
		for(int i = 0;i<amountOfNumbers;i++)
			userNumbers[i] = io.nextInt();
		
		//Gets desired target sum
		System.out.print("Enter target: ");
		targetSum = io.nextInt();
		
		int tempSum=0,markerOne=0,markerTwo=0,numberOne=0,numberTwo = 0;
		boolean match = false;
		
		for(int i=0;i<amountOfNumbers;i++)
		{
			for(int j=i+1;j<amountOfNumbers;j++)
			{
				tempSum = userNumbers[i]+userNumbers[j];
				
				if(tempSum==targetSum)
					{
						markerOne=i;
						markerTwo=j;
						numberOne=userNumbers[i];
						numberTwo=userNumbers[j];
						match = true;
						break;
					}
			}
			if(match)
				break;
		}
		if(match)
			System.out.println("Numbers found at indicies " + markerOne + " and " + markerTwo + " (" + numberOne + " + " + numberTwo + ") = " + targetSum);
		else
			System.out.println("No pair found for target");
		
		io.close();
	}

}
