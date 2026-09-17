package Arrays;

public class deletion_at_pos {
    static int delete(int[] arr, int num, int size){
        int pos;
        for (pos = 0; pos<size; pos++){
            if (arr[pos] == num) break;
        }
        if (pos == size){
            System.out.println("Element not found");
            return pos;
        }
        for (int i = pos; i<size - 1; i++){
            arr[i] = arr[i+1];
        }
        System.out.println("Element deleted successfully");
        return size-1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        delete(arr, 3, 6);
        for (int i =0; i<5; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        delete(arr, 6, 5);
        for (int i =0; i<4; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
