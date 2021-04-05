package 练习0402.reflect;/*
Create by Benjiamin at2021/4/3  12:07 BenJSD2012
*/


import java.lang.reflect.Constructor;

public class reflectDemo2_3 {
    public static void main(String[] args) throws Exception {


        Class cls=Class.forName("练习0402.reflect.Person");
        Object  o=cls.newInstance();
//        Person p=(Person)o;
        System.out.println(o.toString());

        //+++++++++++++++++++++++++

    Constructor  c= cls.getConstructor(String.class,int.class);
   Object object= c.newInstance("李白",33);
        System.out.println(object);


    }
}
