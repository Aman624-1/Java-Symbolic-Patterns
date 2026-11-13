package in.aman.symbolicPatterns;

import java.util.Scanner;

public class Pattern06 
{
	
	public static void main(String[] args) 
	{
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int row = Sc.nextInt();
		System.out.print("Enter The number of cols: ");
		int cols= Sc.nextInt();
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				if((i==1||j==1)||(i==row)||(j==cols))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		Sc.close();
		
	}

}
