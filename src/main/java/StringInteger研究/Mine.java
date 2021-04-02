package StringInteger研究;/*
Create by Benjiamin at2021/4/2  14:13 BenJSD2012
*/



    abstract class MineBase{
        abstract void amethod();
        static  int i;
    }


    public  abstract class Mine extends MineBase {

          int b;
        public static void main(String[] args) {
            int[] ar = new int[5];
            for (i = 0; i < ar.length; i++) {
                System.out.println(ar[i]);
            }

        }

        @Override
        void amethod() {


             int a;
            System.out.println("测试");


            String  str=new  String ("abc");
            // 上述过程创建了两个对象    具体过程 new String() 也是创建也是一个对象,类似数组
            // 常量的位置只能是在 成员 属性位置
            //  final  修饰的局部变量可以先声明后赋值,  但是成员变量 不行的
            //


        }

        // 抽象类可以继承抽象类,
        //  接口是可以多个继承的优点




    }

