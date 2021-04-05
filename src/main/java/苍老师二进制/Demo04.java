package 苍老师二进制;

public class Demo04 {
    public static void main(String[] args) {
        /**
         * 补码编码的规律
         * 1. 最大值：0+n个1
         *    - int类型最大值 0+31个1，
         *    - long类型最大值 0+63个1
         * 2. 最小值： 1+n个0
         *    - int类型最小值 1+31个0
         *    - long类型最小值 1+63个0
         * 3. -1 的补码编码：
         *    - int 类型 32个1
         *    - long 类型 64个1
         */
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long lmax = Long.MAX_VALUE;
        long lmin = Long.MIN_VALUE;
        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(min));
        System.out.println(Long.toBinaryString(lmax));
        System.out.println(Long.toBinaryString(lmin));
        int n = -1;
        long l = -1L;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Long.toBinaryString(l));



    }
}
