观察者模式
- 

> decmoon:
观察者模式的最好例子就是各大平台的订阅系统，当用户选择成为观察者时，
被观察者如有变动，观察者就会收到提示信息。<br/>
github的star功能也可用观察者模式实现<br/>
本章的模型用例即模拟Github订阅与发布


**使用频率**：高

优点：
- 
+ 被观察者无需维护观察者信息，解耦
+ 观察者可自行选择是否参与观察


缺点：
- 
+ 如被观察者有多个观察者，更新通知会花费很多时间。(可采用多线程解决)



