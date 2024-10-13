package wiprotalent;

import java.util.Scanner;

public class wap18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.print("Enter value of X: ");
        // int X = scan.nextInt();
        // System.out.println();
        // System.out.print("Enter Value of Y: ");
        // int Y = scan.nextInt();

        // int Z = Y;
        // X = Y;
        // Z = X;
       
        
        // System.out.println("X: " + X);
        // System.out.println("Y: " + Y);


        System.out.print("Enter value of A: ");
        int A = scan.nextInt();
        System.out.println();
        System.out.print("Enter Value of B: ");
        int B = scan.nextInt();
        System.out.println();
        System.out.print("Enter Value of C: ");
        int C = scan.nextInt();

        int X = A;
        int Y = B;
        A = C;
        B = X;
        C = Y;
    
        System.out.println("A: " + A);
        System.out.println("B: " + B );
        System.out.println("C: " + C );
        scan.close();

    }
}
