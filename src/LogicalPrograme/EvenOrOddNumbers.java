package LogicalPrograme;

import java.util.Scanner;

public class EvenOrOddNumbers 
{

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Num: ");
		int num = scan.nextInt();
		//int num = 5;
		
		if (num%2==0) 
		{
			
			System.out.println("Even");
		} 
		else 
		{

			System.out.println("Odd");
		}
	}
}
