import java.util.Arrays;

public class HomeTaskArrays {
    public static void main(String[] args) {
        //===============================================================================================

        //Порахувати суму чисел в масиві
        int [] number2 = {2, 45, 6, 9};
        int sum = 0;
        for (int numb : number2){
            sum= sum+numb;
        }
        System.out.println(sum);


        System.out.println();

        int [] number3 = {2, 5, 6, 9};
        int result=0;
        for (int i =0; i<number3.length; i++){

            result=result+number3[i];
        }
        System.out.println("sum of array: " + result);

        //===============================================================================================

        //Порахувати суму парних і не парних чисел в масиві

        int [] number33 = {2, 45, 6, 9};
        int sum1= 0;
        int sum2=0;
        for (int numb2: number33){
            if (numb2%2==0){
                sum1 = sum1+numb2;
            } else {
                sum2 = sum2+numb2;
            }
        }
//        System.out.println("Сума парних чисел = " + sum1);
//        System.out.println("Сума не парних чисел = " + sum2);
        System.out.println("Сума парних чисел = " + sum + "\nСума не парних чисел = " + sum2 );

        System.out.println();
        //===============================================================================================

        int [] number4 = {2, 1, 6, 9, 3, 5};

        //print array starting from first element
        int number = 0;
        for (int i =0; i<number4.length; i++){
            System.out.print(number4[i] + " ");
        }

        System.out.println();


        //print array starting from last element
        for (int i= number4.length-1; i>=0; i--){
            System.out.print(number4[i] + " ");
        }


        System.out.println();
        //===============================================================================================
        //print array starting from last element 2

        int [] a = {2, 1, 6, 9, 3, 5};

        Arrays.sort(a, 0,6);

        for (int i = 5; i>a.length; i--) {

            System.out.print(a[i] + " ");
        }




    }
}


