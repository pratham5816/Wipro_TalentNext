package wiprotalent;

import java.util.ArrayList;


public class wap39 {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        
        // System.out.println("Enter size of array: ");
        // int size = scan.nextInt();

        // int[] array = new int[size];

        // for(int i = 0; i < size; i++){
        //     array[i] = scan.nextInt();
        // } 

        int[] array = {1,99,10};

        int count = 0;
        
        ArrayList<Integer> newarray = new ArrayList<>();

        for(int i = 0; i < array.length; i++){
            if(array[i] == 10){ 
                count ++;
            }else{
                newarray.add(array[i]);
            }
        }
        
        for(int i = 1; i <= count; i++){
            newarray.add(0);
        }

        System.out.println(newarray);



    }   
}
