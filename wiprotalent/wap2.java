package wiprotalent;

import java.util.Scanner;

public class wap2 {
    public static void main(String[] args) {
        
        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        num2 = scanner.nextInt();

        // if(num1 - num2 > 0){    
        //     System.out.println("DIFFERENCE IS POSITIVE ");
        // }else if (num1 - num2 < 0){
        //     System.out.println("DIFFERENCE IS NAGATIVE");
        // } else{
        //     System.out.println("Something went wrong");
        // }

        int result = Math.abs(num1 - num2);
        if(result > 0){    
            System.out.println("DIFFERENCE IS POSITIVE ");
        }else if (result < 0){
            System.out.println("DIFFERENCE IS NAGATIVE");
        } else{
            System.out.println("Something went wrong");
        }
        scanner.close();
    }
}
