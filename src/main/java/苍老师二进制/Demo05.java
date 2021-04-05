package 苍老师二进制;

public class Demo05 {
    public static void main(String[] args) {
        /**
         * 正数的编码是环形编码， 最大值挨着最小值，也就是说：
         * 最大值加1得到最小值
         * 讨论：正数增加时候溢出得到负数对么？为什么？
         * 答案：不对！溢出多的时候还会变成正数
         * 溢出结果是随机数么？
         * 答案：溢出结果是一个明确的值，但是这个值没有实际意义
         */
        int max = Integer.MAX_VALUE;
        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(max+1));
        System.out.println(max + 100);
        System.out.println(max + max + 100);
    }
}
