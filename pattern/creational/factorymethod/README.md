# 팩토리 메서드 패턴

> 생성 패턴의 한 종류.
> 상위 클래스에서는 객체를 생성하는 인터페이스만 정의   
> 실제 생성은 하위 클래스에서 인스턴스를 생성   
> 객체의 생성 시점은 알지만 어떤 객체를 생성해야 할지 알 수 없을 때 객체 생성을 하위 클래스에 위임

## 특징
> 객체를 생성하기 위해 인터페이스를 정의하지만,    
> 어떤 클래스를 생성할지는 서브클래스가 결정   

![ifactorymethod](https://user-images.githubusercontent.com/16396879/95017498-933b5e00-0694-11eb-9956-0f26c9e7c10b.png)               
[PlantUML 보기](http://www.plantuml.com/plantuml/uml/dP4nIaD148RxESMM2I4Fwv0Y8PM58EG4czr9N7oPaTbvYb4hxMmjj4Zd0LGilP7FEpYOLyWg29Rxx__z_mmpoUf5ctKD-JZHYHU_Tg7sEKzL9IqQnVt0D4yRT7i0Vf5LVD2TnKsxvqpGAmfSm23odDUeHubMlVxeb5E4mT8iBES79dCqzL0uDa7X2c2NCsCAWeh_pqbadFsZwqIBa8RAZ9-LVzgB7TtuSZWi1tOZjq92yNNQU4rClNRxzlvq__5mruUkmS0gyXbLPRN1Wj_8syVsvVMBB8tZgiQbLh-qjzVRzkOP9aZHJla9)
