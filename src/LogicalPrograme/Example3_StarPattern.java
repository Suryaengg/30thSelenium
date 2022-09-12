package LogicalPrograme;

public class Example3_StarPattern 
{

	public static void main(String[] args) 
	{
		
		//1234 No of Columns
		//****1Row
		//****2Row
		
		//Calculate Total No of Rows&Columns
		//No of Rows=2
		//No of Columns=4
		
		for (int i = 1; i <=2; i++) //For loop for Rows
		{
			
			for (int j = 1; j <=4; j++) //For loop for Columns
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}

