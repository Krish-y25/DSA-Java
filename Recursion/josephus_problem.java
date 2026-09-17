package Recursion;

public class josephus_problem {

    //If numbering starts from 0
    static int jos(int n, int k){
        if (n == 1) return 0;
        return (jos(n-1, k) + k)%n;
    }

    //If numbering starts from 1
    static int myjos(int n, int k){
        return jos(n, k) + 1;
    }

    public static void main(String[] args){
        System.out.println(jos(99, 1));
        System.out.println(myjos(4, 1));
    }
}
