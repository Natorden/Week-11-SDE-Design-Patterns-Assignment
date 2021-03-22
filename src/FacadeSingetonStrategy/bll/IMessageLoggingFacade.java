package FacadeSingetonStrategy.bll;

import FacadeSingetonStrategy.be.Message;

public interface IMessageLoggingFacade {

    Message logMessage(String msg);

}
