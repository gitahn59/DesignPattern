# 데코레이터 패턴
> 구조 패턴의 한 종류   
> 원본에 장식을 더하는 패턴. 프록시 패턴과 유사하지만    
> 데코레이터 패턴은 결과에 장식을 더해준다는 차이가 있음.   
> 설계원칙중 OCP(Open-Closed Principle)를 준수    

* 실제 서비스와 같은 이름의 메서드를 구현(인터페이스 구현)    
* 장식자는 실제 서비스에 대한 참조 변수를 가짐(Composition)
* 실제 서비스의 메서드와 같은 이름의 메서드를 호출
* 메서드 호출 전후로 별도의 로직 수행 가능

## 특징
1. 부가적인 작업(로깅, 인증, 네트워크 통신 등) 수행
2. 위임된 처리 결과에 장식을 더하여 리턴
3. 클라이언트 입장에서는 프록시나 실체 객체나 사용법은 동일
4. 기존에 구현되어 있는 클래스에 런타임에 필요한 기능을 추가해나가는 설계 패턴   
5. 기능확장이 필요할 때 상속의 대안으로서 사용가능

![image](https://user-images.githubusercontent.com/16396879/94926862-6b18f700-04fc-11eb-83ad-a67112ee3afb.png)         
[PlantUML 보기](http://www.plantuml.com/plantuml/uml/dPAnIiH048RxVOe5cqIvO1qiJix6Ea-mRiRSO38RPkSGJtq22nk5ixX2iB2m4BdIDp9v1vU0Q-04nMw7_RzlPvQPUZ4iYwPM_WofDMmQRMlZ_Q48uyb2uDWwAd09UbyX2V2fiQ1dhcaT0OcwL7kbArm3CaUgaZGlXCD1NIirU4AKB8D0H7ubZi0wDk8uo7Vi5vP7mLzV_BydHlH1nbZD9TEp6Y7KkIwX1Ig1x4NIhLVTuoOTnw-oqfrJjZrr81bCZKiZw2ZfRfwwjqt_SFSZ7JlNMgjOXFl9P7kwOAw0W4VozVl7wsgGVwTs0plkPlWGZmFGtxxqzy-fcWALOHS-0G00)

