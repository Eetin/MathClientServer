import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * Created by Eetin on 06.03.2015.
 */
public class MathClient {

    public static void main(String[] args) {

        try {
            TTransport transport = new TSocket("localhost", 9095);
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            MathService.Client client = new MathService.Client(protocol);

            System.out.println(client.add(10, 20));
            System.out.println(client.sub(10, 20));
            System.out.println(client.mul(10, 20));
            System.out.println(client.div(10, 20));
            System.out.println(client.mod(10, 20));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
