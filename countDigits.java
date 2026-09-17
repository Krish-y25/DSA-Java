import java.util.Scanner;
public class countDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digits = 0, temp = num;
        while (temp!=0) {
            temp = temp/10;
            digits += 1;
        }
        System.out.println("The number of digits in " + num + " is: " + digits);
    }
}