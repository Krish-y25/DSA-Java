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
    Time complexity: O(n)   Space Complexity: O(1)
     */
    static int normal_max_sum(int[] arr){
        int n = arr.length, maxending = arr[0], max = arr[0];
        for (int i = 1; i<n; i++){
            maxending = Math.max(maxending+arr[i], arr[i]);
            max = Math.max(maxending, max);
        }
        return max;
    }
    static int max_circ_sum(int[] arr){
        int max_normal = normal_max_sum(arr);
        /* If max_normal <0 -> all numbers <0 so the least negative will always be the answer, if we do not use this condition
        and all the elements of array are negative then the code will return answer as zero
         */
        if (max_normal<0) return max_normal;
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum+=arr[i];
            arr[i] = -arr[i];   //Inverting the array to use normal_max_sum function!
        }

        int max_circular = sum + normal_max_sum(arr);   /*when array consist of -ve numbers so instead of subtracting normal
        min sum which will be negative so -(-) will be +ve so we get the max sum of the inverted array! */

        return Math.max(max_circular, max_normal);  //If all +ve then max_normal is answers else max circular

    }
    public static void main(String[] args){
        int[] arr = {8, -4, 3, -5, 4};
        System.out.println(max_circ_sum(arr));
    }
}
