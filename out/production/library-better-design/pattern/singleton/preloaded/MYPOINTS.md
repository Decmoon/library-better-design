预加载单例模式
-
**使用频率**：低


优点：
- 
+ 线程安全

缺点：
- 
+ 预加载静态对象，当该类没有被调用时，由于对象无法被GC，会占用内存资源
