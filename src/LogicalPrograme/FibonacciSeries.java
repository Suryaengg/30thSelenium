package LogicalPrograme;

public class FibonacciSeries 
{

	
		  public static void main(String[] args) {

		    int n = 8; 
		    int firstTerm = 0;   //1  //1   //2  //3  //5  //8   //13   //21
		    int secondTerm = 1;  //1  //2   //3  //5  //8  //13  //21   //33
		     
		    System.out.println("Fibonacci Series till 8 terms:");
		     
		    // 9<=8  Condition False, Loop Breaks
		                 // 8<=8
		                 // 7<=8
		                 // 6<=8
		                //  5<=8
		               //   4<=8
		               //   3<=8
		               //   2<=8
                       //1  1<=8
		    for (int i = 1; i <= n;i++) 
		    {
		    	             //13 print 13,
		    	                //8 print 8,
		    	                //5 print 5,
		    	                //3 print 3,
		    	                //2 print 2,
		    	                //1 print 1,
		    	                //1 print 1,
		    	                //0 print 0,
		      //System.out.print(firstTerm + ", ");
		      System.out.print(firstTerm +" ");

		      // compute the next term
		      int nextTerm = firstTerm + secondTerm;  //0+1=1    //1+1=2     //1+2=3   //2+3=5   //3+5=8  //5+8=13  //8+13=21  //13+21=33
		      
		      firstTerm = secondTerm;                 //1       //1        //2        //3       //5       //8       //13       //21
		      
		      secondTerm = nextTerm;                  //1     //2        //3          //5       //8       //13      //21       //33
		    }
		  }
		
}
