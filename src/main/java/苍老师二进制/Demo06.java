package 苍老师二进制;

public class Demo06 {
    public static void main(String[] args) {
        /**
         * 验证补码互补对称公司
         * -n = ~n+1 最小值除外！
         */
        int n = -8;
        int m = ~n + 1;
        System.out.println(n);
        System.out.println(m);
        //运算原理
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(~n));
        System.out.println(Integer.toBinaryString(~n+1));

        /**
         *
         */
        n = Integer.MIN_VALUE;
        System.out.println(n);
        System.out.println(~n+1);

    }
}
