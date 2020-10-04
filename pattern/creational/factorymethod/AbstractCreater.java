package pattern.creational.factorymethod;

public abstract class AbstractCreater {
    public void doSomething(){
        System.out.println("base");
    }

    public abstract Product factoryMethod();
}
