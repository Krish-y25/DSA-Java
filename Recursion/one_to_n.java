package Recursion;

public class one_to_n {
    static void one_to_n(int n){
        if (n == 0) return;
        one_to_n(n-1);
        System.out.print(n + " ");
    }

    //Tail Recursive
    static void n_to_1(int n){
        if (n == 0) return;
        System.out.print(n + " ");
        n_to_1(n-1);
    }

    //Tail Recursive version
    static void one_to_n_tr(int n, int k){
        if (n == 0) return;
        System.out.print(k + " ");
        one_to_n_tr(n-1, k+1);
    }

    public static void main(String[] args){
        one_to_n(3);
        System.out.println();
        n_to_1(3);
        System.out.println();
        one_to_n_tr(3, 1);
    }
}
