package pattern.structural.decorator;

public class Decorator implements Component {

    Component component;
    String decoration;
    int cost;

    public Decorator(Component component, String decoration, int cost) {
        this.component = component;
        this.decoration = decoration;
        this.cost = cost;
    }

    @Override
    public String doSomething() {
        return this.decoration + ", " + component.doSomething();
    }

    @Override
    public int getCost() {
        return this.cost + component.getCost();
    }
}
