package wiprotalent;

imp
import java.util.Scanner;

public class wap30 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter: ");
        n = scan.nextInt();

        int sum = 0;
        
        while(n > 0){
            int lastDigit = n % 10;
            n = n / 10;
            sum += lastDigit;
        }
     
        System.out.println(sum);
    
        scan.close();
    }
}
