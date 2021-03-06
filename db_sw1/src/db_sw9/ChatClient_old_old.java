/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class ChatClient_old_old {
    private static final int DEFAULT_PORT = 32946;
    private static final String DEFAULT_IP = "10.3.100.122";
    
    public Socket socket;
    private int port;
    private InetAddress server;
    
    public ChatClient_old_old(){
        init();
        try {
            connect();
        } catch (IOException ex) {
            Logger.getLogger(ChatClient_old_old.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void init(){
        System.out.println("***************************************");
        System.out.println("Chat Client startet.");
        try {
            System.out.println("Your IP is: " + InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            System.out.println("Your IP couldn't be resolved: " + ex);
        }
        System.out.println("***************************************");
        System.out.println(" ");
        try(BufferedReader br = new BufferedReader
        (new InputStreamReader(System.in))){
            System.out.println("Enter server IP (default is " + DEFAULT_IP + "): ");
            String tempAddress = br.readLine();
            if(tempAddress.equals("")){
                tempAddress = DEFAULT_IP;
            }
            this.server = InetAddress.getByName(tempAddress);
            System.out.println("Enter portnumber (leave blank to use default): ");
            this.port = Integer.parseInt(br.readLine());
        }
        catch(IOException ex){}
        catch(NumberFormatException ex){
            this.port = DEFAULT_PORT;
        }
    }
    
    public void connect() throws IOException{
        String message = "";
        System.out.println("***************************************");
        System.out.println("Server: " + this.server);
        System.out.println("Port: " + this.port);
               
        BufferedReader keyStream = new BufferedReader(new InputStreamReader(System.in));       
        while (true) {          
            Socket client = new Socket(server, port);          
            PrintWriter outStream = new PrintWriter(client.getOutputStream());          
            BufferedReader inStream = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String line = inStream.readLine();
            System.out.println(line);
            line = keyStream.readLine();
            outStream.println(line);
            outStream.flush();
            line = inStream.readLine();
            System.out.println(line);
            client.close();    
        
        }
    }
}

