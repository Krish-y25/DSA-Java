import java.util.Scanner;
public class factorial {
    static int fact(int num){
        if(num <= 1 && num>=0){
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The factorial of "+n+" is: " + fact(n));
    }
}
