package pattern.behavioral.strategy;

public class Client {
    public static void main(String args[]) {
        Strategy strategy = new ConcreteStrategy();
        Context context = new Context(strategy);
        context.runSomthing();
    }
}
