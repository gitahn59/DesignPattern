package pattern.structural.proxy;

public class Client {
    public static void main(String args[]) {
        Subject subject = new Proxy();
        System.out.println(subject.doSomething());
        System.out.println(subject.doSpecial());
    }
}
