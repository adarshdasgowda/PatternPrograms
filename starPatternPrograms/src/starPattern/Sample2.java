package starPattern;

public class Sample2 
{	
	public static void main(String[] args)
	{
		int k;
		for (int i=1; i<=5; i++)
		{
			for (k=4; k>=i; k--)
			{
				//Single space is given
				System.out.print(" ");
			}
			k=k-1;
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");			
			}		
			System.out.println(" ");
		}		
	}
}

/*
    *  
   * *  
  * * *  
 * * * *  
* * * * *  

*/