package pattern.behavioral.strategy;

public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void runSomthing(){
        this.strategy.doSomething();
    }
}
