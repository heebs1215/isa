import java.net.*;
import java.io.*;
import javax.swing.*;
public class Client{
public static void main(String args[]){
try{
	Socket socket=new Socket("127.0.0.1",9999);
	ObjectOutputStream oOutStream=new ObjectOutputStream(socket.getOutputStream());
	ObjectInputStream oInStream=new ObjectInputStream(socket.getInputStream());
	String message=JOptionPane.showInputDialog("Please enter a message");
	oOutStream.writeObject(message);
	String echoedMessage=(String)oInStream.readObject();
	JOptionPane.showMessageDialog(null,echoedMessage);
	socket.close();
}
catch(Exception e){System.out.println(e.getMessage());}



}


}