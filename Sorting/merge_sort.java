package Sorting;

public class merge_sort {
    static void merge_sort(int[] arr, int l, int r){
            if(r>l){
                int m = l + (r-l)/2;
                merge_sort(arr, l, m);
                merge_sort(arr, m+1, r);
                merge(arr, l, m, r);
        }
    }
    static void merge(int[] arr, int l, int m, int r){
        int[] left = new int[m + 1 - l];
        int[] right = new int[r-m];
        for (int i =0; i<left.length; i++){
            left[i] = arr[l + i];
        }
        for (int i =0; i<right.length; i++){
            right[i] = arr[m + 1 + i];
        }
        int i =0, j =0, k = l;
        while (i<left.length && j<right.length){
            if (left[i] > right[j]){
                arr[k] = right[j];
                j++;
                k++;
            }
            else {
                arr[k] = left[i];
                i++;
                k++;
            }
        }
        while(i<left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        int[] arr = {7, 10, 15, 8, 12};
        merge_sort(arr, 0, 4);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
