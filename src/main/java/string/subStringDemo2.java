package string;/*
Create by Benjiamin at2021/4/21  19:07 BenJSD2012
*/

public class subStringDemo2 {
    public static void main(String[] args) {
        //             01234567890
        String host = "www.tedu.cn";
        //截取域名
        String sub = host.substring(4,8);
        System.out.println(sub);

        //重载的substring传入一个参数为:从指定位置截取到字符串末尾
        sub = host.substring(4);
        System.out.println(sub);
    }




}
