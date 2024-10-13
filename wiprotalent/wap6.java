package wiprotalent;

import java.util.Scanner;

// Write a program to check whether a triangle is valid or not,
// when the three angles of the triangle are entered through the keyboard.
// A triangle is valid if the sum of all the three angles is equal to 180 degrees.
public class wap6 {
    public static void main(String[] args) {
        int angleA;
        int angleB;
        int angleC;
        Scanner ScanKar = new Scanner(System.in);

        System.out.print("Enter Angle A: ");
        
        angleA = ScanKar.nextInt();
        ScanKar.nextLine();

        System.out.print("Enter Angle A: ");
        angleB = ScanKar.nextInt();
        ScanKar.nextLine();

        System.out.print("Enter Angle A: ");
        angleC = ScanKar.nextInt();
        ScanKar.nextLine();

        if(angleA + angleB + angleC == 180){
            System.out.println("Valid triangle");
        }  else{
            System.out.println("Not valid Triangle");
        };

        ScanKar.close();
    }
}
