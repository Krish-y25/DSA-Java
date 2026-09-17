package Recursion;

public class sum_using_recursion {
    static int mySum(int n){
        if (n<10) return n;
        return n%10 + mySum(n/10);
    }

    //Better with O(1) auxillary space
    static int mySumItr(int n){
        int sum=0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(mySum(0));
        System.out.println(mySumItr(430));
    }
}
