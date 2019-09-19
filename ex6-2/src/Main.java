import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(80);

        while (true){

            final Socket connection = socket.accept();

            /*
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    handleRequest(connection);
                }
            };
            */

            Runnable task = () -> handleRequest(connection);

            new Thread(task).start();
        }
    }
}