package 苍老师二进制;

public class Demo07 {
    public static void main(String[] args) {
        int n = 0x6e188fd5;
        int m = 0xff; //8位掩码 6位掩码 4位掩码 16位掩码
        int k = n & m;
        //按照2进制输出 n m k
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));
    }
}
