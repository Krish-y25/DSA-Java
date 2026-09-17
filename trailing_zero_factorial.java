import java.util.Scanner;
public class trailing_zero_factorial {
//    static int trailing_zero_fact(int num){
//        long fact = 1;
//        if(num!=0) {
//            for (int i = 2; i <= num; i++) {
//                fact *= i;
//            }
//        }
//        long temp = fact;
//        int cnt = 0;
//        while (temp%10 == 0){
//            temp = temp/10;
//            cnt++;
//        }
//        return cnt;
//    }
    static int trailing_zero_fact(int num){
        int cnt = 0;
        for (int i = 5; i<=num; i*=5){
            cnt = cnt + num/i;
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("The number of trailing zero's in factorial of " + num + " is: " + trailing_zero_fact(num));
    }
}
