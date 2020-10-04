package pattern.behavioral.templatecallback;

import pattern.behavioral.strategy.Strategy;

public class Context {
    public void runSomthing(Strategy strategy){
        strategy.doSomething();
    }
}
