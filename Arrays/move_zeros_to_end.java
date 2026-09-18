package Arrays;

public class move_zeros_to_end {
    static void move_zeros(int[] arr){
        for (int i = 0; i< arr.length - 1; i++){
            if(arr[i] == 0){
                int j = i + 1;
                while(arr[j] == 0 && j < arr.length-1){
                    j++;
                }
                arr[i] = arr[j];
                arr[j] = 0;
            }
        }
    }
    public static void main(String[] args){
        int[] ar = {0, 0, 0, 10, 0};
        move_zeros(ar);
        for (int i = 0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
    }
}
