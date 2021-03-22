package FacadeSingetonStrategy.bll;

import FacadeSingetonStrategy.be.Message;
import FacadeSingetonStrategy.dal.DALFacade;

import java.util.List;

public class MessageListDisplay {
    //private final MessageBoardDAO messageBoard = new MessageBoardDAO();
    private final DALFacade dalFacade = DALFacade.getInstance();

    public List<Message> getAllMessages() {
        return dalFacade.getAllMessages();
    }
}
