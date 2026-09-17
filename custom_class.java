import java.util.Scanner;
class Employee{
    int id;
    String name;
    public void getdetails(){
        System.out.printf("My id is %d and my name is %s\n",id,name);
    }
}
public class custom_class {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Employee krish = new Employee();
        // Employee anamika = new Employee();
        krish.id = sc.nextInt();
        krish.name = sc.next();
//        anamika.id = sc.nextInt();
//        anamika.name = sc.next();
        krish.getdetails();
//        anamika.getdetails();
        sc.close();
    }
}
