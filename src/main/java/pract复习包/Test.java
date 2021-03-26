package pract复习包;/*
Create by Benjiamin at2021/3/25  15:05 BenJSD2012
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


// Modified by Benjiamin at 2021/3/25  15:06
public class Test {

    public static void main(String[] args) {


        Map<Integer, Integer> params = new HashMap<>();
        params.put(1, 11);
        params.put(2, 22);


        Set<Map.Entry<Integer,Integer>> p =params.entrySet();


        for (Map.Entry entry : p) {
            System.err.println(entry.getKey());

//            System.out.println("键值对:"+entry.getKey());
//            System.out.println("键值对:"+entry.getValue());
            System.out.println("=========");
        }


        Map<Integer, Integer> params2 = new HashMap<Integer, Integer>();
        params2.put(3, 33);
        params2.put(5, 55);
        for (Map.Entry<Integer, Integer> entryAppend : params2.entrySet()) {
//            System.out.println(entryAppend.getKey());
//            System.out.println(entryAppend.getValue());
            System.out.println("==++++++++====");
        }


        params.putAll(params2);//此处调用putAll()方法。
//        putAll()  也是追加到后面没有覆盖效果


        for (Map.Entry<Integer, Integer> append : params.entrySet()) {
            System.out.println("benjiamin"+append.getKey());
            System.out.println("benjiamin"+append.getValue());

        }
    }
}


