package pattern.behavioral.templatemethod;

public class ConcreteClass extends AbstractClass{

    @Override
    public void abstractMethod() {
        System.out.println("ConcreteClass에서 일한다.");
    }

    @Override
    public void hookMethod() {
        //super.hookMethod();
        System.out.println("ConcreteClass에서 overriding");
    }
}
