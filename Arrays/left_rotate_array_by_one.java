package Arrays;

public class left_rotate_array_by_one {

    //Time complexity: O(n)
    //Space complexity: O(1)
    static void left_rotatebyone(int[] arr){
        int temp = arr[0];
        for (int i = 1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        left_rotatebyone(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
