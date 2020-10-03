# 템플릿 메서드 패턴
> 행위 패턴의 한 종류   
> 작업 일부를 서브 캘래스에서 구현하도록 하여 구조는 바꾸지 않으면서 수행 내역을 바꾸는 패턴   
> 추상 클래스를 상속하므로 1개의 클래스만 상속할 수 있음.    
> 전체적으로 동일하면서 부분적으로 다른 메서드의 중복을 최소화할 떄 유용   

## 구성
* 템플릿(견본)을 제공하는 메서드
* 하위 클래스에게 구현을 강제하는 추상 메서드
* 하위 클래스가 선택적으로 오버라이딩할 수 있는 메서드(Hook)

![image](https://user-images.githubusercontent.com/16396879/94996528-31b9b780-05e0-11eb-81b4-bae8fa822905.png)               
[PlantUML 보기](http://www.plantuml.com/plantuml/uml/hOwnJiCm48PtFuN7HbKhvegXLIO6fZx1rJubfzftaNq14U0j6CB0m1imCF96X7V0840ASqT_lk_JlyqAIViOJ3uITv0WMXSWvvrgeaElUE64zpIWFJFc-yVk3baJEAs_NkRMBBti9QAsnCsYsbm9URE4dwFBmiN_uLRaE4VtlzbQs2LKF5bsjjEUhnCrhQvj7GXPxSPwx90zihjPJ4_ZzFnQ_LVkLbwkUJMVLim66HC46a19kDXlxo_Zn-D3PRQbsCVm2G00)

