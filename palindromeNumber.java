import java.util.Scanner;
public class palindromeNumber {
    static boolean ispal(int num){
        int temp = num, rem, rev = 0;
        while (temp!=0){
            rem = temp%10;
            temp = temp/10;
            rev = rev*10 + rem;
        }
        return rev==num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (ispal(num)){
            System.out.println(num + " is an palindrome number");
        }
        else {
            System.out.println(num + " is not an palindrome number");
        }
    }
}
