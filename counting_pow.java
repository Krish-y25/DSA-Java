import java.util.Scanner;

public class counting_pow {

//    Method-1

//    static int pow(int x, int n){
//        int temp = x;
//        for (int i = 1; i<n; i++){
//            x = x*temp;
//        }
//        return x;
//    }

//    Method-2 Efficient solution

    static int pow(int x, int n){
        if(n == 1) return x;
        int temp = pow(x, n/2);
        if (n%2 == 0) return temp*temp;
        else return temp*temp*x;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and power of it: ");
        int num = sc.nextInt();
        int pow = sc.nextInt();
        System.out.print(pow(num, pow));
    }
}