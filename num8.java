import java.util.*;
class num8 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter the rows:");
		int n= scan.nextInt();
		System.out.println("The Required Rows are:");
		for(int i=0; i<n ; i++)
		{
			for (int j=0;j<n ;j++ )
			{
				if(j<=i)
				{
					System.out.print(j+1+ " ");
				}
			
			}
			for (int j=1;j<n ;j++ )
			{
				if(j<=i)
				{
					if(j==i)
					{
						System.out.print(1);
					}
					else
					{
					System.out.print(j+1+" ");
					}
				}
			}
			for (int j=1;j<n ;j++ )
			{
				if(j<=i)
				{
					if(j==i)
					{
						System.out.print(1);
					}
					else
					{
					System.out.print(n-1-i+" ");
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

