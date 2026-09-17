public class two_odd_occuring {

    //My-Solution Time Complexity: O(n*n)
    static void odd_occurence(int[] arr){
        int count = 0;
        int len = arr.length;
        for (int i = 0; i<len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if ((count & 1) != 0) System.out.print(arr[i] + " ");
            count = 0;
        }
    }

    // Efficient Solution with Time Complexity: O(n)
    static void odd_occurence_efficient(int[] arr, int n){
        int res = arr[0], n1 = 0, n2 = 0;
        for (int i = 1; i<n; i++){
            res = res^arr[i];
        }
        int k = (res&(~(res-1)));
        for (int i = 0; i<n; i++){
            if ((arr[i] & k) != 0){
                n1 = n1^arr[i];
            }
            else n2 = n2^arr[i];
        }
        System.out.println(n1 + " " + n2);
    }
    static void main(String[] args){
        int[] arr = {1, 2, 1, 3, 4, 2, 3, 3};
//        odd_occurence(arr);
        odd_occurence_efficient(arr, 8);
    }
}
