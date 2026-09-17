import java.util.Scanner;

public class class_04 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");
        sc.close();
    }
}
