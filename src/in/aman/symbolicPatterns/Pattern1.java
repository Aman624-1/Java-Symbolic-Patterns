package in.aman.symbolicPatterns;

import java.util.Scanner;

public class Pattern1 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of columns: ");
		int col = sc.nextInt();
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		
		for(int i=0; i<col; i++)
		{
			for(int j=0; j<row; j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		sc.close();
	}
	
}
