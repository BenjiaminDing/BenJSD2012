package 练习0402.xml;/*
Create by Benjiamin at2021/4/3  10:29 BenJSD2012
*/

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class ParseXmlDemo {
          /*
            解析XML的大致流程
            1:创建SAXReader
            2:使用SAXReader读取xml文档并生成Document对象
            3:通过Document对象获取根元素
            4:按照XML文档的结构从根元素开始逐级获取子元素以达到解析目的
         */
          public static void main(String[] args) {


              try {
                  SAXReader reader=new SAXReader();
                  Document  doc=reader.read("src/main/java/练习/xml/emplist.xml");// 第二步
//                  Document  doc=reader.read("emplist");// 第二步
                  Element  root=doc.getRootElement();// 第三步
                 String  name= root.getName();
                  System.out.println("根标签:"+name);
                  /*下面是第四步*/
                  // 解析多有员工的信息
                 List<Element> list=root.elements("emp");
                  System.out.println("集合一共有:"+list.size()+"对<emp>标签");
                  // 遍历集合 获取每一个<emp> 标签 ,并且通过他获取每个员工的所有信息, emp> 下面的都是同级别 标签可以使用遍历
                  for(Element  empEle:list){
                      //获取员工各级装换为相应的变量
                      //1获取名字
                      Element  nameEle=empEle.element("name");
                      String  ename=nameEle.getText();
                      System.out.println(ename);

                      //获取员工年龄
                      Element ageEle = empEle.element("age");
                      int age = Integer.parseInt(ageEle.getText());

                      //获取性别
//                String gender = empEle.element("gender").getText();
                      String gender = empEle.elementText("gender");

                      //获取工资
                      int salary = Integer.parseInt(empEle.elementText("salary"));

                    int id=    Integer.parseInt(  empEle.attribute("id").getValue());

                      System.out.println(id+","+ename+","+age+","+gender+","+salary);
                  }
//  for循环结束



              } catch (DocumentException e) {
                  e.printStackTrace();
              }

          }












}
