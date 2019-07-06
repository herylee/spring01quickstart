package hello;

import com.sun.org.apache.xalan.internal.xsltc.dom.AnyNodeCounter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : leelee
 * create at:  2019-07-04  00:05
 * @description: 11111
 */

/*
 * spring特性
 * 1，帮助我们自动的创建对象
 *
 *
 * */



@ComponentScan
public class ApplicationSpring {

    public static void main(String[] args) {


        System.out.println("application");

        //直接构建了另外两个类的对象，运行了构造方法


        /*MessagePrinter printer = new MessagePrinter();

        MessageService service = new MessageService();


        printer.setService(service);

        printer.printMessage();
*/

        //接口不能被实例化
        //spring 容器所在的位置


        //容器SPRING初始化
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);


        //获取MessagePrinter对象
        MessagePrinter printer =  context.getBean(MessagePrinter.class);





        //获取MessageService对象


    }


}
