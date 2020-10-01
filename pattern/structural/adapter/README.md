# 어댑터 패턴
> 구조 패턴의 한 종류    
> 변환기, 서로 다른 두 인터페이스 사이에 통신이 가능하게 하는 것   
> 즉, 관계성이 없는 인터페이스를 변환하여 같이 사용 가능하도록 해줌

> 클라이언트가 요구하는 인터페이스와 호환되지 않는 클래스를     
> 어댑터를 두어 클라이언트가 원하는 인터페이스로 동작하도록 함 

## 1. 오브젝터 어댑터
* 오브젝트 어댑터는 구성(Composition) 관계를 통해 어댑터 패턴을 구현한다.
* Composition을 통해 Adapter가 Adaptee를 변수로 포함한다. 

![object adapter](https://user-images.githubusercontent.com/16396879/94794465-dab4b680-0416-11eb-9529-83441aca5862.png)      
[PlantUML 보기](http://www.plantuml.com/plantuml/uml/ZOw_IWD14CRxUOe5cpibX_KXaiFAEhx0k3jU1lVFiZid6BMpixNGmaAmj57YIydw3eRpX9IfPc2-ts--UHPCCZWB-P9zn8HEQOivToA9pmUXKntyWbUa3e6zKBf0JUeCKqy2Dt1WmY8uaYNxlghRgy06xW16XUeCHg6qYUtXk5BR_SrTE9hqaJIZtGgTM2OlgadSBwKvdigeLXcAv0rvVLsLbwVokgvXkXtTDir_dKqm4LfUeN3mLNbuAv_hd-V76gQ_QZQQP_jRX0ukXimZyVtrNku_QfYJDuEplm00)

> Client : Target 인터페이스를 요구하는 클래스     
> Target : Client가 요구하는 인터페이스   
> Adaptee : Target을 만족하지 않는 클래스   
> Adapter : Adaptee 클래스를 변수로 가지고 Target 인터페이스를 구현하여 Clinet의 요구를 만족

## 2. 클래스 어댑터
* 상속을 사용하여 어댑터 패턴을 구현한다.

![class adapter](https://user-images.githubusercontent.com/16396879/94794141-742f9880-0416-11eb-93cf-18fb0f5a9868.png)   
[PlantUML 보기](http://www.plantuml.com/plantuml/uml/ZT0nIWD15CRnVaunvIwInJg895XPnmiyPput3sVVB6zV1AEUmDOY5Ya43o2IqXkvti4bhB2bzVo--SDRT4PgcoQvxfQb9QN6XqHTjpHJljuOBaEM5M_XJnsBGMyem5-HrZ3tu4vYNkK6jcQfYt9-bpcw9-UEN_XbfDQW_sCOMOl0b2Re8Z74VALShwqw7zj-xYDQI8I4-wBVx_gtG-d6jxF7glgh3r11YRTadANedz_xpyFFwqlfnkwWPxE9hY7GoM3_zVsnEmuMa3YSwXS0)

> Client : Target 인터페이스를 요구하는 클래스     
> Target : Client가 요구하는 인터페이스   
> Adaptee : Target을 만족하지 않는 클래스   
> Adapter : Adaptee를 상속하고, Target 인터페이스를 구현하여 Client의 요구를 만족