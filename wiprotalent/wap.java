
import java.util.Scanner;

public class wap {
    
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        x = scanner.nextInt();
        if (x > 0){
            System.out.println("Number is positive");

        } else{
            System.out.println("Number is not positive");
        }
        
        scanner.close();
    }
    

}
