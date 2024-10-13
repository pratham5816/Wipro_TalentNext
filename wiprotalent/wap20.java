package wiprotalent;
import java.util.Scanner;

public class wap20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Student 1:");
        int student1 = scan.nextInt();
        System.out.print("Student 2:");
        int student2 = scan.nextInt();
        System.out.print("Student 3:");
        int student3 = scan.nextInt();

        int passedStudents = 0;
        int[] students = {student1 , student2 , student3};
        int failedstudents = 0;

        for(int i = 0; i < students.length; i++){
            if(students[i] > 35){
                passedStudents ++;
            } else{
                failedstudents++;
            }

            
        }
        System.out.println("passedStudents: " + passedStudents);


    }
}
