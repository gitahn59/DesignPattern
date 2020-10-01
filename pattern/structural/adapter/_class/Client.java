package pattern.structural.adapter._class;

public class Client {
    public static void main(String args[]) {
        Target target = new Adapter();
        target.doSomething();
    }
}
