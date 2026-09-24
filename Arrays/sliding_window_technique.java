package Arrays;

public class sliding_window_technique {

    //Naive solution    TC: O(n*size)  SC: O(1)
    static int max_sum(int[] arr, int size){
        int n = arr.length, max = Integer.MIN_VALUE;
        for (int i = 0; i<=n-size; i++){
            int curr = 0;
            for (int j = 0; j<size; j++){
                curr += arr[i+j];
            }
            max = Math.max(curr, max);
        }
        return max;
    }

    //Optimal solution      TC: O(n)    SC: O(1)
    //Compute curr of current window using curr of previous window in O(1) time
    static int max_sum_optimal(int[] arr, int size){
        int curr = 0, max, n = arr.length;
        for (int i = 0; i<size; i++){
            curr+=arr[i];
        }
        max = curr;
        for (int i = size;i<n; i++){
            curr = curr - arr[i-size] + arr[i];
            max = Math.max(max, curr);

        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {1, 8, 30, -5, 20, 7};
        System.out.println(max_sum_optimal(arr, 4));
    }
}
