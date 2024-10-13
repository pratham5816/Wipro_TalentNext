package wiprotalent.OOPs;

public class wap2 {
    
    int id;
    String name;
    int salary;
    void setId(int no){
        id = no;
    }
    void setName(String n){
       name = n;
    }

    void setSalary(int s){
        salary = s;
    }
    void getDetails(){
        System.out.println(name + " salary is " + salary);
    }

}

