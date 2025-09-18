import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a number");
		int numOne = sc.nextInt();
		
		System.out.println("Input a number");
		int numTwo = sc.nextInt();
		
		System.out.println("Do you want to +, -, *, or / ?");
		String operand = sc.next();
		
		int Total=0;
		
		if(operand.equals("+"))
			Total = numOne+numTwo;
		else if(operand.equals("-"))
			Total = numOne-numTwo;
		else if(operand.equals("*"))
			Total = numOne*numTwo;
		else if(operand.equals("/"))
		{
			if(numTwo!=0)
				Total = numOne/numTwo;
			else
				System.out.println("restart program");
		}
		else
			System.out.println("restart program");
			
		System.out.println("This is your solution: " + Total);
		
		sc.close();
		
		
		
	}

}
