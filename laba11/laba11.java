package laba11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class laba11 extends JFrame {
    private int x = 0;
    private Random random = new Random();
    private int k = random.nextInt(20);
    private JTextField smal =new JTextField(15);
    public laba11(){
        super("Угадайка");


        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField smal =new JTextField(15);
        smal.setToolTipText("короткое поле");
        JButton jButton = new JButton("Потратить попытку");
        jPanel.add(jButton);
        jPanel.add(smal);

        setContentPane(jPanel);
        setBounds(500,300,300,300);
        JOptionPane.showMessageDialog(laba11.this,"Здраствуйте,это игра угадайка.\n" +
                "У вас есть три попытки,что угадать число загаданное компьютером.\nУДАЧИ");
        setVisible(true);
        jButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n = new Integer(smal.getText());
                if (n ==k){
                    JOptionPane.showMessageDialog(laba11.this,"Поздравляю вы угадали с "+(x+1)+
                            " попытки.ЭТО ЧИСЛО "+ k);
                    dispose();
                }
                else if(n>k && x!=3){

                    JOptionPane.showMessageDialog(laba11.this,"Вы ввели число больше загадонного " +
                            "компьютером\n Попробуйте еще раз");
                    x++;
                }
                else if(n<k && x!=3){
                    /*if(x==3) {
                        JOptionPane.showMessageDialog(laba11.this,"Вы потратили свои 3 попытки " +
                                ".Игра закончилась");
                        dispose();
                    }*/
                    JOptionPane.showMessageDialog(laba11.this,"Вы ввели число меньше загадонного " +
                            "компьютером\n Попробуйте еще раз");
                    x++;
                }
                 if(x==3) {
                    JOptionPane.showMessageDialog(laba11.this,"Вы потратили свои 3 попытки " +
                            ".Игра закончилась"+"\nЗагаданное число - "+ k);
                    dispose();
                }
            }
        });
    }

    public static void main(String []args){
        new laba11();
    }
}
