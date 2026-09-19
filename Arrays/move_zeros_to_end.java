package Arrays;

public class move_zeros_to_end {

    //Naive Solution
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    static void move_zeros(int[] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                for(int j = i+1; j<arr.length; j++){
                    if (arr[j] != 0){
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }
    }

    //Optimal Solution
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    static void move_zeros_optimal(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
    }

    static void printarray(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        int[] arr1 = {8, 5, 0, 10, 0, 20, 0, 30};
        int[] arr2 = {0, 0, 0, 2, 0, 0};
        move_zeros_optimal(arr1);
        move_zeros_optimal(arr2);
        printarray(arr1);
        printarray(arr2);
    }
}
