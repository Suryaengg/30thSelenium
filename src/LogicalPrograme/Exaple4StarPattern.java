package LogicalPrograme;

public class Exaple4StarPattern 
{

	public static void main(String[] args) {
		
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		
		int col=4;
		
		for (int i = 1; i <=7; i++) 
		{
			
			for (int j = 1; j <=col; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		
		
		if (i<4) 
		{
			col--;
		} 
		else 
		{
			col++;

		}
		
	}
	
}
}
