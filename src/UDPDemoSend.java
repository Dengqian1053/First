import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


public class UDPDemoSend {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket();
		} catch (SocketException e) {
			e.printStackTrace();
		}
		byte[] buf = "hello lin fan! I love you!".getBytes();
		DatagramPacket dp = null;
		try {
			dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		try {
			ds.send(dp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ds.close();
	}
}
