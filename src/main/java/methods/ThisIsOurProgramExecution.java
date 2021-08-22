package methods;

public class ThisIsOurProgramExecution {
    public static void main(String[] args) {
        Car car = new Car();
        car.setWeight(2000);
        car.setWidth(2);
        car.setLength (5);
        car.setHeight(1);
        car.setNew(false);

        Car car2 = new Car();
        car2.setWeight(3000);
        car2.setWidth(3);
        car2.setLength(6);
        car2.setHeight(2);
        car2.setNew(true);

        int multiply = car.calculateCarDetail();
        int multiply2 = car2.calculateCarDetail();
        System.out.println("Car 1 is: " + multiply + "| Is that new one? " + car.getIsNew());
        System.out.println("Car 2 is: " + multiply2 + "| Is that new one? " + car2.getIsNew());


        Car car4 = new Car();
        int multiply4 = car.calculateAndPrint(1,11,211, "test");
        System.out.println(multiply4 + "\n" +car4.getNameOfBuyer());

        System.out.println("Car 1: " + car.getLength() + " \nCar 2: " + car2.getLength());

        car4.newMethod("Name1234");
        car2.newMethod("name1", "name2");
        car.newMethod("test", "test1", "test2","test3", "test4", "test5");
    }
}
