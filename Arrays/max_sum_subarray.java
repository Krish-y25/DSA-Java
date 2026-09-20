package Arrays;

public class max_sum_subarray {

    //Naive Solution    TC: O(n^2) SC: O(1)
    static int sum_subarray(int[] arr){
        int sum = 0, n = arr.length, res = arr[0];
        for (int i = 0; i<n; i++){
            for (int j = i; j<n; j++){
                sum += arr[j];
                res = Math.max(res, sum);
            }
            sum = 0;
        }
        return res;
    }

    //Optimal Solution  TC: O(n) SC: O(n)
    static int max_sum(int[] arr){
        int res = arr[0], maxending = arr[0];
        for (int i = 1; i<arr.length; i++){
            maxending = Math.max(maxending + arr[i], arr[i]);
            res = Math.max(res, maxending);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {-5, 1, -2, 3, -1, 2, -2};
        System.out.println(max_sum(arr));
    }
}
