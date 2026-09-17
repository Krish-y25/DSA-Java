package Arrays;

public class sorted_array_check {
    static boolean isSorted(int[] arr){
        int len = arr.length;
        for(int i = 1; i<len; i++){
            if(arr[i] < arr[i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {8, 12, 113};
        System.out.println(isSorted(arr));
    }
}
