package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args){
        int val;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter values");
        for (int i = 0; i<3; i++)
            al.add(sc.nextInt());
        System.out.print("ArrayList: ");
        System.out.println(al);
        System.out.println("Size: " + al.size());
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
    }

}
