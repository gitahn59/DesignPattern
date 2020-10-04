package pattern.behavioral.strategy;

public class ConcreteStrategy implements Strategy{

    @Override
    public void doSomething() {
        System.out.println("전략이 구현되었습니다.");
    }
}
