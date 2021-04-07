package io.pract;/*
Create by Benjiamin at2021/4/6  22:54 BenJSD2012
*/

import java.io.*;

public class CopyDemo2 {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("./myFile/demop.txt"));
            BufferedOutputStream   bos=new BufferedOutputStream(new FileOutputStream("./myFile/demopf.txt"));
            int d;
            while((d=bis.read())!=-1){
                bos.write(d); }
            bos.close();
            bis.close();
            System.out.println("文件复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
