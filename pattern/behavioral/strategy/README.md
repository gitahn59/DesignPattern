# 전략 패턴
> 행위 패턴의 한 종류   
> 클라이언트는 다양한 전략 중에서 하나를 선택해 컨텍스트에 주입.      
> 객체의 행위를 동적으로 바꾸고 싶은 경우 직접 행위를 수정하지 않고    
> 전략을 바꾸어 유연하게 확장      
> 템플릿 메서드 패던과 유사하며, 인터페이스를 상속하므로 좀 더 유연함

## 구성
* 전략 메서드를 가진 전략 객체
* 전략 객체를 사용하는 컨텍스트
* 컨텍스트에 전략 객체를 주입하는 클라이언트

![strategy](https://user-images.githubusercontent.com/16396879/94989083-0669a500-05ad-11eb-8db5-6a1899c6ee5a.png)            
[PlantUML 보기](http://www.plantuml.com/plantuml/uml/XOw_IWD148VxUOe5cnmXY_KH925Lwdk2zNRSBExDXjavDOa-WPMWe8M588YjvB4kx-0VrWFXm6xWzttCDqjYMDecG3htj3Pi6bK7az9SXFrfAxYi8rL-Y-eOu6THYqY2LxA3eoHi1DschF81OswfYWtAofCR5UL5z1Pk09Oao6UcHlMBxc1iun3QFwaP1V_5SusQQlPk9LejWaSILIgBQoIBL6z6tVDZzx8lUZXERBoaIH_pHS-TOtH6VAHHztPtU7Wle9-dr_fRq7-oiiXeWjzcyVQr-zWVdkuBo1bQdmn90sqp9DisuHC0)

