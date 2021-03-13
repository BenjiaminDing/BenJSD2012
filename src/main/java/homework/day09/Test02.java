package homework.day09;
/**
 * 修改下面代码的编译
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
//			Foo.dosome();//没有放在run方法中
			public void run() {
				Foo.dosome();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Foo.dosome();
			}
		};
		t1.start();
		t2.start();
	}
}
class Foo{
	public static void dosome() {
//		synchronized (this) {//静态方法看不到this
		synchronized (Foo.class) {
			System.out.println("hello!");
		}
	}
}

