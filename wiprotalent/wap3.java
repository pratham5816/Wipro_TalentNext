package wiprotalent;

import java.util.Scanner;

// WAP to print if a number is odd or even
public class wap3 {
    public static void main(String[] args) {
        int number;

        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter Number: ");
        number = Scan.nextInt();

        if(number % 2 == 0){
            System.out.println("Even");

        }
        if(number % 2 != 0){
            System.out.println("ODD");
        }
        Scan.close();
    }
}
