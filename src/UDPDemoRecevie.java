import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPDemoRecevie {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(10000);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);
		ds.receive(dp);
		System.out.println(new String(dp.getData()));
		ds.close();
	}
}
