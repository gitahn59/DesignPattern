package pattern.structural.adapter.object;

public class Adapter implements Target{ // Target을 구현하는 Adapter Class

    protected Adaptee adaptee; // Target을 구현하지 않는 Class

    public Adapter(Adaptee adaptee) { // Compositin(구성)
        this.adaptee = adaptee;
    }

    @Override
    public void doSomething() {
        System.out.print("Object Adapter : ");
        this.adaptee.doSpecial();
    }
}
