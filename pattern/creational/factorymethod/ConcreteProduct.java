package pattern.creational.factorymethod;

public class ConcreteProduct implements Product{

    @Override
    public void runSomething() {
        System.out.println("I'm Concrete Product");
    }
}
