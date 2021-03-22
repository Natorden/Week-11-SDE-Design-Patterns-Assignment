package FacadeSingetonStrategy.bll;

import FacadeSingetonStrategy.be.Message;

public class MessageCreator {

    public Message createMessage(String msg){
        return new Message(1,msg);
    }

}
