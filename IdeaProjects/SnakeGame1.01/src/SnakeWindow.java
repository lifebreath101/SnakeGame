import javax.swing.*;
import java.awt.*;
import java.awt.font.TextLayout;

class Test extends JPanel {

    static JFrame testFrame;

    //static JPanel testFramePanel;  //I believe canvas works in the same way panel does

    //static Graphics2D testG2d;  //not sure if this is needed

    public void paint(Graphics g) {      //See notes

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLUE);
        g2d.fillOval(5,10,60,60);

        Graphics2D g2d2 = (Graphics2D) g;
        g2d2.setColor(Color.RED);
        g2d2.fillOval(80, 10, 60, 60);

        g2d.drawString("It works!!!", 20, 100);

    }

    //static JFrame testFrameText;   //For text??

    //static JButton testFrameButton;  //adds a button for a frame


    public static void main(String[] args) {

        testFrame = new JFrame("will this frame work?");

        //testFramePanel = new JPanel();  //I believe canvas works in the same way panel does

        //testFrameButton = new JButton("I guess it will!");  //this button connects to panel
        //testFramePanel.add(testFrameButton);   //this is that action

        //testFrame.getContentPane().add(testFrameText);   //For text??

        //testFramePanel.setBackground(Color.white);

        //testFrame.add(testFramePanel);  //This adds panel to frame

        testFrame.add(new Test());   //See notes

        testFrame.setSize(700, 700);  //With canvas you can resize the canvas and "fit" it to the frame

        testFrame.setVisible(true);

        System.out.println(testFrame.isShowing());

        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}



//In this example I created two graphic objects and a text object and added them to the canvas

//TODO: make "mock snake", create an array of rects and have them move across the screen


//Notes:

//When using Graphics2d to create objects you write a class that extends panel and then add it to the frame.
//In that class you write all the code for creating those objects. With multiple Graphics2d objects initialized you can have different objects with different properties.



/////////////////////////////////////////////////////////////////

//text for mock upload


//text for mock upload


//text for mock upload

//"AN UPDATED CHANGE"///////////////////////

//text for mock upload


//text for mock upload


//text for mock upload


//text for mock upload
