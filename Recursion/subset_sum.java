package Recursion;

public class subset_sum {

    //My-Solution
    static int subset(int[] n, int[] k, int sum, int i, int s){
        if (s == n.length) {
            int s1 = 0;
            for (int j = 0; j < i; j++) {
//                System.out.print(k[j] + " ");
                s1 += k[j];
            }
//            System.out.println();
            if (s1 == sum) return 1;
            return 0;
        }

        int include = subset(n, k, sum, i,s+1);
        k[i] = n[s];
        int exclude = subset(n, k, sum, i+1,s+1);
        return include + exclude;
    }

    //More efficient solution
    static int subset_sum(int[] arr, int n, int sum){
        if (n == arr.length) return sum==0 ? 1 : 0;
        return subset_sum(arr, n + 1, sum) + subset_sum(arr, n+1, sum - arr[n]);
    }
    public static void main(String[] args){
        int[] n = {10, 20, 15, 30, 25, 5};
        int[] k = new int[n.length];
        System.out.println(subset(n, k, 25, 0, 0));
        System.out.println(subset_sum(n, 0, 25));
    }
}
