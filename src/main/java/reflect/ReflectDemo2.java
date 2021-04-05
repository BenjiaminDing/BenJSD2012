package reflect;

import java.util.Scanner;
import java.util.Date;
/**
 * 使用反射机制实例化对象
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {



//            java.util.Date 日期类

        //1加载要实例化类的类对象
        Class cls = Class.forName("reflect.Person");



        //2通过类对象实例化--jdk9 方法newInstance() 不能使用了--
        Object o = cls.newInstance();//Class表示的类必须有无参构造器--
        System.out.println(o.toString());//  输出发现  Person{name='张三', age=22}  ,就是我们同包下的Person类

    }
}
