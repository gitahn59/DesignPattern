package pattern.creational.singleton;

public class Singleton {
    private static Singleton INSTANCE; // 유일한 객체를 참조하는 변수

    private Singleton(){} // new를 막기 위한 private 생성자

    // 유일한 객체를 리턴하는 정적 메서드
    // 쓰레드를 사용하는 경우 객체 생성 과정에서 경합 조건이 발생할 수 있으므로
    // synchronized 키워드를 통해 임계구혁을 설정
    public static synchronized Singleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
