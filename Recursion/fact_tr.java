package Recursion;

public class fact_tr {
    static int fact_tailrecursive(int n, int k){
        if (n == 0 || n == 1) return k;
        return fact_tailrecursive(n-1, k*n);
    }
    public static void main(String[] args){
        System.out.println(fact_tailrecursive(4, 1));
    }
}
