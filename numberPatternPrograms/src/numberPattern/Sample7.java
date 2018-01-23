package numberPattern;

public class Sample7 
{
	public static void main (String[] args)
	{
		int k;
		for (int i=1; i<=5; i++)
		{
			for ( k=4; k>=i; k--)
			{
				//double space is given
				System.out.print("  ");
			}
			k=k-1;
			for (int j=1; j<=i; j++)
			{
				System.out.print(i+" ");	
			}
			
			System.out.println(" ");
		}	
	}
}
/*
        1  
      2 2  
    3 3 3  
  4 4 4 4  
5 5 5 5 5  
*/
