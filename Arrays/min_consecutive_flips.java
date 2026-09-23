package Arrays;


public class min_consecutive_flips {

    //Optimal solution      TC: O(n)    SC: O(1)
    //If an array begins with 1 then it will either end with 1 or 0, so when it ends with 1
    //the no. of groups of 1 > groups of 0 and if it ends with 0 --> no. of groups of 0 = groups of 1
    //so always the no. of groups of 0 <= groups of 1's --> that's why we print the groups of the no. which is not the
    //first element.

    static void getminflips(int[] arr){
        int n = arr.length;
        int first = arr[0];
        for (int i = 1; i<n; i++){
            if (arr[i] != arr[i-1]){
                if (arr[i] != first){
                     System.out.print("From " + i + " to ");
                }
                else System.out.println(i-1);
            }
        }
        if (arr[n-1] != first) System.out.println(n-1);
    }
    public static void main(String[] args){
        int[] arr = {1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0};
        getminflips(arr);
    }
}
