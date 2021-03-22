package FacadeSingetonStrategy.dal;

import FacadeSingetonStrategy.be.Message;

import java.io.FileNotFoundException;
import java.util.List;

public interface IDataAccessLayer {

    List<Message> getAllMessages();

    void createAMessage(Message message);
}
