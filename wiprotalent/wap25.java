package wiprotalent;

import java.util.Scanner;

public class wap25 {
    public static void main(String[] args) {
    {
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter String: ");
        String input = scan.nextLine();
        
        int vowelCount = countVowel(input);

        System.out.println("number of vowels are: " + vowelCount); 
    }  

   
 
    }

    public static int countVowel(String stringnumber){
        int count = 0;
        stringnumber = stringnumber.toLowerCase();

        for(int i = 0; i < stringnumber.length(); i++){
            char ch = stringnumber.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch ==  'u'){
                count ++;
            }
            
        }return count;
        
    }



}
