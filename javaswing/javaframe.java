import javax.swing.*;
import java.awt.*;
public class javaframe {
    public static void main(String[] args){
        // JFrame = a GUI window to add componentss
        JFrame hetu = new JFrame(); //To create new Frame
        hetu.setVisible(true); //make frame visible
        hetu.setSize(1000,500); //sets x and y dimension
        hetu.setTitle("Hetan is grandmaster "); //sets title of the frame
        hetu.setResizable(false); //prevents from being resized
        hetu.getContentPane().setBackground(Color.blue); //To change background colour

    }
}
