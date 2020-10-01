# 프록시 패턴
> 구조 패턴의 한 종류   
> 어떤 객체에 대한 접근을 제어하는 용도로 대리인에 해당하는 객체를 제공하는 패턴

* 실제 서비스와 같은 이름의 메서드를 구현(인터페이스 구현)    
* 대리자는 실제 서비스에 대한 참조 변수를 가짐(Composition)
* 실제 서비스의 메서드와 같은 이름의 메서드를 호출
* 메서드 호출 전후로 별도의 로직 수행 가능

## 특징
1. 부가적인 작업(로깅, 인증, 네트워크 통신 등) 수행
2. 비용이 많이 드는 연산(DB 쿼리, 대용량 텍스트 처리 등)을 실제 필요 시점에 수행
3. 클라이언트 입장에서는 프록시나 실체 객체나 사용법은 동일

![proxy](https://user-images.githubusercontent.com/16396879/94818008-989c6c80-0438-11eb-82d2-7039d31fbfd0.png)
[PlantUML 보기](http://www.plantuml.com/plantuml/uml/dO-nIWD148RxVOe5cpibX_KX4h6o4-y9DdjZChexU-pEWOdw11Os2bfO21OMLfB7sdi7puqX4aXptJ0ptyV_ZmChpwqr8bmZDSehAxLH8PmmUvoq36VQKOKBa8S2YS5VAWsoQYTNe5dSYeFQLSu2pv2cMLvMxFiXRHlGgCncToz4CijpxsxcFRhdGPa_KtcncOSu4puirAb189Q5n-cCY-DrDrdA6XgW6aZFi_Zs4j-NkLWVZ-wAObMa__ljWGl5w2YB3n_nUzczFctz_WkucrW9zqSfocYBqSusBc1YkiUlxlap5sEWkhNc1m00)

## 종류
1. Virtual Proxy
> 주체 클래스가 인스턴스화 하는데 많은 메모리를 사용하는 경우 프록시를 두어 필요한 시점에 주체 클래스를 사용하도록 구현   

2. Protection Proxy
> 주체 클래스에 대한 접근을 제어하기 위한 경우 사용.    
> 프록시 클래스에서 클라이언트가 주체 클래스에 접근 할 때 접근 권한에 따라 허용 여부를 결정할 수 있음

3. Remote Proxy   
> 프록시 클래스는 로컬에 있고, 주체 클래스는 Remote에 있는 경우.
