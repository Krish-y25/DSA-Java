import java.util.Scanner;

public class count_set_bits {

    //Using Look-up table
    static int[] tbl = new int[256];
    static void initialize(){
        tbl[0] = 0;
        for (int i = 1; i<=255; i++){
            tbl[i] = tbl[i&(i-1)] + 1;
        }
    }
    static int count_set_ltbl(int n){
        return tbl[n&255] + tbl[(n>>8)&255] + tbl[(n>>16)&255] + tbl[n>>24];
    }

    // My-Solution
    static int count_set_bit(int n){
        int count = 0;
        while (n>0){
            if ((n&1) != 0){   // Bit-wise operators are faster than the % operator so using for better time complexity.
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    //Brian-Kerningam's Algorithm
    static int count_set_bka(int n){
        int count = 0;
        while (n>0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        initialize();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(count_set_ltbl(num));
    }
}
