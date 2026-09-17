package Arrays;

public class largest_element {
    static int max(int[] arr){
        int index1 = 0, index2 = -1;
        for (int i =1; i<arr.length; i++){
            if (arr[i] > arr[index1]){
                index2 = index1;
                index1 = i;
            }
            else if(arr[i] != arr[index1]){
                if (index2 == -1 || arr[i] > arr[index2]){
                    index2 = i;
                }
            }
        }
        return index2;
    }
    public static void main(String[] args){
        int[] arr = {5,20,12,20,8};
        System.out.println("The index of the second largest element in the array is: " + max(arr));
    }
}
