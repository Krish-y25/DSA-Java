//import Scanner

import java.util.Scanner;

public class class_3 {
//    import Scanner
    public static void main(String[] args) {
//       int a = sc.next
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int a = sc.nextInt();
        System.out.println("Please enter number 2");
        int b = sc.nextInt();
        System.out.println("Please enter number 3");
        int c = sc.nextInt();
//        System.out.println("Please enter number 4");
//        int k = sc.nextInt();
        int sum = a + b + c;
        System.out.print("The sum of the numbers is: ");
        System.out.println(sum);
        sc.close();
    }
}
