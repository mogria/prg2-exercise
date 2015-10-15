/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Dethrall
 */
public class Calculator extends javax.swing.JFrame implements ActionListener{

    private GroupLayout layout;
    private final JTextField display = new JTextField();
    private final JPanel controls = new JPanel();
    
    private final JButton digit0 = new JButton();
    private final JButton digit1 = new JButton();
    private final JButton digit2 = new JButton();
    private final JButton digit3 = new JButton();
    private final JButton digit4 = new JButton();
    private final JButton digit5 = new JButton();
    private final JButton digit6 = new JButton();
    private final JButton digit7 = new JButton();
    private final JButton digit8 = new JButton();
    private final JButton digit9 = new JButton();
    private final JButton plus = new JButton();
    private final JButton minus = new JButton();
    private final JButton times = new JButton();
    private final JButton divide = new JButton();
    private final JButton equals = new JButton();
    private final JButton comma = new JButton();
    private final JButton clear = new JButton();
    private final JButton sign = new JButton();
    
    private double cache = 0;
    private String action = "";
   
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(250, 210);
        setResizable(false);
        setLayout(new BorderLayout());
        
        display.setText("0");
        display.setEditable(false);
        
        digit0.setText("0");
        digit0.setActionCommand("0");
        digit0.addActionListener(this);
        
        digit1.setText("1");
        digit1.setActionCommand("1");
        digit1.addActionListener(this);
        
        digit2.setText("2");
        digit2.setActionCommand("2");
        digit2.addActionListener(this);
        
        digit3.setText("3");
        digit3.setActionCommand("3");
        digit3.addActionListener(this);
        
        digit4.setText("4");
        digit4.setActionCommand("4");
        digit4.addActionListener(this);
        
        digit5.setText("5");
        digit5.setActionCommand("5");
        digit5.addActionListener(this);
        
        digit6.setText("6");
        digit6.setActionCommand("6");
        digit6.addActionListener(this);
        
        digit7.setText("7");
        digit7.setActionCommand("7");
        digit7.addActionListener(this);
        
        digit8.setText("8");
        digit8.setActionCommand("8");
        digit8.addActionListener(this);
        
        digit9.setText("9");
        digit9.setActionCommand("9");
        digit9.addActionListener(this);
        
        plus.setText("+");
        plus.setActionCommand("plus");
        plus.addActionListener(this);
        
        minus.setText("-");
        minus.setActionCommand("minus");
        minus.addActionListener(this);
        
        times.setText("*");
        times.setActionCommand("times");
        times.addActionListener(this);
        
        divide.setText("/");
        divide.setActionCommand("divide");
        divide.addActionListener(this);
        
        equals.setText("=");
        equals.setActionCommand("equals");
        equals.addActionListener(this);
        
        comma.setText(".");
        comma.setActionCommand("comma");
        comma.addActionListener(this);
        
        clear.setText("C");
        clear.setActionCommand("clear");
        clear.addActionListener(this);
        
        sign.setText("S");
        sign.setActionCommand("sign");
        sign.addActionListener(this);
               
        add(display, BorderLayout.NORTH);
        add(controls, BorderLayout.SOUTH);
        
        controls.setLayout(new GridLayout(5, 4));
        
        controls.add(digit7);
        controls.add(digit8);
        controls.add(digit9);
        controls.add(divide);
        
        controls.add(digit4);
        controls.add(digit5);
        controls.add(digit6);
        controls.add(times);
        
        controls.add(digit1);
        controls.add(digit2);
        controls.add(digit3);
        controls.add(minus);
        
        controls.add(digit0);
        controls.add(comma);
        controls.add(equals);
        controls.add(plus);
        
        controls.add(sign);
        controls.add(clear);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String display = this.display.getText();
        Double currentValue = Double.valueOf(display);
        
        switch (e.getActionCommand()){
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "comma":
                if(display.equals("0")){
                    display = "";
                }
                
                String value = e.getActionCommand();
                if(display.contains(".") && value.equals("comma")){
                    break;
                }
                else if(value.equals("comma")){
                    value = ".";
                }
                
                display += value;
                                
                this.display.setText(display);
                break;
            case "plus":
            case "minus":
            case "times":
            case "divide":
                cache = currentValue;
                this.display.setText("0");
                action = e.getActionCommand();
                break;
            case "equals":
                
                Double newValue = currentValue;
                
                switch (action){
                    case "plus":
                        newValue = cache + currentValue;
                        break;
                    case "minus":
                        newValue = cache - currentValue;
                        break;
                    case "times":
                        newValue = cache * currentValue;
                        break;
                    case "divide":
                        if(currentValue == 0){
                            this.display.setText("#DIV0Error");
                            cache = 0;
                        }
                        else{
                            newValue = cache / currentValue;
                        }
                        break;
                }
                
                this.display.setText(newValue.toString());
                
                break;
            case "clear":
                break;
            case "sign":
                break;
            default:
                throw new UnsupportedOperationException("Not supported yet.");
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
