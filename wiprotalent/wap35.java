package wiprotalent;
import java.util.ArrayList;
public class wap35 {
    public static void main(String[] args) {
        
        int[] array = {3,2,6,2,6,23,8};

        int[] sortedArray = {};
        int min = array[0];

        for(int i = 0; i < array.length; i++){
           System.out.print(array[i] + " ");
        }
        int temp = 0;

        for(int i =0; i < array.length; i++){
            for(int j = i + 1;j< array.length;j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp; 
                }
            }
        }
        System.out.println();
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i]+ " ");
        }

    }
}
