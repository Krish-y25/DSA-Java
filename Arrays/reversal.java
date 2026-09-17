package Arrays;

public class reversal {
    static void reverse(int[] arr){
        int low = 0, high = arr.length - 1, temp;
        while(low<high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            high--;
            low++;
        }
    }
    static void print_arr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {8, 12, 13, 18};
        reverse(arr);
        print_arr(arr);
    }
}
