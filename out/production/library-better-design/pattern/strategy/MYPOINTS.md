策略模式
- 

> decmoon:
最初接触策略模式是在JDK的List接口源码中的sort方法，
其中参数为Comparator接口类型，用户可以根据需求自行improvement，
也可以导用系统中预先设定好的策略类<br/>
本篇模型用例采用 com.decmoon.shortcut 便捷开发包中的多线程部分（简码）<br/>
详见请点击 [Here](https://github.com/Decmoon/shortcut/blob/master/src/main/java/com/decmoon/shortcut/thread/MultithreadedBranch.java)


**使用频率**：中/高

优点：
- 
+ 提供用户可实现接口，接口内实现支持自由切换
+ 优秀的扩展性

缺点：
- 
+ 策略类数量会增多，每个策略都是一个类，复用的可能性很小<br/>
（推荐使用内部类、匿名内部类、lambda表达式解决）





