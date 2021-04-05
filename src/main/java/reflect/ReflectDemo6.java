package reflect;

import java.lang.reflect.Method;

public class ReflectDemo6 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
//        p.hehe();//hehe（） 是私有的方法----编译不通过

        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

//        Method m = cls.getMethod("hehe");
        // getMethod()  只能调到公开的方法  私有的钓不到


        //获取到本类自己定义的方法,包含私有方法
        Method m = cls.getDeclaredMethod("hehe");
        m.setAccessible(true);//强制要求访问
        m.invoke(o);
    }
}
