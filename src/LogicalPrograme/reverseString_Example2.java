package LogicalPrograme;

public class reverseString_Example2 
{

	public static void main(String[] args) 
	{
		
		String s1 = "My Name is abc";  //ym eman si cba
		
		String[] ar = s1.split(" ");
		
		                //1<=3
		         // 0   0<=3
		for (int i = 0; i <=ar.length-1; i++)   
		{
			String org = ar[i]; // 0 my  0 1   1name  0123
			
			String rev=""; //y   ym
	
			              //3           3>=0
			             //0            0>=0
			             //2-1=1           1>=0
			for (int j =org.length()-1; j>=0; j--) 
			{
				
				//""+e                   //e
				// y+m                  //ym
				//  "" +y
				rev=rev+org.charAt(j); //y
			}
			
			                //ym+" "
			System.out.print(rev+" ");  //ym 
		}
	}
}
