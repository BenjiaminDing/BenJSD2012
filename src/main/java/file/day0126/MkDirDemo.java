package file.day0126;

import java.io.File;
// Modified by Benjiamin at 2021/1/26  11:10
/**
 * 使用File创建一个目录
 */
public class MkDirDemo {
    public static void main(String[] args) {
        //在当前目录下新建一个目录demo
        File dir = new File("demo");
        if(dir.exists()){
            System.out.println("该目录已存在!");
        }else{
            dir.mkdir();//将当前File对象表示的目录创建出来
            System.out.println("目录已创建!");
        }
    }
}
