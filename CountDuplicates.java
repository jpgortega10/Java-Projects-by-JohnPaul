import java.util.Scanner;

public class CountDuplicates {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		System.out.println("How many numbers:");
		int amountOfNumbers = io.nextInt();
		
		int[] List = new int[amountOfNumbers]; 
		System.out.println("Enter " + amountOfNumbers + " numbers:");
		for(int i = 0;i<amountOfNumbers;i++)
		{
			List[i] = io.nextInt();
		}
			
		

	}

}
