import java.util.Arrays;
import java.util.List;

public class HomeTasks1907 {
    public static void main(String[] args) {

//        1) Найти максимальный элемент в массиве из сгенерированных чисел
        System.out.println("#1");

        int [] a = {3,52,68,23,5,32,84,32,46};
        int max = a[0];

        for (int i = 0; i < a.length; i++){
           if (max < a[i]){
               max = a[i];
           }
        }
        System.out.println("Max number is: " + max);


        //=============================================================================================================
        System.out.println();
        System.out.println("#2");
//        2) Найти минимальный элемент в массиве из сгенерированных чисел
        int [] b = {5,2,68,2,5,32,-8,32,46};
        int min = b[0];

        for (int i =0; i < b.length; i++){
            if (b[i] < min){
                min =b[i];
            }
        }
        System.out.println("Min number is: " +min);


        //=============================================================================================================
        System.out.println();
        System.out.println("#3");
//        3) Заменить каждый элемент массива с нечетным индексом на ноль

        int [] d = {5,2,68,2,5,32,8,32,46};

        System.out.print("Updated array - " );
        for (int i = 0; i < d.length; i++){
            if (i%2==1){
                d[i] =0;
            }
            System.out.print(d[i] + " ");
        }


        //=============================================================================================================
        System.out.println();
        System.out.println();
        System.out.println("#4");
//        4) Создать второй массив из четных элементов первого массива
        /*
        ты положила в буфер которым ты будешь определять кол-во четных нулевой элемент из первого массива
        внезапно
        в первом цикле нужно было просто посчитать кол-во этих чётных элементов

        и положить их в этот буфер

        второй цикл ты опять же организовываешь по первому массиву и опять же проверяешь там чётность
         элементов но в этот раз уже их записываешь во второй массив
         */

        int [] mas1 = {5,234,68,3,32,8,35,46,7,46,22,6,33};
        int numm =0;

        System.out.print("Even elements are: ");
        for (int i = 0; i < mas1.length; i++){
            if (i%2==0){
                mas1 [i]= numm;
               numm++;
            }
        }
        System.out.print(numm);

        System.out.println();
        int [] mas2 = new int[mas1.length];
        int index =0;
        for (int j=0; j<mas1.length; j++){
            if (j%2==0){
                mas2[index]=mas1[j];
                index++;
                System.out.print(mas2[index] + " ");

            }

        }


        //=============================================================================================================
        System.out.println();
        System.out.println();
        System.out.println("#5");
//        5) Создайте массив из 4  целых чисел, выведите его на экран в строку.
//        Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

        int [] k = {5,234,68,3};
        System.out.println("Array is: " + Arrays.toString(k));

        //clone and sort
        int [] copyK = Arrays.copyOf(k, 4);
        //System.out.println(Arrays.toString(copyK));
        Arrays.sort(k,0,4);

        // compare with existing
        if (k==copyK){
            System.out.println("Array is sequential");
        } else {
            System.out.println("Array is not sequential");
        }



        //=============================================================================================================
        System.out.println();
        System.out.println("#6");
//        6) Дан массив А[5]. Получить массив В(5) по следующим правилам: В(і)=1
//        если в і-ом элементе массива отрицательлный элемент,
//        иначе В(і) =0.

        int [] A = {5,-234,68,3,-32};
        int [] B = Arrays.copyOf(A,5);
        System.out.println(Arrays.toString(B));
        int plus,minus;
        plus=1;
        minus=0;

        for (int i =0; i<B.length; i++){
            if (B[i]>0){
               B[i] =plus;

            } else if (B[i]<0){
                B[i] = minus;

            }
        }
        System.out.println(Arrays.toString(B));



        //=============================================================================================================
        System.out.println();
        System.out.println("#7");
//        7) вывести таблицу умножения на 10
        int multiplier = 10;
        int res;
        int [] m = {1,2,3,4,5,6,7,8,9,10};
        for (int i =0; i<m.length; i++){
            res = m[i] * multiplier;
            System.out.println(m[i] + " * " + multiplier + " = " + res);

        }


        //=============================================================================================================
        System.out.println();
        System.out.println("#8");
//        8) поменять местами минимальный и максимальный элемент массива

        int [] n = {5,234,68,3,32,-8,35,46,1,6,33};
        int maxN, minN;
        maxN = minN = n[0];
        int indexMax, indexMin;
        indexMax=indexMin=0;
        int temp;


        for (int i =0; i < n.length; i++){
            if (n[i]>maxN){
                maxN=n[i];
                indexMax = i;

            } else if (n[i]<minN){
                minN = n[i];
                indexMin = i;

            }

        }
        System.out.println("Max number is: " + maxN + "\nMin number is: " + minN);
        System.out.println("Max index is: " + indexMax +"\nMin index is: " + indexMin);

        n[indexMax]= minN;
        n[indexMin] = maxN;
        System.out.println("New array is: " + Arrays.toString(n));




    }

}

