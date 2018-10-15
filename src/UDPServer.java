import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args)throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String data = "This is UDP Message";
        DatagramPacket packet = new DatagramPacket(data.getBytes(),data.getBytes().length, InetAddress.getLocalHost(),9999);
        datagramSocket.send(packet);
        datagramSocket.close();
    }
}
