package pract复习包;/*
Create by Benjiamin at2021/3/25  13:17 BenJSD2012
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList_Compara {
    public static void main(String[] args) {
        List<Point> list=new ArrayList<>();

        list.add(new Point(5,3));
        list.add(new Point(8,14));
        list.add(new Point(14,21));
        list.add(new Point(20,38));
        list.add(new Point(100,30));
        System.out.println(list);
                /*
            该sort方法在排序是要求集合元素必须实现了Comparable接口,否则编译不通过.
            当我们使用某个API的方法时,其要求我们为之改动其他地方的代码后才可以使用时,
            这种情况就具有了侵入性,这不利于程序的后期维护.
         */

        MyComparator  c=new MyComparator();
        Collections.sort(list,c);
        System.out.println("排序结果:"+list);

    }
}

class  MyComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1,Point o2) {
        int olen1=o1.getX()^2+o1.getY()^2;
        int olen2=o2.getX()^2+o2.getY()^2;


        return olen1-olen2;
    }
    /*
     * compare方法用于定义o1与o2比较大小的规则
     * 返回值的规定:
     * 当返回值>0,则表示o1>o2
     * 当返回值<0,则表示o1<o2
     */

    /*  comparable---和comparator  区别*/

}
