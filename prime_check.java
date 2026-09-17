import java.util.Scanner;

public class prime_check {
//    static boolean is_prime(int n){
//        if (n == 1){
//            return false;
//        }
//        for (int i = 2; i*i <= n;i++){
//            if (n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }

//    More Efficient

    static boolean is_prime(int n){
        if (n==1) return false;
        if (n==2 || n == 3) return true;
        if (n%2 == 0 || n%3 == 0) return false;
        for (int i = 5; i*i <= n; i+=6){
            if (n%i == 0 || n%(i+2) == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (is_prime(num)){
            System.out.println(num + " is an prime number");
        }
        else {
            System.out.println(num + " is not an prime number");
        }
    }
}
