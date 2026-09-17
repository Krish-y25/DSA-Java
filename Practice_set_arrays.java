public class Practice_set_arrays {
    public static void main(String[] args) {

        // PROBLEM 1:

       /* float[] marks = new float[5];
        marks[0] = 1.2f;
        marks[1] = 5.3f;
        marks[2] = 9.7f;
        marks[3] = 6.2f;
        marks[4] = 4.8f;

        float total = 0.0f;
        for (int f = 0; f< marks.length; f++){
            total = total + marks[f];
        }
        System.out.println(total);

        //PROBLEM 2:

        float[] marks = new float[5];
        marks[0] = 1.2f;
        marks[1] = 5.3f;
        marks[2] = 9.7f;
        marks[3] = 6.2f;
        marks[4] = 4.8f;
        boolean ifInArray = false;

        float num = 5.3f;
        for (float element:marks){
            if (num==element){
                ifInArray = true;
                break;
            }
        }
        if (ifInArray){
            System.out.println("The given number is in array");
        }
        else{
            System.out.println("The given number is not in array");
        }

        //PROBLEM 3:

        int[] marks = new int[4];
        marks[0] = 72;
        marks[1] = 99;
        marks[2] = 56;
        marks[3] = 39;
        int total = 0;
        for (int element:marks){
            total = total + element;
        }
        float average = total/4.0f;
        System.out.println(average);

        //PROBLEM 6:

        int[] marks = new int[4];
        marks[0] = 72;
        marks[1] = 99;
        marks[2] = 56;
        marks[3] = 39;
        int max = Integer.MIN_VALUE;
        for (int element:marks){
            if (element>max){
                max = element;
            }
        }
        System.out.println(max);

        //PROBLEM 7:

        int[] marks = new int[4];
        marks[0] = 72;
        marks[1] = 99;
        marks[2] = 56;
        marks[3] = 39;
        int min = Integer.MAX_VALUE;
        for (int element:marks){
            if (element<min){
                min = element;
            }
        }
        System.out.println(min);

        //PROBLEM 5: How to reverse an array

        int[] marks = new int[4];
        marks[0] = 72;
        marks[1] = 99;
        marks[2] = 56;
        marks[3] = 39;
        int temp;
        int l = marks.length;
        int k = Math.floorDiv(l,2);
        for (int i = 0;i<k;i++){
           temp = marks[i];
           marks[i]=marks[l-1-i];
           marks[l-1-i] = temp;
        }
        for (int element:marks){
            System.out.print(element + " ");
        }

        //PROBLEM 8:

        int[] marks = new int[4];
        marks[0] = 72;
        marks[1] = 99;
        marks[2] = 100;
        marks[3] = 309;
        boolean isSorted = true;
        for (int i = 0;i<marks.length-1;i++){
            if (marks[i]>marks[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is sorted!");
        }
        else{
            System.out.println("The Array is not sorted!");
        }


        //PROBLEM 1 REDO:

        float[] marks = new float[4];
        marks[0] = 78.0f;
        marks[1] = 59.0f;
        marks[2] = 94.0f;
        marks[3] = 83.0f;

        float sum = 0;
        for (float element:marks){
            sum = sum + element;
        }
        System.out.println("The sum of the marks is "+sum);


        //PROBLEM 2 REDO:

        int[] marks = new int[4];
        marks[0] = 78;
        marks[1] = 59;
        marks[2] = 94;
        marks[3] = 83;
        boolean ifPresent = false;
        int given = 94;

        for (int i = 0;i<marks.length;i++){
            if (given==marks[i]){
                ifPresent = true;
                break;
            }
        }
        if (ifPresent){
            System.out.println("The given number is present");
        }
        else{
            System.out.println("The given number is NOT present");
        }


        //PROBLEM 3 REDO:

        int[] marks = new int[4];
        marks[0] = 78;
        marks[1] = 59;
        marks[2] = 94;
        marks[3] = 83;
        int sum = 0;
        for (int element:marks){
            sum = sum + element;
        }
        int i = marks.length;
        float average =sum/4.0f ;

        System.out.println(average);


        //PROBLEM 5 REDO:How to Reverse an array

        int[] marks = new int[4];
        marks[0] = 78;
        marks[1] = 59;
        marks[2] = 94;
        marks[3] = 83;
        int temp;
        int l = marks.length;
        int tillHere = Math.floorDiv(l , 2);
        for (int i=0;i<tillHere;i++){
            temp=marks[i];
            marks[i]=marks[l-i-1];
            marks[l-i-1]=temp;
        }
        for (int e:marks){
            System.out.print(e + " ");
        }


        //PROBLEM 6 REDO:

        int[] marks = new int[4];
        marks[0] = 78;
        marks[1] = 59;
        marks[2] = 94;
        marks[3] = 83;

        int max = Integer.MIN_VALUE;
        for (int i=0;i<marks.length;i++){
            if (marks[i]>max){
                max = marks[i];
            }
        }
        System.out.println(max);

        //PROBLEM 7 REDO:

        int[] marks = new int[4];
        marks[0] = 78;
        marks[1] = 59;
        marks[2] = 94;
        marks[3] = 83;

        int min = Integer.MAX_VALUE;
        for (int i=0;i<marks.length;i++){
            if (marks[i]<min){
                min = marks[i];
            }
        }
        System.out.println(min);



        //PROBLEM 8 REDO:

        int[] marks = new int[4];
        marks[0] = 8;
        marks[1] = 59;
        marks[2] = 94;
        marks[3] = 93;

        boolean isSorted = true;
        for (int i=0;i< marks.length-1;i++){
            if (marks[i]>marks[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The Array is Sorted");
        }
        else {
            System.out.println("The Array is NOT Sorted");
        }
        */
    }
}
