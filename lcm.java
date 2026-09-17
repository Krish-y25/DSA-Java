import java.lang.Math;
public class lcm {
//    static int calc_lcm(int n1, int n2) {
//        int temp = Math.max(n1, n2);
//        for (int i = temp; i < n1 * n2; i++) {
//            if (i % n1 == 0 && i % n2 == 0) {
//                return i;
//            }
//        }
//        return n1 * n2;
//    }

//    More Efficient Solution

    static int gcd(int n1, int n2){
        if (n2 == 0){
            return n1;
        }
        return gcd(n2, n1%n2);
    }
    static int calc_lcm(int n1, int n2){
        return (n1*n2)/gcd(n1, n2);
    }
    public static void main(String[] args){
        System.out.println(calc_lcm(4,6));
    }
}
