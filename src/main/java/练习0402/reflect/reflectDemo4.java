package 练习0402.reflect;/*
Create by Benjiamin at2021/4/3  12:21 BenJSD2012
*/

import java.lang.reflect.Method;

public class reflectDemo4 {

    public static void main(String[] args) throws Exception {
        //        Class cls = Class.forName("reflect.Person");
        Class cls = Class.forName("reflect.Person");
        //实例化
        Object o = cls.newInstance();//new Person()

//        Method m = cls.getMethod("sayHello");
        Method m = cls.getMethod("sayHello");
        m.invoke(o);//p.sayHello()
    }
}
