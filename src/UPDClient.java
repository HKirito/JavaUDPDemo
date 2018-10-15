import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UPDClient {
    public static void main(String[] args)throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length);
        socket.receive(datagramPacket);
        System.out.println("Get Message is :"+ new String(buf,0,datagramPacket.getLength()));
        socket.close();
    }
}
