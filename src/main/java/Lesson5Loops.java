import java.util.Arrays;

public class Lesson5Loops {
    public static void main (String [] agrs){

        //WHILE

        int countNumber = 10;
        while (countNumber>=0){
            //System.out.println("test" + countNumber);
            countNumber--;
        }


        System.out.println();
        //===============================================================================================

        //DO WHILE
        int countNumber2 = 1;
        do {
           // System.out.println( "count number  = " + countNumber2 );
            countNumber2++;
        } while (countNumber2< 11);

        System.out.println();
        //===============================================================================================

        // FOR
        for (int i = 0; i < 11;i++) {
          //  System.out.println("res: " + i);
        }


        System.out.println();
        //===============================================================================================

        //FOR EACH
        String [] arraysForString = {"String1", "String2", "String3", "String4"};
        for (String test: arraysForString){
            System.out.println(test);
        }

        for (String test:arraysForString) {
            if (arraysForString.equals("String3")) {

                System.out.println(arraysForString);
            }
        }

        System.out.println();
        //===============================================================================================
        // TERNARY OPERATOR
        int a = 11;
        int b = 17;
        int c = a>b ? (a+b):(a-b);
        System.out.println(c);

        System.out.println();

        //===============================================================================================

        //FOR EACH
        String [] example = {"String1", "String2", "String3", "String4"};
        for (String test : example) {
            if (!test.equals("String3")) {
                System.out.println(test);
            }
        }
        System.out.println();
        //===============================================================================================

        //Printing odd numbers of array
        int [] numbers = {1, 2, 45, 4, 7,6,9};
        for (int test : numbers){
            if (test%2==1){
                System.out.println(test);
            }
        }

        System.out.println();
        //===============================================================================================

        double n = 7.6;
        double k = -2.9;
        double m = n%k;
        System.out.println(m);

        System.out.println();
        //===============================================================================================
        // to find min number of array
        int [] num = {2, 45, 4, 7, 1, 6, 9};
        int min = num[0];
        for (int i =0; i<num.length; i++){
            if (num[i]<min){
                min = num[i];
            }
        }
        System.out.println(min);

        System.out.println();



    }
}
