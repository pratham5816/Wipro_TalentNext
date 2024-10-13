package wiprotalent;

import java.util.Scanner;

public class wap7{
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int num;
        System.out.print("Enter Num: ");
        num = Scan.nextInt();
        if(num == 0){
            System.out.println("Number is zero");
        } else if(num > 0){
            System.out.println("Number is positive");
        } else{
            System.out.println("Number is negetive");
        }
        Scan.close();
    }
}