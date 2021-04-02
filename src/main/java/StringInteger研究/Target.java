package StringInteger研究;/*
Create by Benjiamin at2021/4/2  10:40 BenJSD2012
*/

public class Target {

    public  synchronized void demo(){
        System.out.println(        Thread.currentThread().getName()+" dddd");

              try {

                  Thread.sleep(1000);
                      } catch (InterruptedException e) {
                          e.printStackTrace();
                      }

        System.out.println(        Thread.currentThread().getName()+" dddd");


    }
}

class t3{


    public static void main(String[] args) {
        Target  target=new Target();
        Thread  th1=new Thread(){
            @Override
            public void run() {

                target.demo();
            }
        };

        Thread  th2=new Thread(){
            @Override
            public void run() {

                target.demo();
            }
        };

        th1.start();
        th2.start();
    }

}


//  笔试题都是  一二阶段基础