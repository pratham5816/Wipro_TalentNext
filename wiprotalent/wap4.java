package wiprotalent;

import java.util.Scanner;

public class wap4 {
    public static void main(String[] args) {
        Scanner ScanSir = new Scanner(System.in);
        int input_num;
        System.out.print("Enter Num: ");
        input_num = ScanSir.nextInt();

        if(input_num > 0){
            System.out.print("Positive");

        } else if(input_num <0){
            System.out.print("Negetive");
        } else{
            System.out.println("Something went wrong. you may have entered zero");
        }
        ScanSir.close();
    }
}
