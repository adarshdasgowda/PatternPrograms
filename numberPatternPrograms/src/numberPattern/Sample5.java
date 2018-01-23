package numberPattern;

public class Sample5 
{
	public static void main(String[] args)
	{
		int k;
		for (int i=1; i<=5; i++)
		{
			for (k=4; k>=i; k--)
			{
				System.out.print(" ");
			}
			k=k-1;
			for (int j=1; j<=i; j++)
			{
				System.out.print(j+ " ");
				
			}
			
			System.out.println(" ");
		}
		
	}
}

/*
    1  
   1 2  
  1 2 3  
 1 2 3 4  
1 2 3 4 5  

*/