package wiprotalent;

public class wap32 {
    public static void main(String[] args) {
        int[] gArray = {1,4,34,56,7};

        System.out.println(checkInArray(gArray , 56));

    }

    public static int checkInArray(int[] Array , int number){
       int flag = 0;
       int answer = 0;
       for(int i=0; i < Array.length; i++){
        if(Array[i] == number){
            flag = 1;
            answer = i;
        }
        }

        if(flag == 0){
            answer = -1;
        }
        
        return answer;
       

       
    
    }

}
