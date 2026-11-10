package in.aman.symbolicPatterns;

import java.util.Scanner;

public class Pattern4 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter the size of your pattern: ");
		 int size = sc.nextInt();
		 
		 for(int i=0; i<size; i++)
		 {
			 for(int j=0; j<size; j++)
				 if((i+j)<size)
					 System.out.print("* ");
				 else
					 System.out.print("  ");
			 System.out.println();
		 }
		 
		 sc.close();
		
	}

}
