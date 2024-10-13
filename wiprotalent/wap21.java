package wiprotalent;

import java.util.Scanner;

public class wap21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = scan.nextInt();

        String number = String.valueOf(num);

        for(int i = 0; i < number.length(); i++){
            System.out.print(number.charAt(i));
            System.out.print(",");
        }

        scan.close();

    }
}
