import java.util.Scanner;

public class counting_pow_iterative {
    static int pow(int x, int n){
        int res = 1;
        while (n>0){
            if (n%2 != 0){
                res = res*x;
            }
            n/=2;
            x*=x;
        }
        return res;
    }
    static void main(String[] args){
//        int num, pow;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number and power for it: ");
//        num = sc.nextInt();
//        pow = sc.nextInt();
//        System.out.print("Answer: " + pow(num, pow));
        int x = 1;
        System.out.println(~x);
    }
}

