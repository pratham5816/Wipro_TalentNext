package wiprotalent;

public class wap34 {
    public static void main(String[] args) {
        
        int[] array = {1,5,2,6,8,2,88,22};
        int[] result = get2Minnums(array);
        
        if(result != null){
            System.out.println(result[0]);
            System.out.println(result[1]);
        }
        else{
            System.out.println("err");
        }
    }


    
    public static int[] get2Minnums(int[] ARRAY){
        
        if(ARRAY.length < 2){
            return null;
        }

        int firstMin = Integer.MAX_VALUE;
        int secoundMin = Integer.MAX_VALUE;

        for(int num : ARRAY){
            if(num < firstMin){
                secoundMin = firstMin;
                firstMin = num;
            }else if( num < secoundMin && num > firstMin){
                secoundMin = num;
            }
        }

        if(secoundMin  == Integer.MIN_VALUE){
            return null;
        }

        return new int[] {firstMin , secoundMin};
      
    }



}
