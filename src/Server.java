import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

/**
 * Created by Eetin on 06.03.2015.
 */
public class Server {

    public static void main(String[] args) {

        try {
            MathServer handler = new MathServer();
            MathService.Processor processor = new MathService.Processor(handler);
            TServerTransport serverTransport = new TServerSocket(9095);
            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
            System.out.println("Starting the server...");
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
