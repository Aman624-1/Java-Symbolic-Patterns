package in.aman.symbolicPatterns;

import java.util.Scanner;

public class Pattern02 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int col = sc.nextInt();
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				if(i==j||i>j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
		
	}
	
}
