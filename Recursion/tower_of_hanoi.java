package Recursion;

public class tower_of_hanoi {
    static void toh(int n, String src, String aux, String dst){
        if (n == 1){
            System.out.println("Move disk " + n + " from " + src + " to " + dst);
            return;
        }
        toh(n-1, src, dst, aux);
        System.out.println("Move disk " + n + " from " + src + " to " + dst);
        toh(n-1, aux, src, dst);
    }
    public static void main(String[] args){
        toh(4, "A", "B", "C");
        System.out.println("Total Moves: " + (Math.pow(2, 4) - 1));
    }
}
