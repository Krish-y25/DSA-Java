import java.lang.Math;
import java.security.spec.RSAOtherPrimeInfo;

public class kth_bit_check {
    static void check_bit(int n, int k){
//        int x = (int) Math.pow(2, k-1);
        int x = (1 << (k-1));
        if ((n & x) != 0){
            System.out.println("Yes");
        }
        else System.out.println("NO");
    }
    public static void main(String[] args){
        check_bit(5,3);
    }
}
