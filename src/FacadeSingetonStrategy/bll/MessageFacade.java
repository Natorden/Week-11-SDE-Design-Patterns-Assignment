package FacadeSingetonStrategy.bll;

import FacadeSingetonStrategy.be.Message;
import FacadeSingetonStrategy.dal.DALFacade;

public class MessageFacade implements IMessageLoggingFacade {


    //private final MessageBoardDAO messageBoard = new MessageBoardDAO();
    private final DALFacade dalFacade = DALFacade.getInstance();
    private final MessageCreator messageCreator = new MessageCreator();

    @Override
    public Message logMessage(String msg) {
        Message m = messageCreator.createMessage(msg);
        dalFacade.createAMessage(m);
        return m;
    }

}
