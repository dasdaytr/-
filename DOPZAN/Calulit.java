package DopZAd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calulit extends JFrame {
    private JTextField jTextField;
    private JPanel jPanel;
    private JButton jButton9;
    private JButton jButton8;
    private JButton jButton7;
    private JButton jButton6;
    private JButton jButton5;
    private JButton jButton4;
    private JButton jButton3;
    private JButton jButton2;
    private JButton jButton1;
    private JButton jButton0;
    private JButton jButtonDel;
    private JButton jButtonL;
    private JButton jButtonR;
    private JButton jButtonUM;
    private JButton jButtonPL;
    private JButton jButtonMIN;
    private JButton jButtonPR;
    private JButton jButtonO;
    private String chislo;
    private int k=0;
    private int p=0;
    private int m =0;
    private Stack<Double> chisla;
    private Stack <String> znaki;
    public Calulit(){
        super("Калькулятор");
        setBounds(500,300,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jTextField = new JTextField();
        jTextField.setBounds(5,5,280,40);
        jTextField.setBackground(Color.cyan);
        jPanel = new JPanel();
        jPanel.setBackground(Color.lightGray);
        jPanel.setLayout(null);
        setLout();
        mause();
        jPanel.add(jTextField);
        add(jPanel);
        setVisible(true);

    }
    public void setLout(){
        jButtonO = new JButton("Очистить");
        jButtonO.setBounds(290,5,89,40);
        jButtonO.setBackground(new Color(255,100,100));
        jPanel.add(jButtonO);
        jButton9 = new JButton("9");
        jButton9.setBounds(5,50,90,30);
        jButton9.setBackground(new Color(255,100,100));
        jPanel.add(jButton9);
        jButton8 = new JButton("8");
        jButton8.setBounds(100,50,90,30);
        jButton8.setBackground(new Color(255,100,100));
        jPanel.add(jButton8);
        jButton7 = new JButton("7");
        jButton7.setBounds(195,50,90,30);
        jButton7.setBackground(new Color(255,100,100));
        jPanel.add(jButton7);
        jButton6 = new JButton("6");
        jButton6.setBounds(5,90,90,30);
        jButton6.setBackground(new Color(255,100,100));
        jPanel.add(jButton6);
        jButton5 = new JButton("5");
        jButton5.setBounds(100,90,90,30);
        jButton5.setBackground(new Color(255,100,100));
        jPanel.add(jButton5);
        jButton4 = new JButton("4");
        jButton4.setBounds(195,90,90,30);
        jButton4.setBackground(new Color(255,100,100));
        jPanel.add(jButton4);
        jButton3 = new JButton("3");
        jButton3.setBounds(5,130,90,30);
        jButton3.setBackground(new Color(255,100,100));
        jPanel.add(jButton3);
        jButton2 = new JButton("2");
        jButton2.setBounds(100,130,90,30);
        jButton2.setBackground(new Color(255,100,100));
        jPanel.add(jButton2);
        jButton1 = new JButton("1");
        jButton1.setBounds(195,130,90,30);
        jButton1.setBackground(new Color(255,100,100));
        jPanel.add(jButton1);
        jButton0 = new JButton("0");
        jButton0.setBounds(100,170,90,30);
        jButton0.setBackground(new Color(255,100,100));
        jPanel.add(jButton0);
        jButtonDel = new JButton("/");
        jButtonDel.setBounds(290,170,90,30);
        jButtonDel.setBackground(new Color(100,100,100));
        jPanel.add(jButtonDel);
        jButtonPL = new JButton("+");
        jButtonPL.setBounds(290,50,90,30);
        jButtonPL.setBackground(new Color(100,100,100));
        jPanel.add(jButtonPL);
        jButtonMIN = new JButton("-");
        jButtonMIN.setBounds(290,90,90,30);
        jButtonMIN.setBackground(new Color(100,100,100));
        jPanel.add(jButtonMIN);
        jButtonUM = new JButton("*");
        jButtonUM.setBounds(290,130,90,30);
        jButtonUM.setBackground(new Color(100,100,100));
        jPanel.add(jButtonUM);
        jButtonL = new JButton("(");
        jButtonL.setBounds(5,170,90,30);
        jButtonL.setBackground(Color.orange);
        jPanel.add(jButtonL);
        jButtonR = new JButton(")");
        jButtonR.setBounds(195,170,90,30);
        jButtonR.setBackground(Color.orange);
        jPanel.add(jButtonR);
        jButtonPR = new JButton("=");
        jButtonPR.setBounds(5,210,375,30);
        jButtonPR.setBackground(Color.orange);
        jPanel.add(jButtonPR);

    }
    public void mause(){

        jButton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"9");
            }
        });
        jButtonO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText("");
            }
        });
        jButton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"8");
            }
        });
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"7");
            }
        });
        jButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"6");
            }
        });
        jButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"5");
            }
        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"4");
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"3");
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"2");
            }
        });
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"1");
            }
        });
        jButton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"0");
            }
        });
        jButtonDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p++;
                jTextField.setText(jTextField.getText()+"/");
            }
        });
        jButtonUM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"*");
            }
        });
        jButtonPL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"+");
            }
        });
        jButtonMIN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"-");
            }
        });
        jButtonL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+"(");
            }
        });
        jButtonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText()+")");
            }
        });
        jButtonPR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTextField.getText().length()!=0) {
                    String current = jTextField.getText();
                    jTextField.setText("");
                    String PolskNot = ExpressiontoRPN(current);
                    Double otvet = RPNtoAnswer(PolskNot);
                    jTextField.setText("" + otvet);
                }
            }
        });
    }
    public  String ExpressiontoRPN(String Expr){
        String current = "";
        Stack<Character> stack = new Stack<>();
        int priority;
        for (int i = 0; i < Expr.length(); i++) {
            priority = getP(Expr.charAt(i));
            if (priority == 0) current +=Expr.charAt(i);
            if(priority == 1) stack.push(Expr.charAt(i));
            if (priority >1){
                current +=' ';
                while (!stack.empty()){
                    if (getP(stack.peek())>=priority) current +=stack.pop();
                    else break;
                }
                stack.push(Expr.charAt(i));
            }
            if (priority == -1){
                current +=' ';
                while (getP(stack.peek())!=1) current +=stack.pop();
                stack.pop();
            }
        }
        while (!stack.empty()) current += stack.pop();
        return current;
    }
    public  double RPNtoAnswer(String rpn){
        String operand = new String();
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < rpn.length(); i++) {
            if(rpn.charAt(i) == ' ') continue;
            if (getP(rpn.charAt(i)) == 0){
                while (rpn.charAt(i)!= ' ' && getP(rpn.charAt(i))==0){
                    operand += rpn.charAt(i++);
                    if (i == rpn.length()) break;}
                stack.push(Double.parseDouble(operand));
                operand = new String();
            }
            if(getP(rpn.charAt(i)) >1){
                double a = stack.pop(), b = stack.pop();
                if (rpn.charAt(i) == '+') stack.push(b+a);
                if (rpn.charAt(i) == '-') stack.push(b-a);
                if (rpn.charAt(i) == '*') stack.push(b*a);
                if (rpn.charAt(i) == '/') stack.push(b/a);
            }
        }
        return stack.pop();
    }
    private  int getP(char token){
        if(token =='*' || token == '/') return 3;
        else if(token =='+' || token == '-')return 2;
        else if (token =='(') return 1;
        else if(token ==')') return -1;
        else return 0;
    }
}
