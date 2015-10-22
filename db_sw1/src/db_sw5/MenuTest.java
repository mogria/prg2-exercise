/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw5;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Diego
 */
public class MenuTest extends JFrame {
    
    public MenuTest(){
        
        super("Menu Test Application");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        setSize(500,300);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenu menuHelp = new JMenu("Help");
        JMenuItem miFileNew = new JMenuItem("New");
        JMenuItem miFileOpen = new JMenuItem("Open");
        JMenuItem miFileExit = new JMenuItem("Exit");
        JMenuItem miHelpAbout = new JMenuItem("About");
        
        menuFile.add(miFileNew);
        menuFile.add(miFileOpen);
        menuFile.addSeparator();
        menuFile.add(miFileExit);
        
        menuHelp.add(miHelpAbout);
        
        menuBar.add(menuFile);
        menuBar.add(menuHelp);
        
        setJMenuBar(menuBar);

        miFileExit.addActionListener(e -> {
            System.exit(0);
        });
        
        miHelpAbout.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Copyright Diego Bienz", "About this Application", INFORMATION_MESSAGE);
        });
        
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTest().setVisible(true);
            }
        });
    }
}
