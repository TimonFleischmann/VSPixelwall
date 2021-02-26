 import java.net.*;
 import java.io.*;
 import java.util.*;
 import java.util.jar.*;
 import java.lang.reflect.*;
 import javax.websocket.*; 
 public class Runner{

   public static void main(String[] args) throws IOException{
     new Runner().doServe(17013);
  }
	public void doServe(int port) throws IOException{
	ServerSocket seso =new ServerSocket(17013);
	int num=0;
while(true){
System.out.println("waiting...");
Socket sock =seso.accept();
System.out.println("accepted");
}
	}
}
