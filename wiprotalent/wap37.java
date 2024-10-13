package wiprotalent;
public class wap37 {
    public static void main(String[] args) {
        int[] array = {1,6,4,7,9};
      
        // int start6 = 0;
        // int end7 = 0;
        boolean condition = false;
        for(int i =0; i < array.length; i++){
            if(array[i] == 6){
                for(int j = i; j < array.length; j ++){
                    if(array[j] == 7){
                        condition = true;
                        // start6 = array[i];
                        // end7 = array[j];
                    }
                }
            }
        }
        
        if(condition == true){
            System.out.print("SUM - ");
            System.out.print(GetsumIffound6n7(array, condition)); 
            
        }
        if(condition == false){
            System.out.print("SUM - ");
            System.out.print(GetsumIfnotFound(array));
        }

    }


    public static int GetsumIffound6n7(int[] arrayde , boolean condition) {
        int sum = 0;

        if(condition == true){
            for(int j = 0; j < arrayde.length; j++){
               if(arrayde[j] == 6){
                    // System.out.println("founded 6 in array!");
                    break;
               }else{
                sum += arrayde[j];
               }
            }
        }
        
        boolean found7 = false;

        for(int y = 0; y < arrayde.length; y++){
            if(arrayde[y] == 7){
            //    System.out.println("founded 7 in array!");
               found7 = true;
            } else if(found7){
                sum += arrayde[y];
            }
        }
         return sum;

    }
    public static int GetsumIfnotFound(int[] arrayde){
        int sum = 0;
        for(int i = 0; i < arrayde.length; i++){
            sum += arrayde[i];
        }

        return sum;
    }
}
