/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW9_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Adrian
 */
public class PrimTestServer {

    public static void main(String[] args) throws IOException {
        int port = 8888;
        ServerSocket s = new ServerSocket(port);
        while (true) {
            System.out.println("Waiting for connection...");
            Socket client = s.accept();
            System.out.println(client + " accepted...");
            PrintWriter outStream
                    = new PrintWriter(client.getOutputStream());
            BufferedReader inStream
                    = new BufferedReader(
                            new InputStreamReader(client.getInputStream()));
            try {
                outStream.println("Number?");
                outStream.flush();
                String value = inStream.readLine();
                System.out.println(value + " beamed...");
                if (new BigInteger(value).isProbablePrime(99999999)) {
                    outStream.println(value + " is prim.");
                } else {
                    outStream.println(value + " is not prim.");
                }
            } catch (Exception ex) {
                System.err.println("Error: " + ex.getMessage());
                outStream.println("Error: " + ex.getMessage());
            } finally {
                outStream.flush();
                client.close();
            }
        }
    }
}
