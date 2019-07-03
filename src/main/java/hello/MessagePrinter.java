package hello;

/**
 * @author : leelee
 * create at:  2019-07-03  23:51
 * @description: message print
 */


public class MessagePrinter {


    /*
    建立和service的关联关系
    */
    private MessageService service;

    //设置service的值
    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage() {

        System.out.println(this.service.getMessage());


    }


}
