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
import java.awt.GridBagConstraints;
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
        GridBagConstraints c = new GridBagConstraints();
        
        chatPanel = new JPanel();
        controlPanel = new JPanel();
        chatArea = new JTextArea();
        chatField = new JTextField(3);
        sendButton = new JButton("Send");
        
        chatArea.setEditable(false);
        setLayout(new GridBagLayout());
        c.fill = GridBagConstraints.VERTICAL;
        c.fill = GridBagConstraints.HORIZONTAL;
        
        c.weighty = 1;   //request any extra vertical space
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 0;
        
        add(chatPanel, c);
        c.fill = GridBagConstraints.VERTICAL;
        c.anchor = GridBagConstraints.LINE_END;
        c.gridx = GridBagConstraints.REMAINDER;
        c.ipadx = 150;
        c.gridy = 0;
        add(controlPanel, c);
        
        controlPanel.setBackground(Color.red);
        chatPanel.setBackground(Color.white);
        chatPanel.setLayout(new GridLayout(2, 1));
        chatPanel.add(chatArea, BorderLayout.NORTH);
        chatPanel.add(chatField, BorderLayout.SOUTH);
        
        controlPanel.setLayout(new BorderLayout());
        controlPanel.add(sendButton, BorderLayout.SOUTH);
        
        //pack();
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatClientView().setVisible(true);
            }
        });
    }
    
}
