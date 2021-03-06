/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW4_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Adrian
 */
public class Calculator extends javax.swing.JFrame implements ActionListener {

    
    private int operand1;
    private int operand2;
    private int result;
    private Operator operator;
    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
        
        operand1 = 99;
        operand2 = 99;
        result = 9999999;
        operator = Operator.UNKNOWN;
        
        this.btn0.addActionListener(this);
        this.btn1.addActionListener(this);
        this.btn2.addActionListener(this);
        this.btn3.addActionListener(this);
        this.btn4.addActionListener(this);
        this.btn5.addActionListener(this);
        this.btn6.addActionListener(this);
        this.btn7.addActionListener(this);
        this.btn8.addActionListener(this);
        this.btn9.addActionListener(this);
        
        this.btnPlus.addActionListener(this);
        this.btnMinus.addActionListener(this);
        this.btnMulti.addActionListener(this);
        this.btnDivision.addActionListener(this);
        
        this.btnEquals.addActionListener(this);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDisplay = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(250, 210));
        setResizable(false);
        setSize(new java.awt.Dimension(250, 210));

        txtDisplay.setName("txtDisplay"); // NOI18N

        btn7.setText("7");
        btn7.setName("btn7"); // NOI18N
        btn7.setPreferredSize(new java.awt.Dimension(41, 25));

        btn8.setText("8");
        btn8.setToolTipText("");
        btn8.setName("btn8"); // NOI18N
        btn8.setPreferredSize(new java.awt.Dimension(41, 25));

        btn9.setText("9");
        btn9.setName("btn9"); // NOI18N
        btn9.setPreferredSize(new java.awt.Dimension(41, 25));

        btnDivision.setText("/");
        btnDivision.setName("btnDivision"); // NOI18N

        btn4.setText("4");
        btn4.setToolTipText("");
        btn4.setName("btn4"); // NOI18N
        btn4.setPreferredSize(new java.awt.Dimension(41, 25));

        btn1.setText("1");
        btn1.setToolTipText("");
        btn1.setName("btn1"); // NOI18N
        btn1.setPreferredSize(new java.awt.Dimension(41, 25));

        btn5.setText("5");
        btn5.setToolTipText("");
        btn5.setName("btn5"); // NOI18N
        btn5.setPreferredSize(new java.awt.Dimension(41, 25));

        btn6.setText("6");
        btn6.setToolTipText("");
        btn6.setName("btn6"); // NOI18N
        btn6.setPreferredSize(new java.awt.Dimension(41, 25));

        btn0.setText("0");
        btn0.setName("btn0"); // NOI18N
        btn0.setPreferredSize(new java.awt.Dimension(41, 25));

        btn2.setText("2");
        btn2.setPreferredSize(new java.awt.Dimension(41, 25));

        btn3.setText("3");
        btn3.setName("btn3"); // NOI18N
        btn3.setPreferredSize(new java.awt.Dimension(41, 25));

        btnMulti.setText("*");
        btnMulti.setToolTipText("");
        btnMulti.setName("btnMulti"); // NOI18N

        btnMinus.setText("-");
        btnMinus.setName("btnMinus"); // NOI18N
        btnMinus.setPreferredSize(new java.awt.Dimension(41, 25));

        btnS.setText("S");
        btnS.setToolTipText("");
        btnS.setName("btnS"); // NOI18N

        btnEquals.setText("=");
        btnEquals.setName("btnEquals"); // NOI18N

        btnPlus.setText("+");
        btnPlus.setToolTipText("");
        btnPlus.setName("btnPlus"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMulti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnS)
                    .addComponent(btnEquals)
                    .addComponent(btnPlus))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
       int val = 99;
       
       JButton btn = (JButton)e.getSource();
       
       
       if (result != 9999999)
       {
           operand1 = 99;
           operand2 = 99;
           operator = Operator.UNKNOWN;
           result = 9999999;
           this.txtDisplay.setText("");
       }
       
       if (e.getSource() == btn0)
           val = 0;
       else if (e.getSource() == btn1)
           val = 1;
       else if (e.getSource() == btn2)
           val = 2;
       else if (e.getSource() == btn3)
           val = 3;
       else if (e.getSource() == btn4)
           val = 4;
       else if (e.getSource() == btn5)
           val = 5;
       else if (e.getSource() == btn6)
           val = 6;
       else if (e.getSource() == btn7)
           val = 7;
       else if (e.getSource() == btn8)
           val = 8;
       else if (e.getSource() == btn9)
           val = 9;
       
       if (operator == Operator.UNKNOWN && val != 99){
           String tmp = "";
           if (operand1 != 99)
               tmp = String.valueOf(operand1);
           
           tmp += String.valueOf(val);
           
           operand1 = Integer.valueOf(tmp);
            this.txtDisplay.setText(this.txtDisplay.getText() + String.valueOf(val));
           return;
               
       }else if (operator != Operator.UNKNOWN && val != 99){
         String tmp = "";
           if (operand2 != 99)
               tmp = String.valueOf(operand2);
           
           tmp += String.valueOf(val);
           
           operand2 = Integer.valueOf(tmp);
            this.txtDisplay.setText(this.txtDisplay.getText() + String.valueOf(val));
           return;
       }
     /*  
     if (val != 99 && operand1 == 99){
         operand1 = val;
         this.txtDisplay.setText(String.valueOf(val));
         return;
     }
     else if (val != 99 && operand2 == 99){
         operand2 = val;
         
         this.txtDisplay.setText(this.txtDisplay.getText() + " " + String.valueOf(val));
        return;
     }
     */
     
     if (e.getSource() == btnDivision){
         operator = Operator.DIVIS;
          this.txtDisplay.setText(this.txtDisplay.getText() + " / ");
          return;
     }
     else if (e.getSource() == btnMinus){
         operator = Operator.MINUS;
          this.txtDisplay.setText(this.txtDisplay.getText() +" - ");
          return;
     }
     else if (e.getSource() == btnPlus){
         operator = Operator.PLUS;
          this.txtDisplay.setText(this.txtDisplay.getText() + " + ");
          return;
     }
     else if (e.getSource() == btnMulti){
         operator = Operator.MULTI;
          this.txtDisplay.setText(this.txtDisplay.getText() + " * ");
          return;
     }

        
     if (e.getSource() == btnEquals && operand1 != 99 && operand2 != 99 && operator != Operator.UNKNOWN){
         switch(operator){
             case PLUS:
                 result = operand1 + operand2;
                 break;
             case MINUS:
                 result = operand1 - operand2;
                 break;
             case MULTI:
                 result = operand1 * operand2;
                 break;
             case DIVIS:
                 result = operand1 / operand2;
                 break;
             default:
                 result = 0;
                 break;
         }    
         
         this.txtDisplay.setText(String.valueOf(result));
     }
     else{
         this.txtDisplay.setText("Error");
     }
       
               
        
    }
}
