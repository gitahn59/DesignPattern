# 싱글턴 패턴

> 생성 패턴의 한 종류.
> 객체를 하나만 만들어 사용하기 위한 패턴.
> 커넥션 풀, 스레드 풀, 디바이스 설정 객체 등과 같은 경우 인스턴스를 여러 개를 사용하면    
> 예상치 못한 결과가 발생할 수 있을 때 사용하는 패턴

## 구현 방법
1. new를 실행 할 수 없도록 생성자에 private 접근 제어자를 지정
2. 유일한 단일 객체를 반환할 수 있는 정적 메서드 구현
3. 유일한 단일 객체를 참조하는 정적 참조 변수 보유

### 문제점 
객체 생성 과정에서 경합 조건이 발생하여 1개 이상의 객체가 생성 될 수 있음.   
따라서 이에 대한 해결책으로 생성 과정에 임계구역을 설정해주어야 함.

## 구현
```java
public class Singleton{
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
}
``` 