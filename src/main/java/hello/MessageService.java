package hello;

import org.springframework.stereotype.Component;

/**
 * @author : leelee
 * create at:  2019-07-03  23:44
 * @description: messageservice
 */


/*component----- spring会帮我们创建对象，不再需要自己去写了*/

@Component
public class MessageService {

    //无参构造方法
    public MessageService() {
        super();

        System.out.println("messageservice");



    }

    public String getMessage() {


        return "hahaha";


    }


    public static void main(String[] args) {

    }

}
