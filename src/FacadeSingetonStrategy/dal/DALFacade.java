package FacadeSingetonStrategy.dal;

import FacadeSingetonStrategy.be.Message;
import FacadeSingetonStrategy.dal.db.MessageBoardDAO;
import FacadeSingetonStrategy.dal.localfile.MessageBoardLocal;
import java.util.List;

public class DALFacade implements IDataAccessLayerFacade{

    private static DALFacade dalFacade = new DALFacade();
    private MessageBoardDAO database = new MessageBoardDAO();
    protected MessageBoardLocal local = new MessageBoardLocal();
    /**
     * Select between DATABASE or LOCAL
     * use "database" or "local"
     */
    private IDataAccessLayer selectedDAO = local;

    public static DALFacade getInstance(){
        return dalFacade;
    }

    @Override
    public void setAccessType(IDataAccessLayer selectedDAO){
        this.selectedDAO = selectedDAO;
    }

    @Override
    public void createAMessage(Message message){
        selectedDAO.createAMessage(message);
    }

    @Override
    public List<Message> getAllMessages(){
        return selectedDAO.getAllMessages();
    }
}
