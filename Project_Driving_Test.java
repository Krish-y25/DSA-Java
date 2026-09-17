import java.util.Scanner;

public class Project_Driving_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
//        int k1 = 60;
        if(age>=18){
            System.out.println("Yes you can Drive");
        }
        else if (age<14){
            System.out.println("No you cannot drive yet!");
        }
        else if (age == 16) {
            System.out.println("wait 2 year to drive");
        }
        else if (age == 17) {
            System.out.println("wait 1 year to drive");
        }
        else{
            System.out.println("wait 3 year to drive");
        }
        sc.close();
    }
}

