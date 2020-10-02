package pattern.structural.decorator;

public class Client {
    public static void main(String args[]) {
        Component component = new ConcreteComponent();
        Component decorator1 = new Decorator(component, "촛불", 5);
        Component decorator2 = new Decorator(decorator1, "과자", 15);
        Component decorator3 = new Decorator(decorator2, "풍선", 10);

        System.out.println(component.doSomething() + "의 비용은 " + component.getCost());
        System.out.println(decorator1.doSomething() + "의 비용은 " + decorator1.getCost());
        System.out.println(decorator2.doSomething() + "의 비용은 " + decorator2.getCost());
        System.out.println(decorator3.doSomething() + "의 비용은 " + decorator3.getCost());
    }
}
