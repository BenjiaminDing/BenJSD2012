package 苍老师二进制;

public class Demo01 {
    public static void main(String[] args) {
        /**
         * 2进制
         * Java 运算原理
         * 1. 编译， 将Java源文件编译为字节码（2进制）
         * 2. 运行程序
         */
        int n = 26; //编译以后： 110010
        //运行期间 n 一直都是 110010
        //Integer.toBinaryString(n) Java 提供的API方法
        //执行这个方法就可以将n在内存中实际的2进制情况输出
        System.out.println(Integer.toBinaryString(n));
        //println(int)参数是int的时候，println方法会自动
        //将2进制110010转换为“50”然后再输出
        System.out.println(n); //“50”
        /**
         * 输出0~200的2进制
         */
        for(int i=0; i<=200; i++){
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
