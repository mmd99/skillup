package objects;

public class ExecutorOverWindow {
    public static void main(String[] args) {

        OperationWithWindow operationWithWindow = new OperationWithWindow();
        Window window = new Window(1);
        System.out.println("Window size #1" );
        System.out.println(window.size);

        System.out.println("Window size #2" );
        operationWithWindow.plusSize(window);
        System.out.println(window.size);

        System.out.println("Window size #3" );
        operationWithWindow.minusSize(window);
        System.out.println(window.size);
    }
}
