package pattern.structural.adapter.object;

public class Client {
    public static void main(String args[]) {
        Target target = new Adapter(new Adaptee());
        target.doSomething();
    }
}
