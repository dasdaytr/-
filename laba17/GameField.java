package laba17;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.event.KeyAdapter;
        import java.awt.event.KeyEvent;
        import java.util.Random;


public class GameField extends JPanel implements ActionListener{
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;
    private final int ALL_DOTS = 400;
    private int Ochki=0;
    private Image dot;
    private Image apple;
    private int appleX;
    private int appleY;
    private int[] x = new int[ALL_DOTS];
    private int[] y = new int[ALL_DOTS];
    private int dots;
    private Timer timer;
    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;


    public GameField(){
        setBackground(Color.black);
        loadImages();
        initGame();
        addKeyListener(new FieldKeyListener());
        setFocusable(true);
    }
    public void inGame(){
        if (inGame == false){
            timer.stop();
            JButton button = new JButton("Начать заново");
            button.setBackground(Color.RED);
            button.setBounds(85,140,150,35);
            add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button.setVisible(false);
                    inGame = true;
                    left = false;
                    right = true;
                    up = false;
                    down = false;
                    inGame = true;
                    Ochki = 0;
                    initGame();



                }
            });
        }
    }
    public void initGame(){
        dots = 4;
        for (int i = 0; i < dots; i++) {
            x[i] = 48 - i*DOT_SIZE;
            y[i] = 48;
        }
        timer = new Timer(250,this);
        timer.start();
        createApple();
    }

    public void createApple(){
        appleX = new Random().nextInt(19)*DOT_SIZE;
        appleY = new Random().nextInt(19)*DOT_SIZE;
    }

    public void loadImages(){
        ImageIcon iia = new ImageIcon("C:\\Users\\svitk\\Desktop\\java\\laba17\\apple.png");
        apple = iia.getImage();
        ImageIcon iid = new ImageIcon("C:\\Users\\svitk\\Desktop\\java\\laba17\\dot.png");
        dot = iid.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        String str;
        if(inGame){

            g.drawImage(apple,appleX,appleY,this);
            for (int i = 0; i < dots; i++) {
                g.drawImage(dot,x[i],y[i],this);
                str="Очки ";
                g.setColor(Color.red);
                Font myFont = new Font ("Courier New", 1, 20);
                g.setFont(myFont);
                g.drawString(str+Ochki,1,15);
            }
        } else{

            str ="Ваши очки ";
            g.setColor(Color.yellow);
            timer.stop();
            g.drawString(str+Ochki,125,90);

        }
    }


    public void move(){
        for (int i = dots; i > 0; i--) {
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        if(left){
            x[0] -= DOT_SIZE;
        }
        if(right){
            x[0] += DOT_SIZE;
        } if(up){
            y[0] -= DOT_SIZE;
        } if(down){
            y[0] += DOT_SIZE;
        }
    }

    public void checkApple(){
        if(x[0] == appleX && y[0] == appleY){
            dots++;
            Ochki++;
            createApple();
        }
    }

    public void checkCollisions(){
        for (int i = dots; i >0 ; i--) {
            if(i>3 && x[0] == x[i] && y[0] == y[i]){
                inGame = false;
            }
        }

        if(x[0]>=SIZE-30){
            inGame = false;
        }
        if(x[0]<=-5){
            inGame = false;
        }
        if(y[0]>=SIZE-30){
            inGame = false;
        }
        if(y[0]<=-5){
            inGame = false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(inGame){
            checkApple();
            checkCollisions();
            move();
            inGame();

        }
        repaint();
    }

    class FieldKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            int key = e.getKeyCode();
            if(key == KeyEvent.VK_LEFT && !right){
                left = true;
                up = false;
                down = false;
            }
            if(key == KeyEvent.VK_RIGHT && !left){
                right = true;
                up = false;
                down = false;
            }

            if(key == KeyEvent.VK_UP && !down){
                right = false;
                up = true;
                left = false;
            }
            if(key == KeyEvent.VK_DOWN && !up){
                right = false;
                down = true;
                left = false;
            }
        }
    }


}
