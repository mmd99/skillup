package my;

import java.util.Arrays;

public class Tasks2 {
    public static void main(String[] args) {
        //===============================================================================================================
        System.out.println("Task #1");
        //===============================================================================================================

        /*

        Given an array of ints, return true if 6 appears as either the first or last element in the array.
        The array will be length 1 or more.


        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false
         */
        int [] mas1 = new int[9];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int)(Math.random()*9+1);
        }
        System.out.println(Arrays.toString(mas1));

        boolean res;

            if (mas1[0] == 6 || mas1[8] ==6){
                res = true;
            }   else {
                res = false;
            }

        System.out.println(res);

        System.out.println();
        //===============================================================================================================
        System.out.println("Task #2");
        //===============================================================================================================

        /*
        Создайте программу, которая будет генерировать и выводить на экран
        вещественное псевдослучайное число из промежутка [-3;3).
         */
        int  number;
        number = (int)(Math.random()*6)-3;
        System.out.println(number);


        System.out.println();
        //===============================================================================================================
        System.out.println("Task #3");
        //===============================================================================================================

        /*
        Натуральное положительное число записано в переменную n.
        Создайте программу, которая будет генерировать и выводить на экран
        целое псевдослучайное число из отрезка [-n;n].
         */

        int n,c;
        n = 10;
        c = (int)(Math.random()*(2*n+1))-n;
        System.out.println(c);


        System.out.println();
        //===============================================================================================================
        System.out.println("Task 4");
        //===============================================================================================================

        /*
        Найти максимальный элемент в массиве из сгенерированных чисел
         */

        int [] mas2 = new int[5];
        int buf = mas2 [0];

        for (int i =0; i<mas2.length; i++) {
            mas2[i] = (int) (Math.random()*10);
            if (mas2[i] > buf) {

            }
        }
        System.out.println(Arrays.toString(mas2));
    }


}
