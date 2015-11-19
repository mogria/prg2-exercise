/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex09;

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
public class ChatClient{
    
    private InetAddress serverIP;
    private String ChatInput;    
    
    public ChatClient(){
        ChatInput = "";
        try{
            serverIP = InetAddress.getByName("10.3.98.100");
        }
        catch(UnknownHostException ex){
            System.out.println("Unable to resovle Host: " + ex);
        }
    }
    
    /**
     * Method to test the ChatServer
     */
    public void echoClient(){
        
        try(
            Socket serverSocket = new Socket(serverIP, 9000);
            BufferedReader in = new BufferedReader(new InputStreamReader
               (serverSocket.getInputStream()));
            PrintWriter out = new PrintWriter(serverSocket.getOutputStream());
            BufferedReader SysIn = new BufferedReader(new InputStreamReader(
                System.in));
            ){
            System.out.println("Connection established");
            
            String inStream;
            while((inStream = SysIn.readLine()) != null){
                System.out.println(inStream + " verschickt.");
                out.println(inStream);
                out.flush();
                System.out.println("Echo: " + in.readLine());
                if(inStream.equals("exit")){
                    break;
                }
            }
        }
        catch(IOException ex){
            System.out.println("Exeption: " + ex);
            
        }
        finally{
            System.out.println("Chat client closed.");
        } 
    }
    
    /**
     * Main Method for the Chat Client.
     */
    public void chatter(){
        try(
            Socket serverSocket = new Socket(serverIP, 9000);
            ){
            System.out.println("Connection established");
            
            OutputHandler output = new OutputHandler(serverSocket);
            new Thread(output).start();
            InputHandler input = new InputHandler(serverSocket);
            new Thread(input).start();

            while(true){
                if(!(ChatInput.equals(""))){
                    System.out.println(ChatInput);
                    ChatInput = "";
                }
                try {
                Thread.sleep(0);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
        catch(IOException ex){
            System.out.println("Exeption: " + ex);
        }
    }
    
    public class OutputHandler implements Runnable{
   
        Thread thread;
        Socket socket;

        public OutputHandler(Socket socket){             
            this.socket = socket;
        }

        @Override
        public void run(){
            //System.out.println("Thread OutputHandler gestartet.");
            try(
                PrintWriter out = new PrintWriter(socket.getOutputStream());
                BufferedReader sysIn = new BufferedReader(new InputStreamReader
                (System.in));
                )
            {
                String inLine;
                String ChatOutput;
                while((inLine = sysIn.readLine()) != null){
                    ChatOutput = inLine;
                    //System.out.println("ChatOutput: " + ChatOutput + " eingelesen.");
                    if(!(ChatOutput.equals(""))){
                        out.println(ChatOutput);
                        out.flush();
                        //System.out.println("ChatOutput: " + ChatOutput + " gesendet.");
                        ChatOutput = "";
                    }
                }
            }
            catch(IOException ex){
                System.out.println("Error in InputHandler: " + ex);
            }            
        }
    }
    
    public class InputHandler implements Runnable{
   
        Thread thread;
        Socket socket;

        public InputHandler(Socket socket){   
            this.socket = socket;
        }

        @Override
        public void run(){
            //System.out.println("Thread InputHandler gestartet.");
            try(
                BufferedReader in = new BufferedReader(new InputStreamReader
                (socket.getInputStream()));
                )
            {
                while(true){
                    String inStream;
                    while((inStream = in.readLine()) != null){
                        if(!(inStream.equals(""))){
                            ChatInput = inStream;
                            //System.out.println("ChatInput: " + ChatInput + " empfangen.");
                        }
                    }
                }
            }
            catch(IOException ex){
                System.out.println("Error in InputHandler: " + ex);
            }         
        }
    }
    
    public static void main(String[] args) {
        ChatClient chat1 = new ChatClient();
        chat1.chatter();
    }
}
