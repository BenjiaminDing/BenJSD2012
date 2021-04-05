package 练习0402.reflect;/*
Create by Benjiamin at2021/4/3  15:42 BenJSD2012
*/

import java.lang.reflect.Method;

public class reflectDemo5_6 {
    public static void main(String[] args) throws Exception {
        Person p=new Person();
        p.say("大家好---");
        p.say("大家good---",7);

        Class cls=Class.forName("练习0402.reflect.Person");
        Object o= cls.newInstance();
        Method m=cls.getMethod("say",String.class);
        m.invoke(o,"everyone Pretty");
        Method m2=cls.getMethod("say",String.class,int.class);
        m2.invoke(o,"guys welldone",4);

        //+++++++++++++++++++++++++++++++++++++++++++++++

       // Method  m3=cls.getMethod("hehe");// 由于hehe()  修饰符是private所以 没有访问权限 爆出运行期异常:NoSuchMethodException:
        // 解决办法是 新的 强制办法
        Method m3=cls.getDeclaredMethod("hehe");
        m3.setAccessible(true);// 获得强制访问权限

     m3.invoke(o);

    }
}
