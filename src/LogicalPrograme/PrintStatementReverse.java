package LogicalPrograme;

public class PrintStatementReverse 
{

	public static void main(String[] args) {
		
		String s1 = "my name is abc";
		String[] ar = s1.split(" ");
		
		for (int i = ar.length-1; i>=0; i--) {
			
			System.out.print(ar[i]+" ");
		} 
	}
}
