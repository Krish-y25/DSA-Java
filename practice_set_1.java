import java.util.Scanner;
public class practice_set_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in Physics");
        byte p = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        byte c = sc.nextByte();
        System.out.println("Enter your marks in Maths");
        byte m = sc.nextByte();
        float total = (p + c + m)/3.0f;

        if (total>40 && p>=33 && c>=33 && m>=33){
            System.out.println("Congratulations, You are promoted!");
        }
        else{
            System.out.println("You are not Qualified, Better Luck Next Time!");
        }
        System.out.println("Your overall percentage is " +
                total);
        sc.close();
    }
}
