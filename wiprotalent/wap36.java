package wiprotalent;
import java.util.LinkedHashSet;
import java.util.Set;

public class wap36 {
    public static void main(String[] args) {
        int[] array = {12,34,12,45,67,89};
            // ans [12, 34, 45, 67, 89]
        Set<Integer> HashSet = new LinkedHashSet<>();
       

        // for(int i =0; i < array.length; i++){
        //     HashSet.add(array[i]);
        // }
        
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            for(int j =  i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }


        for(int i = 0; i < array.length; i ++){
            HashSet.add(array[i]);
            // System.out.print(array[i] + " ");
        }
        
        
        
        System.out.println(HashSet.toString());

        
    }
}
