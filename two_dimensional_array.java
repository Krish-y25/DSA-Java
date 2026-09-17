import java.util.Scanner;
public class two_dimensional_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int[5][5];
        int n1,n2;
        System.out.println("Enter the order of the matrix:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("Enter the elements of the matrix ");
        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Displaying the elements of the matrix");
        for (int i=0;i<n1;i++){
            for (int j=0;j<n2;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
