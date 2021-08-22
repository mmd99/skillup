package my;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        //===============================================================================================================
        System.out.println("Task #1");
        //===============================================================================================================

        /*
        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
        отделяя один элемент от дрgit config credential.helper storeугого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
        Перед созданием массива подумайте, какого он будет размера.
        2 4 6 … 18 20
        2
        4
        6
        …
        20
         */

        int [] mas = new int[10];

        for (int i=0, n=2; i<mas.length; n=n+2,i++){
            mas[i]= n;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i=0; i<mas.length;i++) {

            System.out.println(mas[i]);
        }
        System.out.println();


        //===============================================================================================================
        System.out.println("Task #2");
        //===============================================================================================================

        /*
        Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
         */
        int [] a = new int[50];

        for (int i =0, n=1; i< a.length; n=n+2, i++){
            a[i] = n;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int j= a.length-1;j>=0;j--){
            System.out.print(a[j] + " ");
        }
        System.out.println();


        //===============================================================================================================
        System.out.println("Task #3");
        //===============================================================================================================
        /*
        Создайте массив из 15 случайных целых чисел из отрезка [0;9].
        Выведите массив на экран.
        Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
         */
        int [] b = new int[15];
        int even =0;
        for (int i=0; i<15; i++){
            b[i] = (int)(Math.random()*10);
        }
        for (int j =0; j<b.length; j++){
            if (b[j]%2==0){
                even++;
            }

        }
        System.out.println(Arrays.toString(b));
        System.out.println(even);
        System.out.println();


        //===============================================================================================================
        System.out.println("Task #4");
        //===============================================================================================================
        /*
        Создайте массив из 8 случайных целых чисел из отрезка [1;10].
        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
        Снова выведете массив на экран на отдельной строке.
         */
        int [] c = new int[8];
        int index = c[0];
        for (int i =0; i<c.length; i++){
            c[i] = (int)(Math.random()*10+1);
        }
        System.out.println(Arrays.toString(c));
        for(int j=0; j<c.length; j++){
            if (j%2>0){
                c[j] = 0;
            }
            System.out.print(c[j] + " ");
        }
        System.out.println();
        System.out.println();


        //===============================================================================================================
        System.out.println("Task #5");
        //===============================================================================================================
        /*
        Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
        выведите массивы на экран в двух отдельных строках.
        Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
         */

        int[] mas1 = new int[5];
        int [] mas2 = new int[5];

        int sum1=0;
        int sum2=0;
         for (int i=0; i<mas1.length; i++ ){
             mas1[i] = (int) (Math.random()*6);
             mas2[i] = (int)(Math.random()*6);
         }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));


         for(int i=0; i<mas1.length; i++){
             sum1= mas1[i]+sum1;
             sum2=mas2[i]+sum2;
         }
         sum1=sum1/5;
         sum2=sum2/5;

        System.out.println("Array1 = " + sum1 + "\n Array2 = " + sum2);
         if(sum1>sum2){
             System.out.println("Arithmetic mean of Array#1 more than Array#2 " );
         } else if (sum1<sum2){
             System.out.println("Arithmetic mean of Array#1 less than Array#2 ");
         } else {
             System.out.println("Arithmetic mean of Array#1 equal to Array#2");
         }
        System.out.println();


        //===============================================================================================================
        System.out.println("Task #6");
        //===============================================================================================================

         /*
         Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
         Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
          */
            int [] d = new int [4];
            int num = d[0];
            int flag =1;
            for (int i=0; i<d.length; i++){
                d[i] = (int)(Math.random()*89+10);
            }
            System.out.println(Arrays.toString(d));

            for (int i=0; i<d.length; i++){
                if (d[i]<num) {
                    flag = 1;
                    break;
                }
            }
                if(flag==1){
                    System.out.println("Array is not sequential");
                } else {
                    System.out.println("Array is sequential");
                }


        System.out.println();
        //===============================================================================================================
        System.out.println("Task #7");
        //===============================================================================================================

         /*
            Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
            Напоминаем, что первый и второй члены последовательности равны единицам,
            а каждый следующий — сумме двух предыдущих.
          */
            int [] e = new int[20];

            for (int i =0,n1=1, n2=1; i<e.length; i++) {
                if(i%2==0){
                    n1=n1 + n2;
                    e[i] = n1;
                } else {
                    n2=n1+n2;
                    e[i] = n2;
                }
            }
        System.out.println("First output = " + "\n" + Arrays.toString(e));

            int [] f = new int[20];
            int num1 =f [0] = 1;
            int num2 =f [1]= 1;

            for (int i =0; i<f.length; i++) {
               if (i%2==0){
                   num1= num1+num2;
                   f[i] = num1;
               }else {
                   num2 = num1+num2;
                   f[i] = num2;

               }

            }
            System.out.println("Second output: " + "\n" + Arrays.toString(f));


        System.out.println();
        System.out.println();
        //===============================================================================================================
        System.out.println("Task #8");
        //===============================================================================================================
        /*
        Найти максимальный элемент в массиве из сгенерированных чисел
         */
        int [] g = new int[10];
        int maxG = g[0];

        for (int i = 0; i< g.length; i++){
            g[i] = (int) (Math.random()* 100+1);
        }
        for (int i=0; i<g.length; i++){
            if (g[i] > maxG) {
                maxG = g[i];
            }
        }
        System.out.println(Arrays.toString(g));
        System.out.println("Max array's value is: " + maxG);

        System.out.println();
        //===============================================================================================================
        System.out.println("Task #9");
        //===============================================================================================================
            /*
            Найти минимальный элемент в массиве из сгенерированных чисел
             */
        int [] h = new int[10];

        for (int i =0; i<h.length; i++){
           h[i] = (int) (Math.random()*100+1);
        }

        int minH = h[0];

        for (int i = 0; i<h.length; i++){
            if(h[i]<minH) {
                minH = h[i];
            }
        }

        System.out.println(Arrays.toString(h));
        System.out.println(minH);



        System.out.println();
        //===============================================================================================================
        System.out.println("Task #10");
        //===============================================================================================================
            /*
            Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
            Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
             */
        int [] k = new int[10];
        for (int i = 0; i<k.length; i++) {
            k[i] = (int) ((Math.random()* 31)-15);
        }
        int maxK = k[0];
        int indexK=0;

        for (int i = 0; i<k.length; i++){
            if(k[i]>maxK) {
                maxK = k[i];
                index=i;
            }

        }
        System.out.println(Arrays.toString(k));
        System.out.println("Max element is: " + maxK );
        System.out.println("Index: " + index);



        System.out.println();
        //===============================================================================================================
        System.out.println("Task #11");
        //===============================================================================================================

        /*
        Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
        Каждый элемент с i-ым индексом третьего массива должен равняться
        отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом.
        Вывести все три массива на экран (каждый на отдельной строке),
        затем вывести количество целых элементов в третьем массиве.
         */
        int [] ar1 = new int[10];
        int [] ar2 = new  int[10];
        double [] ar3 = new double[10];
        int quantity =0;

        for (int i =0; i<ar1.length; i++) {
            ar1[i] = (int) (Math.random()*9+1);
            ar2[i] = (int) (Math.random()*9+1);
            ar3[i] = (double) ar1[i]/ar2[i];

        }
        System.out.println("Array #1: " + Arrays.toString(ar1));
        System.out.println("Array #2: " + Arrays.toString(ar2));
        System.out.println("Array #3: " + Arrays.toString(ar3));

        for (int i=0; i<ar3.length; i++) {
            if(ar3[i]%1==0){
                quantity++;
            }
        }
        System.out.println("Quantity of integer numbers are: "  + quantity);


        System.out.println();
        //===============================================================================================================
        System.out.println("Task #12");
        //===============================================================================================================
        /*
        Создайте массив из 11 случайных целых чисел из отрезка [-1;1],
        выведите массив на экран в строку.
        Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
        Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
         */
        int [] l = new int[11];
        int quantityPositive =0;
        int quantityNegative =0;
        int quantityZero =0;
        for (int i =0; i<l.length; i++) {
            l[i] = (int)((Math.random()*4)-2);
        }
        System.out.println(Arrays.toString(l));
        for (int i =0; i<l.length; i++) {
            if (l[i] ==1){
                quantityPositive++;
            } else if (l[i]==-1) {
                quantityNegative++;
            } else {
                quantityZero++;
            }
        }
        System.out.println("Quantity of positive numbers: " + quantityPositive +
                "\nQuantity of negative numbers: " + quantityNegative +
                "\nQuantity of zero numbers: " + quantityZero);
        System.out.println();

        if (quantityPositive>quantityNegative && quantityPositive>quantityZero){
            System.out.println("The most 1 numbers - " + quantityPositive);
        } else if (quantityNegative>quantityPositive && quantityNegative>quantityZero){
            System.out.println("The most -1 numbers - " + quantityNegative);
        }else if (quantityZero>quantityPositive && quantityZero>quantityNegative){
            System.out.println("The most 0 numbers - " + quantityZero);
        }else {
            System.out.println();
        }


        System.out.println();
        //===============================================================================================================
        System.out.println("Task #13");
        //===============================================================================================================
        /*
        Пользователь должен указать с клавиатуры чётное положительное число,
        а программа должна создать массив указанного размера из случайных целых чисел из [-5;5]
        и вывести его на экран в строку.
        После этого программа должна определить и сообщить пользователю о том,
        сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
        Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор,
        пока не будет указано корректное значение.
         */
        int left, right;

        System.out.println("Enter even number!");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int number = scanner.nextInt();
            if(number%2==0 && number>0){
                int[] masK = new int[number];
                for (int i =0; i<masK.length; i++){
                    masK[i] = (int) ((Math.random()*12)-6);
                    System.out.print(masK[i] + " ");
                }


            } else {
                System.out.println("Your number is not even. Please enter even number!" );
            }

        }



        System.out.println();
        //===============================================================================================================
        System.out.println("Task #14");
        //===============================================================================================================

        /*
        Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
        чтобы отрицательных и положительных элементов там было поровну и не было нулей.
        При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант,
        когда в массиве постоянно выпадает сначала 6 положительных,
        а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
        Вывести полученный массив на экран.
         */


        System.out.println();
        //===============================================================================================================
        System.out.println("Task #15");
        //===============================================================================================================

        /*
        Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
        Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
        Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
         */





    }
}
