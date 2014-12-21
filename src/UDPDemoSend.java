import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPDemoSend {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		byte[] buf = "hello lin fan! I love you!".getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);
		
		ds.send(dp);
		ds.close();
	}
}
