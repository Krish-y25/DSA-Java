import java.io.IOException;
import java.util.Scanner;
public class Board_percentage_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        int sub;
        float g;
        float[] subs;
        try{
            System.out.print("Enter number of subjects: ");
            sub = sc.nextInt();
            System.out.print("Maximum marks per subject: ");
            g = sc.nextFloat();
            subs = new float[sub];
            for (int i = 0; i < sub; i++){
                System.out.print("Obtained marks in subject " + (i+1) + ": ");
                subs[i] = sc.nextFloat();
                sum += subs[i];
            }
            float percentage = (sum/(g*sub))*100;
            System.out.println("Your percentage is: " + percentage);
            int count = 0;
            for (int i = 0; i<sub; i++){
                if(subs[i] < 33) {
                    if(count==0) {
                        System.out.print("You failed in subject " + (i + 1));
                        count += 1;
                    }
                    else {
                        System.out.print(", " + (i+1));
                    }
                }
            }
            System.out.println();
            if(count == 0){
                System.out.print("Congratulations🎉");
            }
            else {
                System.out.print("Better Luck next time");
            }
        }
        catch (Exception e){
            System.out.println("Invalid value entered");
        }
        sc.close();
    }
}