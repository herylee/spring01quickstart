package hello;

/**
 * @author : leelee
 * create at:  2019-07-04  00:05
 * @description: 11111
 */


public class Application {

    public static void main(String[] args) {


        System.out.println("appppppppp");

        MessagePrinter printer = new MessagePrinter();

        MessageService service = new MessageService();


        printer.setService(service);

        printer.printMessage();


    }


}
