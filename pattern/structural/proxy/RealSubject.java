package pattern.structural.proxy;

public class RealSubject implements Subject{
    @Override
    public String doSomething() {
        return "Real도 수행 가능";
    }

    @Override
    public String doSpecial() {
        return "Real만 수행 가능";
    }
}
