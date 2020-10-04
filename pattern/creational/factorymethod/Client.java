package pattern.creational.factorymethod;

public class Client {
    public static void main(String args[]) {
        AbstractCreater concreteCreater = new ConcreteCreater();
        Product product = concreteCreater.factoryMethod();
        product.runSomething();
    }
}
