import java.util.Scanner;
public class convertKilometerToMiles {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Please enter desired value in kilometers");
        double a = sc.nextDouble();
        double miles = (a)*(0.621371);
        System.out.println("The required miles are");
        System.out.println(miles);
        sc.close();
    }
}
