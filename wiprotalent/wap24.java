package wiprotalent;
import java.util.Scanner;
public class wap24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input1 = scan.nextLine();
        // System.out.println("Enter Another String: ");
        // String input2 = scan.nextLine();




        char[] chararrayofnumber = input1.toCharArray();
        String reversedString = "";

        for(int i = chararrayofnumber.length - 1; i >= 0; i--){
            reversedString += chararrayofnumber[i];
        }

        System.out.println(reversedString);

        // System.out.println(input1);

    }
}
