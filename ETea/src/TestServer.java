import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class TestServer {

	public static final int portNum = 10000;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestServer server = new TestServer();
		server.main();
	}
	
	private void main() throws Exception{
		System.out.println("Hello Server!");

		ServerSocket serverSock = new ServerSocket(portNum);
		// System.out.println(serverSock.getLocalSocketAddress());
		System.out.println("Listening...");
		Socket sock = serverSock.accept();
		System.out.println("Accepted.");
		
		String inputCommand = null;
		
		InputStream in = sock.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(in);
		System.out.println("Read.");
		while (true) {
			Object o = ois.readObject();
			System.out.println(o.toString());
			inputCommand = o.toString();
		}
		
//		sock.close();
	}

}
