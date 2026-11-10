package in.aman.symbolicPatterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers of Boxes : ");
        int box = sc.nextInt();
        System.out.println("Enter the number of rows : ");
        int r= sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int c= sc.nextInt();

        for (int i = 0; i  < r; i++) {
            for (int j = 0; j < box * c; j++) {
                if ((i == 0 || j == 0) ||(i==(r-1)))
                {
                    System.out.print("* ");
                }
                else if ((j>(c-1) &&((j%c)==0)))
                {
                    System.out.print("* ");
                }
                else if ((j>(c-2))&&((j+1)%c)==0)
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
        sc.close();
    }

}
