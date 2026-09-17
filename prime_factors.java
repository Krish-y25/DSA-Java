import java.util.Scanner;
// Most Efficient Solution
public class prime_factors {
    static void prime_fact(int n){
        if(n<=1) return;
        while (n%2 == 0){
            System.out.print("2 ");
            n = n/2;
        }
        while (n%3 == 0){
            System.out.print("3 ");
            n = n/3;
        }
        for (int i = 5; i*i<=n; i+=6){
            while (n%i == 0){
                System.out.print(i + " ");
                n/=i;
            }
            while (n%(i+2) == 0){
                System.out.print(i+2 + " ");
                n/=(i+2);
            }
        }
        if (n>3){
            System.out.println(n);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get the prime factors for it: ");
        int n = sc.nextInt();
        System.out.print("The prime factors for " + n + " are: ");
        prime_fact(n);
    }
}
