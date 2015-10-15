/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW5_GUI2;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Adrian
 */
public class Menu extends JFrame
{
    public static void main(String[] args) {
        Menu m = new Menu();
        m.setVisible(true);
    }
    
    JMenuBar bar = new JMenuBar();
    JMenu filemenu = new JMenu("File");
    JMenu helpmenu = new JMenu("Help");
    JMenuItem newItem = new JMenuItem("New");
    JMenuItem openItem = new JMenuItem("Open");
    JMenuItem exitItem = new JMenuItem("Exit");
    JMenuItem aboutItem = new JMenuItem("About");

    public Menu() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.setSize(500, 500);
        setLayout(new BorderLayout());
        
        exitItem.addActionListener(e-> System.exit(0));
        aboutItem.addActionListener(e-> JOptionPane.showMessageDialog(null, "Copyright 2015 Hochschule Luzern, Technik und Architektur", "Simple Menu Example", INFORMATION_MESSAGE));
        
        filemenu.add(newItem);
        filemenu.add(openItem);
        filemenu.addSeparator();
        filemenu.add(exitItem);
        bar.add(filemenu);
        helpmenu.add(aboutItem);
        bar.add(helpmenu);
        this.setJMenuBar(bar);

        
    }
    
    
}
