package numberPattern;

public class Sample4 
{
	public static void main(String[] args)
	{
		int j;
		for (int i=1; i<=5; i++)
		{
			for (j=5; j>=i; j--)
			{
				System.out.print(i+" ");
			}
			j=j-1;
			System.out.println(" ");
		}
		
	}

}

/*
1 1 1 1 1  
2 2 2 2  
3 3 3  
4 4  
5  

*/