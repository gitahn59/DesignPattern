package pattern.behavioral.templatemethod;

public abstract class AbstractClass {
    public void doSomething(){
        abstractMethod();
        hookMethod();
    }

    public abstract void abstractMethod();

    public void hookMethod(){
        System.out.println("아무것도 안함");
    }
}
