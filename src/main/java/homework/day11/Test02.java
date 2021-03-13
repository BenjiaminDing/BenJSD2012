package homework.day11;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 改错题
 * @author Xiloer
 *
 */
public class Test02 {
    //1:main方法的方法名拼的不对
    //2:main方法中的参数类型不对,应当是String的数组
//	public static void mian(String args) {
    public static void main(String[] args) {
	    //1:实例化语法错误!
        //2:ArrayList要求导包!
//		Collection<String> c = new ArrayList;
        Collection<String> c = new ArrayList<>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		for(String s : c) {
			System.out.println(s);
		}
	}
}



