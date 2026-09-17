import java.util.Scanner;

public class integer_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        System.out.println(sc.hasNextInt());
        sc.close();
    }

}
