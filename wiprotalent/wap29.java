package wiprotalent;

public class wap29 {

    public static void main(String[] args) {




        for(int i = 11; i<=99; i++){

        int n = i;

        int flag = 0;
        if(n == 1 || n ==2){
            System.out.println("not prime");
        }else{
        int middlenum = n/2;
            for(int j = 2; j < middlenum; j++){
                if(n % j == 0){
                    // System.out.println("not prime");
                    flag = 1;
                    break;
                }
            
            } 

            if(flag == 0){
                System.out.println(n + " -prime");
            }
        }

    }







    //     for(int n = 11; n <+ 98; n++){
    //     int flag = 0;
    //     if(n == 1 || n ==2){
    //         // System.out.println(n + " -Not Prime");
    //     }
    //     int middleNum = n / 2;
    //     for(int i = 2; i < middleNum; i++){
    //         if(n % i == 2){
    //             // System.out.println(n +" -Not Prime");
    //             flag = 1;
    //             break;
    //         }
    //     }

    //     if(flag == 0){
    //         System.out.println(n +" -Prime");
    //     }
    // }

}

}
