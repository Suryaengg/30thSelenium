package LogicalPrograme;

public class Example5_StarPattern 
{

	//   *
	//  ***
	// *****
	//*******
	// *****
	//  ***
	//   *
	
	public static void main(String[] args) 
	{
		
		int star=4;
		//int space=2;
		
		for (int i = 1; i <=7; i++) 
		{
			
//			for (int j = 1; j <=space; j++) 
//			{
//				System.out.print(" ");
//			}
			
			for (int j = 1; j <=star; j++) 
			{
				
				System.out.print("*");
			}
			
			System.out.println();
			
			if (i<4) 
			{
				//space=space-2;
				star=star+2;
			} 
			else 
			{

				//space=space+2;
				star=star-2;
			}
		}
	}
}
