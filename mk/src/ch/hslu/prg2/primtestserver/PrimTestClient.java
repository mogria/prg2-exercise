package ch.hslu.prg2.primtestserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class PrimTestClient {

    public static void main(String[] args) throws IOException {
        int port = Integer.parseInt(args[1]);
        String host = args[0];
        BufferedReader keyStream
                = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try (Socket client = new Socket(host, port)) {
                PrintWriter outStream
                        = new PrintWriter(client.getOutputStream());
                BufferedReader inStream
                        = new BufferedReader(
                                new InputStreamReader(client.getInputStream()));
                String line = inStream.readLine();
                System.out.println(line);
                line = keyStream.readLine();
                outStream.println(line);
                outStream.flush();
                line = inStream.readLine();
                System.out.println(line);
            }
        }
    }
}
