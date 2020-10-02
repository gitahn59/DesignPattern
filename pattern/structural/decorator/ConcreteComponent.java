package pattern.structural.decorator;

public class ConcreteComponent implements Component {
    @Override
    public String doSomething() {
        return "plain";
    }

    @Override
    public int getCost() {
        return 30;
    }
}
