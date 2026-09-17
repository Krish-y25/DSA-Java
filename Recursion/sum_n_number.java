package Recursion;

public class sum_n_number {
    static int get_sum(int n){
        if (n == 1) return 1;
        return n + get_sum(n-1);
    }
    public static void main(String[] args){
        System.out.println(get_sum(5));
    }
}
