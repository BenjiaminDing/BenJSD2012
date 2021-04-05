package 苍老师二进制;

public class Demo02 {
    public static void main(String[] args) {
        /**
         * 2进制书写繁琐的问题
         * 1. Java 7（java1.7） 开始提供了2进制直接量的前缀 0b
         * 2. 可以添加下滑线分段，下滑线不影响数值
         */
        //    10进制直接量
        int n = 50;
        //    0b开头是2进制直接量
        int m = 0b110010;
        System.out.println(n);
        System.out.println(m);
        //2进制直接量书写繁琐，可以添加下滑线分段，下滑线不影响数值
        n = 0b01011101_00011100_01111110_10010101;
        //       5   d    1   c    7   e    9   5
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
        m = 0x5d1c7e95;
        System.out.println(Integer.toBinaryString(m));

        int num = 0x5713a9ac;
        System.out.println(Integer.toBinaryString(num));

    }
}
