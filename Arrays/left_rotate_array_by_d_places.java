package Arrays;

public class left_rotate_array_by_d_places {

    //Naive Solution
    //Time Complexity: O(n*d)
    //Space Complexity: O(1)
    static void left_rotate_d_places(int[] arr, int d){
        while(d!=0){
            int temp = arr[0];
            for(int i = 1; i<arr.length; i++){
                arr[i-1] = arr[i];
            }
            arr[arr.length - 1] = temp;
            d--;
        }
    }

    //My 2nd approach - Time complexity: O(n), Space Complexity: O(n)
    static void left_rotate_2(int[] arr, int d){
        int n = arr.length;
        int[] new_arr = arr.clone();
        for(int i = 0; i<n; i++){
            arr[Math.floorMod(i-d, n)] = new_arr[i];
        }
    }

    //Better approach - Time complexity: O(n), Space Complexity: O(d)
    static void left_rotate_3(int[] arr, int d){
        int[] temp = new int[d];
        for (int i = 0; i<d; i++)
            temp[i] = arr[i];
        for (int i = d; i<arr.length; i++)
            arr[i - d] = arr[i];
        for (int i = 0; i<d; i++){
            arr[i + arr.length - d] = temp[i];
        }
    }
    //Best approach - Time complexity: O(n), Space complexity: O(1)  [REVERSAL ALGORITHM]
    static void left_rotate_optimal(int[] arr, int d){
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length - 1);
    }
    static void reverse(int[] arr, int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        left_rotate_optimal(arr, 2);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
