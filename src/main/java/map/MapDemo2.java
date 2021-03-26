package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历
 * Map提供了三种遍历方式
 * 1:遍历所有的key
 * 2:遍历每一组键值对
 * 3:遍历所有的value(相对不常用)
 */
public class MapDemo2 {


    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",68);
        map.put("英语",97);
        map.put("物理",86);
        map.put("化学",99);
        System.err.println(map);
        /*
            遍历map所有的key 返回给一个集合Set原因是 原本Map中key不允许重复, 使用Set() 集合接收更贴切
            Set<K> keySet()
            将当前Map中所有的key以一个Set集合形式返回，遍历这个集合等同于遍历所有的key
              key不容许有重复的值
         */
        Set<String> keySetx = map.keySet();
        for(String key : keySetx){
            System.out.println("key:"+key);
        }

        /*
          Set<Map.Entry<K, V>> entrySet();
            遍历每一组键值对
            Set<Entry> entrySet()
            将当前Map中每一组键值对(一个Entry实例表示一组键值对)都存入到一个Set集合中,

            java.util.Map.Entry  Entry 是个内部接口它的每个实例表示一组键值对

         */
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        /* 泛型套泛型的使用---*/
        for(Map.Entry<String,Integer> e : entrySet){
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+":"+value);
        }
        /*
            Collection<V> values()
            将当前Map中所有的value以一个Collection形式返回。
         */
        Collection<Integer> values = map.values();
        for(Integer value : values){
            System.out.println("value:"+value);
        }
        /*      boolean containsKey(Object key);*/

   Boolean b1=     map.containsKey("数学");
    Boolean b2=    map.containsValue(99);
        System.out.println(b1);
        System.out.println(b2);

//        map.putAll(Map<String,Integer> "shux" ,89 );

    }
}
