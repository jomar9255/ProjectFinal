/*
 */
package culminatingcannon;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.Timer;

public class VisualAnimatio extends JApplet implements ActionListener, KeyListener {

    String[] picz = new String[4]; //Image file location
    Image[] img = new Image[4]; //Image

    public static int x, y, t, xVelocity, timeSpeed=1, background = 0, sprite = 3;
    public static double a, b, c; // VARIABLES FOR THE LEADING COEFFICENTS a for acceleration and b for the second coefficent
    Graphics2D myPic;
    Image dbImage;
    private Graphics dbg;
    Timer timer;

    
    

    
    public VisualAnimatio(double vx, double accel, double viy, double diy){
        //Set variable values
//        x=0;
//            y=750;
//            t=0;
//        
        
        xVelocity = (int)vx;
        a = accel/2.0;
        b = viy;
        c = diy;
        
    }
    
    
    /*
    *make into a method called init
    *
    */
    public VisualAnimatio() {
        timer = new Timer(100, this); //has the timer run at 60ms per cycle
        timer.start();
        try {//load
            FileReader fr = new FileReader("save.txt");//find the file
            BufferedReader br = new BufferedReader(fr);//reads the file
            for (int i = 0; i < 4; i++) {
                picz[i] = br.readLine();//go throught the file line by line                
                img[i] = new ImageIcon(picz[i]).getImage();//turns the location into an image
            }
        } catch (IOException e) {//if the file could not be loaded the ioexeption is thrown
            System.out.println("Couldn't Load");
        }
        addKeyListener(this);//starts recording where keys are being used
    }

    public static void mainmMethodForVisual() {
        JFrame f = new JFrame("Header thing"); //creats the window
        JApplet applet = new VisualAnimatio();        //creates a new version of the program
        f.getContentPane().add("Center", applet); //adds the new version to the window
        applet.init(); //intitializes the applet
        f.pack();//checks the package
        f.setVisible(true); //makes it visible
        f.setResizable(false);//makes in unsizable
        f.setBounds(0, 0, 1000, 775);//sets the window location on screen and its size
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    //stops program if you x out of the window    

        
    }

    public void paint(Graphics g) {
        dbImage = createImage(getWidth(), getHeight());      //creates and image the size of the screen
        dbg = dbImage.getGraphics();        //double buffers the panel
        paintComponent(dbg); //paints for paintCompontent
        g.drawImage(dbImage, 0, 0, this); //draws the screen image
    }

    public void paintComponent(Graphics g) {
        myPic = (Graphics2D) g;

        //draw here
        myPic.drawImage(img[background], 0, 0, 1000, 750, null);
        myPic.drawImage(img[sprite], x, -y+700, 50, 50, null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // EACH UPDATE
        t=t+timeSpeed;
        x = xVelocity*t; /* same as x++; for time incrimenting by 1s with velocity of 1m/s*/
//        y = (int)-(5*((1.0/20.0)*t-20)*((1.0/20.0)*t-4)-400);
        
        y=(int) (  b*(t) - a*(t*t)  +c); // THE FUNCTION OF TIME FOR THE y OUTPUT ONLY


        System.out.println("the x value is x = "+x);
        System.out.println(y);
        
//        y = (int)1*t*t+700;
        repaint();//recalls the paint method
        requestFocus();//sets its self above all other programs        
    }

    @Override
    public void keyTyped(KeyEvent e) { /* key press and release combo */}

    @Override
    public void keyPressed(KeyEvent e) {
        //key presses
        if (e.getKeyCode() == KeyEvent.VK_R) {
            x=0;
            y=750;
            t=0;
        }
        
        if (e.getKeyCode() == KeyEvent.VK_0) {
            timeSpeed=0;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //key releases
        if (e.getKeyCode() == KeyEvent.VK_C) { // key release to change nackground image
            background++;
            if (background >= 4) {
                background = 0;
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_V) { // key release to change nackground image
            sprite++;
            if (sprite >= 8) {
                sprite = 0;
            }
        }

        // INCREASE TIME SPEED WHEN THE UP ARROW KEY IS PRESSED
        if (e.getKeyCode() == KeyEvent.VK_UP) { // key release to change nackground image
            timeSpeed++;
        }
        // DECREASE TIMESPEED WHEN DOWN IS PRESSED
        if (e.getKeyCode() == KeyEvent.VK_DOWN) { // key release to change nackground image
            timeSpeed--;
        }
        
        // INCREASE HORIZONTAL VELOCITY WHEN THE RIGHT ARROW KEY IS OPRESSESD
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // key release to change nackground image
            xVelocity++;
        }
        // DECREASE HORIZONTAL VELOCITY WHEN THE LEFT ARROW KEY IS OPRESSESD
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // key release to change nackground image
            xVelocity--;
        }
    }
}
