package methods;

public class Car {
    private int length;
    private int height;
    private int width;
    private int weight;
    private  boolean isNew;
    private String nameOfBuyer;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getNameOfBuyer() {
        return nameOfBuyer;
    }

    public void setNameOfBuyer(String nameOfBuyer) {
        this.nameOfBuyer = nameOfBuyer;
    }



    public int calculateCarDetail (){
        int calculateValues = length * width * weight;
        return calculateValues;
    }

    public int calculateCarDetail2 (){
        int calculateValues = length * width;
        return calculateValues;
    }


    public boolean getIsNew (){
        return isNew;
    }

    public int calculateAndPrint(int length2, int height2,int weight3, String nameOfBuyer ){
        int calculatedVales = length2*height2*weight3;
        this.nameOfBuyer = nameOfBuyer;
        return calculatedVales;
    }

    public void newMethod (String name) {
        System.out.println("Hello " + name);
    }

    public void newMethod (String name, String name2) {
        System.out.println("Hello " + name + ", " + name2);
    }

    public void newMethod (String...name) {
        for(String testName: name ){
            System.out.println("Hello " + testName );
        }

    }

}
