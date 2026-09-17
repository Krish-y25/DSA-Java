import java.util.Scanner;
public class random {
    static void delete_at_pos(int[] arr, int pos){
        if (arr.length == pos){
            arr[pos - 1] = 0;
            return;
        }
        for (int i = pos - 1; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;
    }
    static void display(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter " + len + " elements of the array");
        for (int i = 0; i<len; i++){
            System.out.print("Enter " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        try {
            System.out.print("Enter pos for deleting an element: ");
            int pos = sc.nextInt();

            delete_at_pos(arr, pos);
            System.out.print("Array after deleting element: ");
            display(arr);
        }
        catch (Exception e){
            System.out.println("You have entered an incorrect position for deleting an element");
        }

    }
}
