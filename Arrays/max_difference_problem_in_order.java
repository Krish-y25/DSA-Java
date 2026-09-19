package Arrays;

public class max_difference_problem_in_order {

    //Naive Solution - TC: O(n^2) SC: O(1)
    static int max_diff(int[] arr){
        int n = arr.length, max = arr[1] - arr[0];
        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j<n; j++){
                if (arr[j] - arr[i] > max) max = arr[j] - arr[i];
            }
        }
        return max;
    }

    //Optimal Solution - TC: O(n) SC: O(1)
    static int max_diff_optimal(int[] arr){
        int n = arr.length, max = arr[1] - arr[0], min = arr[0];
        for (int i = 1; i<n; i++){
            if (arr[i] - min > max) max = arr[i] - min;
            if (arr[i] < min) min = arr[i];
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(max_diff_optimal(arr));
    }
}
