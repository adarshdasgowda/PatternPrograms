package numberPattern;

public class Sample3 
{
	public static void main(String[] args)
	{
		int j;
		for (int i=1; i<=5; i++)
		{
			for (j=5; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			j=j-1;
			System.out.println(" ");
		}
		
	}

	

}


/*
5 4 3 2 1  
5 4 3 2  
5 4 3  
5 4  
5  
*/
