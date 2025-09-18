//Array Reversal
//reverse an input from the user by utilizing an array
import java.util.Scanner;

public class ArrayReversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("How many numbers?");
		int amountOfNumbers = sc.nextInt();
		int[] arrayInput = new int[amountOfNumbers];
		
		System.out.println("Enter "+ amountOfNumbers + " numbers:");
		for(int i = 0;i<amountOfNumbers;i++)
			arrayInput[i] = sc.nextInt();
		
		int temp;
		for(int i = 0;i<amountOfNumbers/2;i++)
		{
			temp = arrayInput[i];
			arrayInput[i] = arrayInput[amountOfNumbers-1-i];
			arrayInput[amountOfNumbers-1-i] = temp;
		}
		System.out.println("Reversed array:");
		
		for(int i=0;i<amountOfNumbers;i++)
			System.out.print(arrayInput[i]+" ");
	
		sc.close();
	}

}
