# 템플릿 콜백 패턴(견본/회신 패턴)
> 행위 패턴의 한 종류   
> 전략 패턴의 변형, DI(의존성 주입)에서 사용하는 특별한 형태의 전략 패턴         
> 템플릿 콜백 패턴은 전략 패턴과 모든 것이 동일하지만 전략을 익명 내부 클래스로 정의해서 사용   

cf) 익명 클래스 : 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스(일회용)

## 특징
1. 전달된 전략은 caller의 메서드나 변수를 참조할 수 있으므로 유연한 접근이 가능.   
2. 따라서 callee가 원하는 시점에 caller의 메서드를 실행 할 수 있음.        

## 구성
* 전략 메서드를 구현하는 익명 클래스 객체
* 전략 메서드를 사용하는 컨텍스트
* 컨텍스트에 익명 클래스 객체를 주입하는 클라이언트

![templatecallback](https://user-images.githubusercontent.com/16396879/94996308-d76c2700-05de-11eb-9589-4e87fb860498.png)       
[PlantUML 보기](http://www.plantuml.com/plantuml/uml/ROyn3e9044NxFSMK49EDDJ46GqND2TRT4JR2BDaTL3JUmyR2EtWi3Y4n28tTPFxxB_bfOEMvQseHZfPQvLK3kbOXx9YztNUCkNPKs2l2MeXl0faZnWlVnCftLBW6kR9KHe6zOYpxf9YEE3avQyHTY9mO_K5fX5ysberRkWiwoM4ZlIqhbf3L5eaX0OCjaa7IVJGy7yFh7S-mDEvCSZlR_zFf-1YNVW00)

