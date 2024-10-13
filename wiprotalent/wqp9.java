package wiprotalent;

import java.util.Scanner;

public class wqp9 {
    public static void main(String[] args) {
        int salary;
        int HRA;
        int DA;
        int GrossSalary;
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        salary = Scan.nextInt();

        if(salary < 1500){
            HRA = (salary * 10) / 100;
            DA = (salary * 90) / 100;
            GrossSalary = salary + HRA + DA;
            System.out.println("Gross Salary: " + GrossSalary + "Rs");
            System.out.println("HRA: " + HRA + "Rs");
            System.out.println("DA: " + DA + "Rs");
        }

        if(salary >= 1500){
            HRA = 500;
            DA = (salary * 98) / 100;
            GrossSalary = salary + HRA + DA;
            System.out.println("Gross Salary: " + GrossSalary + "Rs");
            System.out.println("HRA: " + HRA + "Rs" );
            System.out.println("DA: " + DA + "Rs");
        }

        Scan.close();
    }
}
