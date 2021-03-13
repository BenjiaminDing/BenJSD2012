package homework.day11;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 改错题
 * 
 * 程序需求:向一个List集合中添加10个数字1-10，并将它们
 * 遍历出来并输出到控制台。
 *
 * @author Xiloer
 *
 */
public class Test01 {
	public static void main(String[] args) {
		//1:泛型不能写基本类型
		//2:接口是不能实例化的
		//3:List导包错误,不应当是java.awt.List,应当是java.util.List
//		List<int> list = new List<int>();
		List<Integer> list = new ArrayList<Integer>();
		//少了向集合中添加10个元素的操作
		for(int i=1;i<=10;i++){
			list.add(i);
		}
		//迭代器应当也指定泛型,并且泛型的类型与集合元素指定的泛型一致即可
//		Iterator it = list.iterator();
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int i = it.next();
			//遍历过程不能连续调用两次next()!!!!!
//			System.out.println(it.next());
			System.out.println(i);
		}
	}
}





