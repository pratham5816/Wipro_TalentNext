package wiprotalent;
import java.util.ArrayList;


public class wap40 {
    public static void main(String[] args) {
        int[] array = {2,2,2};

        ArrayList<Integer> newarray = new ArrayList<>();

        for(int i =0; i < array.length; i++){
            if(array[i] % 2 == 0){
                newarray.add(array[i]);
            }
        }

        
        for(int i =0; i < array.length; i++){
            if(array[i] % 2 != 0){
                newarray.add(array[i]);
            }
        }

        System.out.println(newarray.toString());
    }
}
