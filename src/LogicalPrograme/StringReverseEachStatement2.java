package LogicalPrograme;

public class StringReverseEachStatement2 
{

	public static void main(String[] args) 
	{
		String s1 = "MY NAME IS SURESH";
		String[] ar = s1.split(" ");  //my0  name1  is2  suresh3
		//String rev = "";  //ym 

		for (String eachword : ar) 
		{
			
			String rev = "";
			      //name         4-1=3         3>=0
                                               // 0>=0
			      //my           2-1=1          1>=0      
			for (int i = eachword.length() - 1; i >= 0; i--) 
			{

				
				//    
				      //y+m=ym
				      //""+y=y
				rev = rev + eachword.charAt(i);
				
			}
			      //ym
			      //y+""
			//rev = rev + " ";
			System.out.print(rev+" ");

		}
		//System.out.println(s1);
		//System.out.println(rev);

	}

}