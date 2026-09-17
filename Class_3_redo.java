import java.util.Scanner;

public class Class_3_redo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("For calculating the sum of three numbers firstly");
        System.out.println("Please enter number 1");
        double a = s.nextDouble();
        System.out.println("Now please enter number 2");
        double b = s.nextDouble();
        System.out.println("Now again please enter number 3");
        double c = s.nextDouble();
        double sum = a + b + c;
        System.out.println("THE SUM OF THESE NUMBERS IS:");
        System.out.println(sum);
//        System.out.println("Hope you enjoyed our services");
        s.close();
    }
}
