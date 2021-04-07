package io.pract;/*
Create by Benjiamin at2021/4/6  22:44 BenJSD2012
*/

import java.io.FileInputStream;

import java.io.FileOutputStream;

public class CopyDemo {
    public static void main(String[] args) {
        try {
            FileInputStream  fis=new FileInputStream("raf.dat");
            FileOutputStream  fos=new FileOutputStream("./myFile/raf_benjia1.dat");
            int len;
            byte[]  data=new byte[10*1024];
            while((len=fis.read(data))!=-1){
                fos.write(data,0,len);
            }
            fis.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
