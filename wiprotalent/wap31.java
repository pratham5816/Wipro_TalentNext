package wiprotalent;

import java.doWhile;

public class wap31 {
    public static void main(String[] args) {
        int[] array = {};
        
        
            System.out.println(getSum(array));
            System.out.println(getAvg(array));
            System.out.println(getMax(array));
            System.out.println(getMin(array));


    }

    public static String getSum(int[] ARRAY){
       
        if(ARRAY.length == 0)  return "Empty Array";
         
         int sum = 0;
        for(int x : ARRAY){
            sum += x;
        }

        return String.valueOf(sum);
    }

    public static double getAvg(int[] ARRAY) {
        
        // if(ARRAY.length == 0){
        //     System.out.println("Array is Empty");
        // }
        int sum = 0;

        for(int x : ARRAY){
            sum += x;
        }
        int len = ARRAY.length;
        double ans = sum / len;
        return ans;
    }

   


    public static int getMin(int[] ARRAY){
        
       
        if(ARRAY.length == 0){
            System.out.println("Array is Empty");
        }
        int min = ARRAY[0];

        for(int x : ARRAY){
            if(x < min){
                min = x;
            }
        }

        return min;
    }
}
