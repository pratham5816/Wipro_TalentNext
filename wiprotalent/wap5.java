package wiprotalent;

import java.util.Scanner;

// Any year is entered through the keyboard, write a program to determine whether the year is leap or not.

public class wap5 {
    public static void main(String[] args) {
        
   
    int year;
    Scanner Scan = new Scanner(System.in);
    System.out.println("Enter Year: ");
    year = Scan.nextInt();

    if(year % 4 == 0){
        System.out.print("Leap Year");
    } else{
        System.out.print("Not a leap year");
    }



   }
}
