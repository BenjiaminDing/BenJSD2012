package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK5之后推出了一个特性:增强型for循环，也称为新循环
 * 新循环不取代传统for循环的工作，它只是用来让我们用相同的语法遍历集合或数组使用。
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] arr = {"one","two","three","four","five"};
        for (int i=0;i<arr.length;i++){
            String str = arr[i];
            System.out.println(str);
        }
        //新循环在编译器编译后就改为了普通的for循环
        for (String str : arr){
            System.out.println(str);
        }

        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        /*上面是遍历数组 不涉及迭代器
           如果 新循环遍历集合,  编译器会把它改为迭代器,传输java--会被编译器改回成迭代器。因此注意，不要在遍历的过程中通过集合
            的方法增删元素。-----

  因为使用新循环,内部是封装了迭代器,但是我们看不到,也调用不到,所以 不能在新循环里面 对集合元素 改动--新循环只是对集合遍历作用
            如果想对集合增删 ,就自己 按基础的步骤, 调用 迭代器  Iterator it = c.iterator();  hasnext()-----
         */
        for (String str : c){
            System.out.println(str);
        }

    }
}


//map 16k
/*
Arrlist
*
* */



