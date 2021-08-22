package objects;

public class OperationWithWindow {
    public void plusSize(Window window){
        window.setSize(window.getSize()+100);
    }

    public void minusSize(Window window){
        window.setSize(window.getSize()-100);
    }
}
