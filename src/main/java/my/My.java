package my;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class My {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int n = 0;

        while (n <= 3) {
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n <= 3){
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");
                }
            } else {
                System.out.println("Вы ввели не число. Повторите ввод:");
                sc.next();
            }
        }
        int [] mas1 ={4,8,3,85,21,9}; //new int[n];
        int evenNums = 0;

        for (int i = 0; i < n; i++) {
            //mas1[i] = (int)(Math.random()*(n+1));
            if(mas1[i]%2 == 0){
                evenNums++;
            }
        }

        System.out.println(Arrays.toString(mas1));
        int [] mas2 = new int[evenNums];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(mas1[i]%2 == 0){
                mas2[index] = mas1[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(mas2));

        //==========================================================================================================
        //sort, binarySearch and toString
        //Давайте создадим массив целых чисел, выведем его на экран с помощью toString,
        // отсортируем с помощью метода sort и найдём в нём какое-то число.
        int [] test = {12, 44, 3, 6, 8};
        System.out.println(test);
        System.out.println(Arrays.toString(test));

        Arrays.sort(test, 0, 5);
        System.out.println(Arrays.toString(test));

        int key= Arrays.binarySearch(test,8);
        System.out.println(key);
        System.out.println(Arrays.binarySearch(test, 5));

//        int[] array = {1, 5, 4, 3, 7}; //объявляем и инициализируем массив
//        System.out.println(array);//пытаемся вывести наш массив на экран без метода toString - получаем 16-ричное число
//        System.out.println(Arrays.toString(array));//печатаем массив "правильно"
//        Arrays.sort(array, 0, 4); //сортируем весь массив от нулевого до четвёртого члена
//        System.out.println(Arrays.toString(array));//выводим отсортированный массив на экран
//        int key = Arrays.binarySearch(array, 5); // ищем key - число 5 в отсортированном массиве.
//        //метод binarySearch выдаст индекс элемента остортированного массива, в котором "спрятано" искомое число
//        System.out.println(key);//распечатываем индекс искомого числа
//        System.out.println(Arrays.binarySearch(array, 0));

        //Results:
//        [I@1540e19d
//        [1, 5, 4, 3, 7]
//        [1, 3, 4, 5, 7]
//        3
//        -1

        System.out.println();
        //==========================================================================================================

        int [][] newTest =  {{22,35,1,55}, {2,55,7,11},{3,75,6,5}};
        System.out.println(newTest[0].length); //quantity of columns
        System.out.println(newTest.length); //quantity of rows

        System.out.println();
        //==========================================================================================================

        String [][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i ++){
            for (int j=0; j<chessBoard[0].length; j++){
                if ((i + j)%2==0) chessBoard [i][j]="W";
                else chessBoard[i][j]="B";
                //System.out.print(" " + chessBoard[i][j] + " ");
            }
            // System.out.println();
        }

        System.out.println();
        //==========================================================================================================

        //Printing arrays
        //1
        int [] number4 = {2, 1, 6, 9, 3, 5};
        System.out.println(Arrays.toString(number4));

        //2
        System.out.println("qqqq");
        for (int i=0; i<number4.length; i++){
            System.out.println(i);
            System.out.print(number4[i] + " ");
        }
        System.out.println();

        //3
        for (int newArray : number4){
            System.out.print(newArray + " ");
        }
        System.out.println();

        //4
        Integer [] number = {2, 1, 6, 9, 3, 5};
//        List <Integer> list = Arrays.asList(number);
//        System.out.println(list);
        System.out.println(Arrays.asList(number));

        //5
        String [] newArray2 = {"test","3114","qwerty","12",};
        System.out.println(Arrays.asList(newArray2));


        System.out.println();
        //==========================================================================================================


        int [] mas = {11, 3, 14, 16, 7};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));


//        int [] mass = {5,22,53,33,8,27,9,5};
//        int buff;
//        for (int i =0; i<mass.length-1; i++) {
//            if (mass[i+1] > mass[i]){
//                buff = mass[i];
//                mass[i+1] = mass [i];
//                mass[i+1] = buff;
//            }
//        }
//        System.out.println(Arrays.toString(mass));


            int [] a = {2,64,6,32,77};
            int max =0;
            for (int i =0; i < a.length; i++) {
                if (a[i]> max) {
                    a[i] =max;

                }
            }
        System.out.println("max number is: " +max);

            Integer[] aa= {22,3,44,33};
        List<Integer> testq = Arrays.asList(aa);
        System.out.println(testq);

    }


}

