package my;

public class New {
    public static void main(String[] args) {
//        int [] mas = new int[12];
//        int maxNumber = -16;
//        int maxIndex = 0;
//
//        for (int i = 0; i < mas.length; i++) {
//            mas[i] = (int)(Math.random()*31)-15;
//            if(maxNumber <= mas[i]){
//                maxNumber = mas[i];
//                maxIndex = i;
//            }
//            System.out.print(mas [i]+ " ");
//            }
//
//        System.out.println("Индекс максимального элемента: " + maxIndex);



        int [] mas = {55,9,7,33,85,5,0,5,88};
        int maxNumber=mas[0];
        //int maxIndex = mas[0];

        for (int i = 0; i < mas.length; i++) {

            if(maxNumber <= mas[i]){
                maxNumber = mas[i];
               // maxIndex = i;
            }
        }
//        System.out.println(maxIndex);
        System.out.println(maxNumber);
    }
    }

