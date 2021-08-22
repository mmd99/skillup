import java.util.Arrays;

public class Lesson4Arrays {
    public static void main (String [] args){
        int[] intArray;
        //int intArray[];   //another example
        intArray = new int [10]; //0

        //int[] intArray = new int [10];
        //System.out.println("result: " + intArray.length);

        intArray [0] =2;
        intArray [1] =21;
        intArray [2] =3;
        intArray [3] =44;
        intArray [4] =63;
        intArray [5] =4;
        intArray [6] =8;
        intArray [7] =9;
        intArray [8] =43;
        intArray [9] =23;

        String [] stringArray  = new String[5];
        stringArray [0] = "test";
        stringArray [1] = "22";
        stringArray [2] = "qwer";
        stringArray [3] = "1222";
        stringArray [4] = "testtt";

        int [] newIntArray = new int[]{7,3,2,1,9};

        String [] newArray2 = {"test","3114","qwerty","12",};
        System.out.println(Arrays.asList(newArray2));

//        for (int i = 0; i < 4 ; i++) {
//            System.out.println(newArray2[i]);
//        }

       // int [][]twoDimentionArray = new int[3][4];



        int [][] massiv = {{12,54,7,65},{22,37,2,77},{24,53,57,85}};
        for (int i = 0; i<3; i++){
            for (int j = 0; j<4;j++){
                System.out.print(" " + massiv[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(Arrays.deepToString(massiv));  // another way to print arrays above




    }
}
