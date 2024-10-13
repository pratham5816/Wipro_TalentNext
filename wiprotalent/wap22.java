package wiprotalent;

import java.util.Scanner;

public class wap22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = scan.nextInt();

        String number = String.valueOf(num);
        int digitcount = 0;

        for(int i = 0; i < number.length(); i++){
            // System.out.print(number.charAt(i));
            // System.out.print(",");
            digitcount ++;
        }

        System.out.printf("The output is %d digits." , digitcount);

        scan.close();

    }
}
