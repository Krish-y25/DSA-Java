package Arrays;

public class leaders_in_an_array {

    //Naive Solution - TC: O(n^2), SC: O(1)
    static void leaders_inarray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            int flag = 1;
            for(int j = i+1; j<n; j++){
                if (arr[i]<=arr[j]){
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(arr[i] + " ");
        }
    }

    /* Efficient-solution - TC: O(n), SC: O(1)
    For printing the leaders in decreasing order we have to store the leaders in an array and then print the array
    in reverse order but this will introduce space complexity of O(n). */
    static void leaders_inarray_eff(int[] arr){
        int n = arr.length, max = arr[n-1];
        System.out.print(max + " ");
        for (int i = n-2; i>=0; i--){
            if(arr[i]>max){
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        leaders_inarray_eff(arr);
    }
}
