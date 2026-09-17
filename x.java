import java.util.Scanner;
public class x {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int k = 43;
//        for (k=43;k<=50;k++){
//            System.out.print(k + " ");
//        }
//        k = 43;
//        while (k!=45){
//            System.out.println(k);
//            k++;
//        }
        int [] marks = new int[5];
        System.out.println("Enter marks of the student in 5 subjects:");
        for (int i=0; i<marks.length; i++){
            marks[i] = s.nextInt();
        }
        System.out.println("Entered marks of students in 5 subjects in reverse order are as follows:");
//        for(int element: marks){
//            System.out.print(element + " ");
//        }
        for(int i = marks.length -1; i>=0; i--){
            System.out.println(marks[i]);
        }
        s.close();
    }
}