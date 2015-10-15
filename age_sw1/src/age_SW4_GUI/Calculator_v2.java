/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW4_GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Adrian
 */
public class Calculator_v2 extends JFrame implements ActionListener {

    JTextField txtDisplay = new JTextField();
    JPanel panel1 = new JPanel();
    String[] Buttons = new String[17];
    private Integer operand1;
    private Integer operand2;
    private Integer result;
    private Operator operator;

    public Calculator_v2() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setSize(300, 250);
        this.txtDisplay.setEditable(false);
        this.txtDisplay.setBackground(Color.white);
        // this.txtDisplay.setSize(250, 20);
        this.add(txtDisplay, BorderLayout.NORTH);

        this.panel1.setLayout(new GridLayout(5, 5));

        for (String btntext : getButtons()) {
            JButton btn = new JButton(btntext);
            btn.addActionListener(this);
            btn.setActionCommand(btntext);
            btn.setMargin(new Insets(5, 5, 5, 5));
            this.panel1.add(btn);
        }

        this.add(panel1, BorderLayout.SOUTH);
    }

    public ArrayList<String> getButtons() {
        ArrayList<String> buttons = new ArrayList();
        buttons.add("7");
        buttons.add("8");
        buttons.add("9");
        buttons.add("/");
        buttons.add("4");
        buttons.add("5");
        buttons.add("6");
        buttons.add("*");
        buttons.add("1");
        buttons.add("2");
        buttons.add("3");
        buttons.add("-");
        buttons.add("0");
        buttons.add("S");
        buttons.add("=");
        buttons.add("+");
        buttons.add("C");

        return buttons;
    }

    public static void main(String[] args) {
        Calculator_v2 cal = new Calculator_v2();
        cal.setVisible(true);
    }

    public void SetOperand(int Value) {
        if (operator == null || operator == Operator.UNKNOWN) {
            String tmp = "";
            if (operand1 != null) {
                tmp = String.valueOf(operand1);
            }

            tmp += String.valueOf(Value);

            operand1 = new Integer(tmp);

            this.SetDisplayText(operand1.toString(), true);
        } else if (operator != Operator.UNKNOWN) {
            String tmp = "";
            if (operand2 != null) {
                tmp = String.valueOf(operand2);
            }

            tmp += String.valueOf(Value);

            operand2 = new Integer(tmp);
            this.SetDisplayText(String.valueOf(Value));
        }
    }

    private void SetDisplayText(String Text, boolean... newLine) {

        if (newLine.length == 0 || !newLine[0]) {
            this.txtDisplay.setText(this.txtDisplay.getText() + Text);
        } else {
            this.txtDisplay.setText(Text);
        }
    }

    private void SetOperator(String OP) {
        if (operator != null && operator != Operator.UNKNOWN) {
            return;
        }
        switch (OP) {
            case "+":
                operator = Operator.PLUS;
                break;
            case "-":
                operator = Operator.MINUS;
                break;
            case "*":
                operator = Operator.MULTI;
                break;
            case "/":
                operator = Operator.DIVIS;
                break;
        }

        this.SetDisplayText(OP);

    }

    private void Calculate() {
        if (operand1 == null || operand2 == null || operator == Operator.UNKNOWN) {
            return;
        }

        switch (operator) {
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
        }

        this.SetDisplayText(String.valueOf(result), true);
        this.ResetCalculation();
    }

    private void ResetCalculation() {
        this.operand1 = null;
        this.operand2 = null;
        this.operator = Operator.UNKNOWN;
    }

    private void InvertNumber() {
        if (operator != Operator.UNKNOWN) {
            operand2 = operand2 * -1;
        } else {
            operand1 = operand1 * -1;
        }

        SetDisplayText(operand1.toString() + " " + operand2.toString(), true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
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
                SetOperand(Integer.valueOf(command));
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                SetOperator(command);
                break;
            case "=":
                this.Calculate();
                break;
            case "C":
                ResetCalculation();
                SetDisplayText("", true);
                break;
            case "S":
                this.InvertNumber();
                break;
        }

    }

}
