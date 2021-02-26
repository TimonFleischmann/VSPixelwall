
    import java.net.*;
    import java.io.*;
    import java.util.*;
    import java.util.jar.*;
    import java.lang.reflect.*;

import javax.websocket.*;

@ServerEndpoint(value = "/chat/{username}")
public class ChatEndpoint {

    @OnOpen
    public void onOpen(Session session) throws IOException {
        // Get session and WebSocket connection
    }

    @OnMessage
    public void onMessage(Session session, Message message) throws IOException {
        // Handle new messages
    }

    @OnClose
    public void onClose(Session session) throws IOException {
        // WebSocket connection closes
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        // Do error handling here
    }
}
