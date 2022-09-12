package LogicalPrograme;

public class Pallindrome 
{

	public static void main(String[] args) {
		
		String org = "radar";
		String rev = "";
		
		for (int i=org.length()-1; i>=0; i--) 
		{
			
			rev=rev+org.charAt(i);
		}
		//System.out.println(org);
		//System.out.println(rev);
		
		if (org.equals(rev)) 
		{
			
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}
	}
}
