/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw4;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import sun.tools.jar.resources.jar;

/**
 *
 * @author Diego
 */
public class Calculator_v2 extends javax.swing.JFrame implements ActionListener {

    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonMal;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonGeteilt;
    private javax.swing.JButton jButtonGleich;
    private javax.swing.JTextField jTextField;
    private javax.swing.JPanel jPanel1;
    private double cache1 = 0;
    private double cache2 = 0;
    private String action = "=";
    
    
    /**
     * Creates new form Calculator_v2
     */
    public Calculator_v2() {
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);   
        setResizable(false);
        setMaximumSize(new java.awt.Dimension(250, 210));
        setMinimumSize(new java.awt.Dimension(250, 210));
        
        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButtonMal = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonGeteilt = new javax.swing.JButton();
        jButtonGleich = new javax.swing.JButton();
        jTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        
        jTextField.setText("0");
        jTextField.setEditable(false);
        
        jButton0.setText("0");
        jButton0.setActionCommand("0");
        jButton0.addActionListener(this);
        
        jButton1.setText("1");
        jButton1.setActionCommand("1");
        jButton1.addActionListener(this);
        
        jButton2.setText("2");
        jButton2.setActionCommand("2");
        jButton2.addActionListener(this);
        
        jButton3.setText("3");
        jButton3.setActionCommand("3");
        jButton3.addActionListener(this);
        
        jButton4.setText("4");
        jButton4.setActionCommand("4");
        jButton4.addActionListener(this);
        
        jButton5.setText("5");
        jButton5.setActionCommand("5");
        jButton5.addActionListener(this);
        
        jButton6.setText("6");
        jButton6.setActionCommand("6");
        jButton6.addActionListener(this);
        
        jButton7.setText("7");
        jButton7.setActionCommand("7");
        jButton7.addActionListener(this);
        
        jButton8.setText("8");
        jButton8.setActionCommand("8");
        jButton8.addActionListener(this);
        
        jButton9.setText("9");
        jButton9.setActionCommand("9");
        jButton9.addActionListener(this);
        
        jButtonC.setText("C");
        jButtonC.setActionCommand("C");
        jButtonC.addActionListener(this);
        
        jButtonS.setText("S");
        jButtonS.setActionCommand("S");
        jButtonS.addActionListener(this);
        
        jButtonMal.setText("*");
        jButtonMal.setActionCommand("*");
        jButtonMal.addActionListener(this);
        
        jButtonPlus.setText("+");
        jButtonPlus.setActionCommand("+");
        jButtonPlus.addActionListener(this);
        
        jButtonMinus.setText("-");
        jButtonMinus.setActionCommand("-");
        jButtonMinus.addActionListener(this);
        
        jButtonGeteilt.setText("/");
        jButtonGeteilt.setActionCommand("/");
        jButtonGeteilt.addActionListener(this);
        
        jButtonGleich.setText("=");
        jButtonGleich.setActionCommand("=");
        jButtonGleich.addActionListener(this);
        
        setLayout(new BorderLayout());
        
        add(jTextField, BorderLayout.NORTH);
        add(jPanel1, BorderLayout.SOUTH);
        jPanel1.setLayout(new GridLayout(5,4));
        jPanel1.add(jButton7);
        jPanel1.add(jButton8);
        jPanel1.add(jButton9);
        jPanel1.add(jButtonGeteilt);
        jPanel1.add(jButton4);
        jPanel1.add(jButton5);
        jPanel1.add(jButton6);
        jPanel1.add(jButtonMal);
        jPanel1.add(jButton1);
        jPanel1.add(jButton2);
        jPanel1.add(jButton3);
        jPanel1.add(jButtonMinus);
        jPanel1.add(jButton0);
        jPanel1.add(jButtonS);
        jPanel1.add(jButtonGleich);
        jPanel1.add(jButtonPlus);
        jPanel1.add(jButtonC);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
            case "0":
                cache1 = cache1 * 10 + 0;
                jTextField.setText("" + cache1);
                break;
            case "1":
                cache1 = cache1 * 10 + 1;
                jTextField.setText("" + cache1);
                break;
            case "2":
                cache1 = cache1 * 10 + 2;
                jTextField.setText("" + cache1);
                break;
            case "3":
                cache1 = cache1 * 10 + 3;
                jTextField.setText("" + cache1);
                break;
            case "4":
                cache1 = cache1 * 10 + 4;
                jTextField.setText("" + cache1);
                break;
            case "5":
                cache1 = cache1 * 10 + 5;
                jTextField.setText("" + cache1);
                break;
            case "6":
                cache1 = cache1 * 10 + 6;
                jTextField.setText("" + cache1);
                break;
            case "7":
                cache1 = cache1 * 10 + 7;
                jTextField.setText("" + cache1);
                break;
            case "8":
                cache1 = cache1 * 10 + 8;
                jTextField.setText("" + cache1);
                break;
            case "9":
                cache1 = cache1 * 10 + 9;
                jTextField.setText("" + cache1);
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                cache2 = cache1;
                cache1 = 0;
                action = e.getActionCommand();
                jTextField.setText("" + cache1);
                break;
            case "S":
                
                break;
            case "C":
                cache1 = 0;
                cache2 = 0;
                action = "=";
                jTextField.setText("" + cache1);
                break;
                
            case "=":
                switch(action){
                    case "+":
                        cache2 = cache1 + cache2;
                        jTextField.setText("" + cache2);
                        break;
                    case "-":
                        cache2 = cache1 - cache2;
                        jTextField.setText("" + cache2);
                        break;
                    case "*":
                        cache2 = cache1 * cache2;
                        jTextField.setText("" + cache2);
                        break;
                    case "/":
                        cache2 = cache1 / cache2;
                        jTextField.setText("" + cache2);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        
        if(jTextField.getText().equals("42.0")){
            jTextField.setText("#YOLO");
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator_v2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator_v2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
