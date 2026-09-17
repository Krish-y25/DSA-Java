package Arrays;

public class remove_duplicates {
    static int remove_duplicates(int[] arr){
        int k = arr.length;
        for(int i = 1; i<k; i++){
            if(arr[i] == arr[i-1]){
                for(int j = i; j<k-1; j++){
                    arr[j] = arr[j+1];
                }
                k--;
            }
        }
        return k;
    }
    static void print_arr(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 20, 30, 30, 30, 30};
        System.out.println(remove_duplicates(arr));
        print_arr(arr);
    }
}
