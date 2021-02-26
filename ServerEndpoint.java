import java.io.IOException;

import java.util.logging.Logger;



import javax.websocket.*;

@ServerEndpoint(value = "/Pixelwall")

public class ServerEndpoint {



    private Logger logger = Logger.getLogger(this.getClass().getName());



    @OnOpen

    public void onOpen(Session session) {

        logger.info("Connected ... " + session.getId());

    }



    @OnMessage

    public String onMessage(String message, Session session) {

        switch (message) {

        case "quit":

            try {

                session.close(new CloseReason(CloseCodes.NORMAL_CLOSURE, "Site closed"));

            } catch (IOException e) {

                throw new RuntimeException(e);

            }

            break;

        }

        return message;

    }



    @OnClose

    public void onClose(Session session, CloseReason closeReason) {

        logger.info(String.format("Session %s closed because of %s", session.getId(), closeReason));

    }

}
