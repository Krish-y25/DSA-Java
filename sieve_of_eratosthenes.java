import java.util.Scanner;
import java.util.Arrays;
public class sieve_of_eratosthenes {

//    My Solution

//    static void find_primes(int n){
//        if (n == 1) System.out.println("NO prime numbers");
//        int chk=0, i, j;
//        for (i = 2; i<=n; i++) {
//            for (j = 2; j * j <= i; j++) {
//                if (i % j == 0) {
//                    chk = 1;
//                    break;
//                } else {
//                    chk = 0;
//                }
//            }
//            if (chk == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }

//    Sieve of Eratosthenes method for finding prime numbers below a given number - Time Complexity: O(nloglog(n))

    //M-1 - Best Method

    static void soe(int n){
        boolean[] isprime = new boolean[n+1];
        Arrays.fill(isprime, true);
        for (int i = 2; i<=n; i++){
            if (isprime[i]){
                System.out.print(i + " ");
                for (int j = i*i; j<=n; j = j + i){
                    isprime[j] = false;
                }
            }
        }
    }

    //M-2
    static void soe2(int n){
        boolean[] isprime = new boolean[n+1];
        Arrays.fill(isprime, true);
        for (int i = 2; i*i <= n; i++){
            if (isprime[i]){
                for (int j = i*i; j<=n; j+=i){
                    isprime[j] = false;
                }
            }
        }
        for (int i = 2; i<=n; i++){
            if (isprime[i]){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
//        find_primes(num);
        soe(num);
    }
}