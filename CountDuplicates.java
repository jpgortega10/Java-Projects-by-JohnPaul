import java.util.Scanner;

public class CountDuplicates {

	public static void main(String[] args) 
	{
		Scanner io = new Scanner(System.in);
		
		//Establishing how many numbers we are utilizing
		System.out.println("How many numbers:");
		int amountOfNumbers = io.nextInt();
		
		//Initialization of arrays
		int[] List = new int[amountOfNumbers]; 
		boolean[]Visited = new boolean[amountOfNumbers];
		
		System.out.println("Enter " + amountOfNumbers + " numbers:");
		//Entering numbers into an array
		for(int i = 0;i<amountOfNumbers;i++)
		{
			List[i] = io.nextInt();
			Visited[i] = false;
		}
		
		//make two for loops to pick a number and then count how many times it appears
		int count = 0;
		for(int i = 0;i<amountOfNumbers;i++)
		{
			if(!Visited[i])
			{
				for(int j = 0;j<amountOfNumbers;j++)
				{
					if(List[i]==(List[j]))
					{
						count++;
						Visited[j] = true;
					}
				}
				System.out.println(List[i]+" appears " + count + " times");
			}
			count = 0;
		}	
	}
}
