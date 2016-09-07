1.创建一个java类:HelloWorld.java

2.使用javah命令将HelloWorld生成.h的头文件

3.用VC6.0创建一个dll工程

4.添加jni.h,jni_md.h文件（在Java安装目录中）到工程目录中

5.在.cpp文件中引入HelloWorld.h的头文件并实现相应方法

6.编译成功后生成HelloWorld.dll文件

7.将HelloWorld.dll文件添加到path环境变量中

8.在Java文件中加载HelloWorld.dll文件在调用dll库中的方法