package pattern.creational.factorymethod;

public class ConcreteCreater extends AbstractCreater{
    @Override
    public void doSomething() {
        super.doSomething();
    }

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
