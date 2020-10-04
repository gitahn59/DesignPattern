package pattern.behavioral.templatecallback;

import pattern.behavioral.strategy.Strategy;

public class Client {
    public static void main(String args[]) {
        String caller_string = "I'm Caller";

        Context context = new Context();
        context.runSomthing(new Strategy() {
            @Override
            public void doSomething() {
                System.out.println("익명 클래스로 전략 구현");
            }
        });

        context.runSomthing(new Strategy() {
            @Override
            public void doSomething() {
                System.out.println("익명 클래스로 다른 전략도 구현");
            }
        });

        context.runSomthing(new Strategy() {
            @Override
            public void doSomething() {
                System.out.println(caller_string);
            }
        });

    }
}
