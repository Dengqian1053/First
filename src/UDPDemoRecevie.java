import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class UDPDemoRecevie {
	public static void main(String[] args){
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(10000);
		} catch (SocketException e) {
			e.printStackTrace();
		}
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		try {
			ds.receive(dp);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(new String(dp.getData()));
		ds.close();
	}
}
