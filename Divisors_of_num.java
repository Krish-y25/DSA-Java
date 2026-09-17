import java.util.Scanner;

public class Divisors_of_num {

//    Time Complexity: O(n)

//    static void divisors(int n){
//        for (int i = 1; i<=n/2; i++){
//            if (n%i == 0) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.print(n);
//    }

//    More Efficient with time complexity: O(n^0.5)

    static void divisors(int n){
        int i;
        for (i = 1; i*i<n; i++){
            if (n%i == 0){
                System.out.print(i + " ");
            }
        }
        if (i*i == n){
            System.out.print(i + " ");
            i--;
        }
        else {
            i--;
        }
        for (; i>=1; i--){
            if (n%i == 0){
                System.out.print(n/i + " ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        divisors(num);
    }
}
