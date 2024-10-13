package wiprotalent;

import java.util.Scanner;

public class wap23 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = scan.nextInt();
        int sum = sumOfDigits(num);
        System.out.printf("The number entered is %d. sum is %d." , num , sum);
        scan.close();

    }

    public static int sumOfDigits(int number){
        int sum = 0;

        while (number != 0){
            sum += number % 10;
            number /= 10;
        }


        return sum;
    }
    
}
