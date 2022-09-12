package LogicalPrograme;

public class StringReverse 
{

	public static void main(String[] args) 
	{
		
	
	 String org  =  "abcd";
	 
	 String rev = "";
	 
	 //Reverse For loop
	 
	 for(int i=org.length()-1;  i>=0;  i--)
	 {
		 
		 rev=rev+org.charAt(i);
	 
	 } 


     System.out.println(org);     // Printing the original String
     
     System.out.println(rev); // Printing the reversed String
	}
}
