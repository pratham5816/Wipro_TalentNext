package wiprotalent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.xml.validation.Schema;

public class wap9 {
    public static void main(String[] args) {
        String Userinput;
        int num1 , num2 , num3 , num4 , num5;
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner Scan = new Scanner(System.in);

        System.out.print("Enter NUM1: ");
        num1 = Scan.nextInt();
        Scan.nextLine();

        System.out.print("Enter NUM2: ");
        num2 = Scan.nextInt();
        Scan.nextLine();

        System.out.print("Enter NUM3: ");
        num3 = Scan.nextInt();
        Scan.nextLine();

        System.out.print("Enter NUM4: ");
        num4 = Scan.nextInt();
        Scan.nextLine();

        System.out.print("Enter NUM5: ");
        num5 = Scan.nextInt();
        Scan.nextLine();

        System.out.print("Menu(ENTER YOUR CHOICE -smallest, largest, all ,sum or average): ");
        Userinput = Scan.nextLine();
        Userinput.toLowerCase();

        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);

        System.out.println(numbers.toString());

        switch (Userinput) {
            case "smallest":
                int minValue = Collections.min(numbers);
                System.out.println("Smallest: " + minValue);
                break;
            case "largest":
                int maxValue = Collections.max(numbers);
                System.out.print("Largest: " + maxValue);
                break;
            case "sum":
                System.out.print("Sum: " +(num1 + num2 + num3 + num4 + num5));
                break;
            case "average":
                float average = ((num1 + num2 + num3 + num4 + num5) / 5);
                System.out.print("average: " + average);
                break;
            case "all":
                float average1 = ((num1 + num2 + num3 + num4 + num5) / 5);
                System.out.println("average: " + average1);
                System.out.println("Sum: " +(num1 + num2 + num3 + num4 + num5));
                int maxValue2 = Collections.max(numbers);
                System.out.println("Largest: " + maxValue2);
                int minValue2 = Collections.min(numbers);
                System.out.println("Smallest: " + minValue2);
            default:
                System.out.println("TATA BYE BYE KATHAM GAYA!");
                break;
        }









        // ArrayList numbers;
        // int count = 0;
        // int x;
        // Scanner Scan = new Scanner(System.in);
        // while(count <= 4){
        //     System.out.print("Enter numbers: ");
        //     x =  Scan.nextInt();
        //     Scan.nextLine();
            
        // }     
    }
}
