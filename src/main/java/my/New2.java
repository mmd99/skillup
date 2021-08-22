package my;

public class New2 {
    public static void main(String[] args) {
        double[] myArray = {11, 5.8, 11.1, 10.9};

        // Переменной max задаем минимальное double-значение.
        double max = Double.MIN_VALUE;

        // Перебираем все элементы массива.
        for (int i = 0; i < myArray.length; i++) {
            // Переменной max с помощью метода Math.max() присваиваем максимальное значение
            // путем выбора наибольшего из двух значений ("старого" значения max и значения элемента).
            max = Math.max(max, myArray[i]);
        }

        // Выводим на экран наибольшее число массива myArray.
        System.out.println("Максимальный элемент в массиве myArray: " + max);


        //Max array's value
        int [] array1 = {12,5,32,7,32,-6,76,35,4,325,6,657,43,4,54,66};
        int max1=array1[0];
        int min = array1[0];
        for (int i =0; i<array1.length;i++){
            max= Math.max(max1, array1[i]);
            min= Math.min(min, array1[i]);
        }
        System.out.println(max1);
        System.out.println(min);
    }
}
