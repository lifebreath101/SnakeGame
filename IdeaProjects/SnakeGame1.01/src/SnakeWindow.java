import javax.swing.*;
import java.awt.*;
import java.awt.font.TextLayout;

class Test extends JFrame {

    static JFrame testFrame;

    static JPanel testFramePanel;

    //static JFrame testFrameText;

    static JButton testFrameButton;


    public static void main(String[] args) {

        testFrame = new JFrame("will this frame work?");

        testFramePanel = new JPanel();

        testFrameButton = new JButton("I guess it will!");

        testFramePanel.add(testFrameButton);

        //testFrame.getContentPane().add(testFrameText);

        testFramePanel.setBackground(Color.white);

        testFrame.add(testFramePanel);

        testFrame.setSize(300, 300);

        testFrame.setVisible(true);

        System.out.println(testFrame.isShowing());

    }
}



//In this example I created a graphic window and added a button to it

//TODO: make objects and "raw" text to the window





//text for mock upload


//text for mock upload


//text for mock upload

//"AN UPDATED CHANGE"///////////////////////

//text for mock upload


//text for mock upload


//text for mock upload


//text for mock upload
