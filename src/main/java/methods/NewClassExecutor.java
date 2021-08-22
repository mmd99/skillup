package methods;

public class NewClassExecutor {

    public void plusValue(int number){
        number = number+100;
        System.out.println("number inside method " + number);
    }

    public void minusValue(int number){
        number = number-100;
    }

    public static void main(String[] args) {
        NewClassExecutor newMethod = new NewClassExecutor();
        int ourNumber  = 5;
        System.out.println("Result is: ");
        System.out.println(ourNumber);

        newMethod.plusValue(ourNumber);
        System.out.println("New number is: " + ourNumber);

    }
}
