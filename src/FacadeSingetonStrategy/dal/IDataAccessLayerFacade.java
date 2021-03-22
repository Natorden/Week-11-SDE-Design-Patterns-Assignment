package FacadeSingetonStrategy.dal;

import FacadeSingetonStrategy.be.Message;

import java.util.List;

public interface IDataAccessLayerFacade {


    void setAccessType(IDataAccessLayer selectedDAO);

    void createAMessage(Message message);

    List<Message> getAllMessages();
}
