package Recursion;
import java.lang.Math;
public class rope_cutting_problem {

    //Time O(3^n)
    static int rope_cut(int n, int a, int b, int c){
        if (n == 0) return 0;
        if (n<0) return -1;
        int res = Math.max(rope_cut(n-a, a, b, c), Math.max(rope_cut(n-b, a, b, c), rope_cut(n-c, a, b, c)));
        if (res == -1) return -1;
        return 1 + res;
    }
    public static void main(String[] args){
        int val = rope_cut(10, 2, 2, 2);
        System.out.println(val);
    }
}
