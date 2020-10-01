package pattern.structural.proxy;

public class Proxy implements Subject {

    RealSubject realSubject; 

    /*
    proxy가 처리할 수 있는 작업은 직접 처리
     */
    @Override
    public String doSomething() {
        return "proxy도 수행 가능";
    }

    /*
    proxy가 처리하지 못하는 작업의 경우
    RealSubject에게 처리를 위임하여 결과만 전달
     */
    @Override
    public String doSpecial() { 
        System.out.println("Proxy의 전처리");
        if(realSubject==null)
            realSubject = new RealSubject();
        String result = realSubject.doSpecial();
        System.out.println("Proxy의 후처리");
        return result;
    }
}
