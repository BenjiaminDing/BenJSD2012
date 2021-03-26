package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序自定义类型元素
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(9,9));
        list.add(new Point(8,6));
        list.add(new Point(18,22));
        list.add(new Point(35,1));
        list.add(new Point(5,4));
        System.out.println(list);

//        Collections.sort(list);

        MyComparator comp = new MyComparator();
        Collections.sort(list,comp);

        //下面写法就解决了侵入性问题
//        Collections.sort(list,new Comparator<Point>() {
//            public int compare(Point o1, Point o2) {
//                int olen1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
//                int olen2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
//                return olen1-olen2;
//            }
//        });



//        Collections.sort(list,(o1,o2)->
//                o1.getX()*o1.getX()+o1.getY()*o1.getY()-
//                o2.getX()*o2.getX()-o2.getY()*o2.getY()
//        );

        System.out.println(list);

    }
}
class MyComparator implements Comparator<Point>{
    /**
     * compare方法用于定义o1与o2比较大小的规则
     * 返回值的规定:
     * 当返回值>0,则表示o1>o2
     * 当返回值<0,则表示o1<o2
     * 当返回值=0,则表示o1=o2
     */
    public int compare(Point o1, Point o2) {
        int olen1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
        int olen2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
        return olen2-olen1;
    }
}


