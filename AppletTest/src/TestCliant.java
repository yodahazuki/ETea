import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestCliant {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		TestCliant cliant = new TestCliant();
		cliant.main();
	}

	public void main() throws Exception, IOException {
		Socket sock = new Socket("192.168.1.168", 10000);		
		
		OutputStream out = sock.getOutputStream();
		ObjectOutputStream ois = new ObjectOutputStream(out);
		while(true){
			System.out.print(">>");
			String input = input();
			ois.writeObject(input);			
		}
//
//		out.close();
//		sock.close();
	}
	

	String input() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}

}
