package pattern.structural.adapter._class;

public class Adapter extends Adaptee implements Target { // Target을 구현하고 Adaptee를 상속하는 Adapter Class

    @Override
    public void doSomething() {
        System.out.print("Class Adapter : ");
        this.doSpecial(); // 상속한 adaptee의 메서드
    }
}
