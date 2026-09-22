package Arrays;

import javax.imageio.ImageTranscoder;

public class max_circular_subarray_sum {

    //Naive approach   TC: O(n^2)  SC: O(1)
    static int max_circ_subarry_sum(int[] arr){
        int n = arr.length, max = arr[0], curr;
        for (int i = 0; i<n; i++){
            curr = 0;
            for (int j = 0; j<n; j++){
                curr += arr[(i+j)%n];
                max = Math.max(max, curr);
            }
        }
        return max;
    }


    /* Optimal solution: First we find the minimum sum of the subarray using the technique of finding the max. sum
    of subarray and then we subtract this sum from the total sum of the array
     */
    static int max_circ_sum(int[] arr){
        int n = arr.length, minending = arr[0], min = arr[0], sum = arr[0];
        for (int i = 1; i<n; i++){
            minending = Math.min(minending + arr[i], arr[i]);
            min = Math.min(minending, min);
            sum+=arr[i];
        }
        return sum - min;
    }
    public static void main(String[] args){
        int[] arr = {5, -2, 3, 4};
        System.out.println(max_circ_sum(arr));
    }
}
