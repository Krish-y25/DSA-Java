package Sorting;

public class merge_function_merge_sort {

    //My Function
//    static void merge_sort(int[] arr, int low, int mid, int high){
//        mid++;
//        while(mid <= high && low<=mid){
//            if (arr[mid] < arr[low]){
//                int temp = arr[mid];
//                for (int i = mid; i>low; i--){
//                    arr[i] = arr[i-1];
//                }
//                arr[low] = temp;
//                mid++;
//                low++;
//            }
//            low++;
//        }
//    }

    //Better-Solution
    static void merge_sort(int[] arr, int low, int mid, int high){
        int[] left = new int[mid - low + 1];
        int[] right = new int[high - mid];
        for (int i = 0; i<mid + 1; i++){
            left[i] = arr[low + i];
        }
        for(int i = 0; i<high -mid; i++){
            right[i] = arr[i + mid + 1];
        }
        int i =0, j =0, k = low;
        while(i < left.length && j<right.length){
            if (left[i] > right[j]){
                arr[k] = right[j];
                j++;
                k++;
            }
            else {
                arr[k] = left[i];
                k++;
                i++;
            }
        }
        while(i<left.length){
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j<right.length){
            arr[k] = right[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args){
        int a[] = {5, 8, 12, 14, 7};
        merge_sort(a, 0, 3, 4);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
