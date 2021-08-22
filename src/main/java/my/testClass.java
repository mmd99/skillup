package my;

public class testClass {
    public static void main(String[] args) {
        int[] mas1 = new int[10], mas2 = new int[10];
        double[] mas3 = new double[10];
        int j;
        j = 0;
        for(int i=0; i<mas1.length; i++){
            mas1[i]=(int)(Math.random()*9+1);
            mas2[i]=(int)(Math.random()*9+1);
            mas3[i]=(double)mas1[i]/mas2[i];
            System.out.print(mas1[i]+" ");
        }
        System.out.println();
        for(int i=0; i<mas2.length; i++) {
            System.out.print(mas2[i]+" ");
        }
        System.out.println();
        for(int i=0; i<mas3.length; i++) {
            System.out.print(mas3[i]+" ");
            if(mas3[i]%1==0) {
                j++;
            }
        }
        System.out.println("\n Kolichestvo tselih elementov v massive 3 ravno " + j);
    }
}
