/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class ChatClientView extends JFrame{
    
    private JPanel chatPanel;
    private JPanel controlPanel;
    private JTextArea chatArea;
    private JTextField chatField;
    private JButton sendButton;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 500;
    
    public ChatClientView(){
        super("Chat");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        
        chatPanel = new JPanel();
        controlPanel = new JPanel();
        chatArea = new JTextArea();
        chatField = new JTextField(3);
        sendButton = new JButton("Send");
        
        chatArea.setEditable(false);
        
        setResizable(false);
        setLayout(new GridBagLayout());
        add(chatPanel);
        add(controlPanel);
        chatPanel.setBackground(Color.white);
        chatPanel.setLayout(new GridLayout(2, 1));
        chatPanel.add(chatArea, BorderLayout.NORTH);
        chatPanel.add(chatField, BorderLayout.SOUTH);
        
        controlPanel.setLayout(new BorderLayout());
        controlPanel.add(sendButton, BorderLayout.SOUTH);
        
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatClientView().setVisible(true);
            }
        });
    }
    
}
