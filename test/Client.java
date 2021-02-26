import java.io.*;
import java.net.*;

public class Client{
 public static void main(String[] args) throws Exception{
	Socket s =new Socket ("localhost",17013);
	PrintWriter out=new PrintWriter(s.getOutputStream());
out.println("hallo");
out.flush();

}
}
