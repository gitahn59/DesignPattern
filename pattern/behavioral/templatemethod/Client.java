package pattern.behavioral.templatemethod;

public class Client {
    public static void main(String args[]) {
        AbstractClass concreteClass = new ConcreteClass();
        concreteClass.doSomething();
    }
}
