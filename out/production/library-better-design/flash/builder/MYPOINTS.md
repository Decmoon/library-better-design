Builder pattern 
-
> decmoon: <br/>
与设计模式中的建造模式不同，次建造模式针对对象创建的属性赋值 <br/>
传统对象创建，通过构造方法初始化参数会造成构造方法冗余，
后续发展出 Setter 的复制方法，但调用时依然繁琐，
故 EffectiveJava 中提出了一种新的设计理念<br/>

````
设计 假设创建一个容器，其中id，type，size是必要参数，其余参数为可选参数

      //必备参数
      private int id;
      //必备参数
      private String type;
      //必备参数 初始化容量
      private int size;
      //可选参数 最大容量
      private int max;
      //可选参数 最小容量
      private int min;
````

+ TraditionalClass 传统构建方法重载设计
     >代码冗余，构建方法过多，调用分辨不清且同类型值赋值容易出错<br/>
     故提出改进
````
  new TraditionalClass(1,"typeA",10);
  new TraditionalClass(1,"typeA",10,50);
  new TraditionalClass(1,"typeA",10,0);
````
     
+ TraditionalImproveClass   传统构建方法重载改进设计
    > 消除冗余代码，但构建方法过多的问题没有得到解决，调用分辨不清且同类型值赋值容易出错的问题依然存在
    ，故提出 setter 改进方案
````
  new TraditionalClass(1,"typeA",10);
  new TraditionalClass(1,"typeA",10,50);
  new TraditionalClass(1,"typeA",10,0);
````
+ SetterClass 构建方法 + Setter 设计
    > 代码不再冗余，构建方法单一不会出错，也是当前使用面极广的主流书写方式 （SpringBoot源码)<br/>
    但是如果非必须参数过多时，实例化代码块会占据很大空间，很不美观
````
Container containerA = SetterClass(1,"typeA",10);
containerA.setMax(50);
containerA.setMin(0);
......//如果存在其他非必要参数
......//如果存在其他非必要参数
````
**故EffectiveJava一书中提出了 Builder pattern 的概念**

+ 

**思想理念见：EffectiveJava-Chapter 2**

