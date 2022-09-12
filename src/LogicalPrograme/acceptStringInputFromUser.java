package LogicalPrograme;

import java.util.Scanner;

public class acceptStringInputFromUser 
{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("student name: ");
		String s1 = scan.next();
		System.out.println(s1.length());
	}
}

