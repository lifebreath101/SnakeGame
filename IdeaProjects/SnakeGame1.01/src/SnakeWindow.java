
import javax.swing.*;
import java.awt.*;


class Test extends JPanel {    //JPanel is the canvas

    static JFrame testFrame;

    static JPanel testPanel;

    static JPanel[] shapes = new JPanel[5];


    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g; //this is a paintbrush


        //g2d.setColor(Color.BLUE);
        //g2d.fillOval(5,10,60,60);

        //Graphics2D g2d2 = (Graphics2D) g;
        //g2d2.setColor(Color.RED);
        //g2d2.fillOval(80, 10, 60, 60);

        //g2d.drawString("It works!!!", 20, 100);

    }



    public static void main(String[] args) {

        testFrame = new JFrame("will this frame work?");

        testPanel = new JPanel();


        //testFrame.add(new Test());   //See notes

        testFrame.add(testPanel);

        for(int i = 0; i < 4; i++) {

            shapes[i].setBounds(10, 10, 30, 30);
            shapes[i].setBackground(Color.blue);

            if(i > 0) {
                shapes[i].setBounds(shapes[i-1].getX() + 10, shapes[i-1].getY(), 30, 30);
            }
        }

        for(int i = 0; i < 4; i++) {

            testPanel.add(shapes[i]);
        }

        testFrame.setSize(700, 700);

        testFrame.setVisible(true);

        System.out.println(testFrame.isShowing());

        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}



//In this example I created two graphic objects and a text object and added them to the canvas

//TODO: make "mock snake", create an array of rects and have them move across the screen.
// May need to redesign, with paint method I cannot locate the position of a object I've created.


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
