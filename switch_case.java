import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age!");
        int age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are going to become an adult");
                break;
            case 23:
                System.out.println("you are going to get an job");
                break;
            case 60:
                System.out.println("you are going to get retired");
                break;
            default:
                System.out.println("Don't waste your time!");
        }
//        System.out.println("Thanks for using my java code!");
        sc.close();
    }
}
