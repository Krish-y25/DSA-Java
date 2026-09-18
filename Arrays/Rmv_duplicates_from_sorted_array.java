package Arrays;

public class Rmv_duplicates_from_sorted_array {
    static int remove_duplicates_sorted(int[] arr){
        int size = arr.length;
        int i = 0;
        for(int k = 1; k<size; k++){
            if(arr[k] != arr[i]){
                arr[++i] = arr[k];
            }
        }
        return i+1;
    }
    static void print_array(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {10, 10, 10, 20, 20};
        print_array(arr);
        int new_size = remove_duplicates_sorted(arr);
        print_array(arr);
        System.out.println("New size of Array: " + new_size);
    }
}
