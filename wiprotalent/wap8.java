package wiprotalent;

import java.util.Scanner;

public class wap8 {
    public static void main(String[] args) {
        int dayNum;
        Scanner Scan =  new Scanner(System.in);

        System.out.print("Enter number: ");
        dayNum = Scan.nextInt();

        switch (dayNum) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");6
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Enter a number between 1 to 7");
                break;
        }

        Scan.close();

    }
}
