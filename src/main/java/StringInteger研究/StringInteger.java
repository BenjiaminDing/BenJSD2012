package StringInteger研究;/*
Create by Benjiamin at2021/4/2  9:59 BenJSD2012
*/
//  本类用于研究   基本数据类型和包装类   字符串(涉及常量池的研究
public class StringInteger {
    public static void main(String[] args) {
        int i=29;

    // 上面的涉及  两次自动转换
     String  str1=i+"0";

     String  str2=Integer.valueOf(i).toString()+"0";
     String  str3=Integer.toString(Integer.valueOf(i))+"0";
     String  str4=String.valueOf(Integer.valueOf(i))+"0";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }

}



