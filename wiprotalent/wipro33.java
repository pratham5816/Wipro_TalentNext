package wiprotalent;



public class wipro33 {
    public static void main(String[] args) {
        
        int[] array = {1,5,2,6,8,2,88,22};
        int[] result = get2Maxnums(array);
        
        if(result != null){
            System.out.println(result[0]);
            System.out.println(result[1]);
        }
        else{
            System.out.println("err");
        }
    }

    public static int[] get2Maxnums(int[] ARRAY){
        
        if(ARRAY.length < 2){
            return null;
        }

        int firstMax = Integer.MIN_VALUE;
        int secoundMax = Integer.MIN_VALUE;

        for(int num : ARRAY){
            if(num > firstMax){
                secoundMax = firstMax;
                firstMax = num;
            }else if( num > secoundMax && num < firstMax){
                secoundMax = num;
            }
        }

        if(secoundMax == Integer.MIN_VALUE){
            return null;
        }

        return new int[] {firstMax , secoundMax};
      
    }
}
