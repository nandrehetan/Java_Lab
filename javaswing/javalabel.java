import java.util.*;
import javax.swing.*;
import java.awt.*;
public class javalabel {
    public static void main(String[] args){
        JFrame hetu = new JFrame();
        hetu.setVisible(true);
        hetu.setSize(500,500);

        // Jlabel = a GUI display area for a string of text, an image or both
        JLabel label = new JLabel();
        label.setText("Hetan is Grandmaster"); //Sets text of the label
        label.setFont(new Font("Algerian", Font.PLAIN, 30)); //Set font of text
        label.setForeground(Color.WHITE); //Set Font color of text
        label.setBackground(Color.BLACK); //Set Background color of text
        label.setOpaque(true); //Display background color
        label.setVerticalAlignment(label.TOP); //Set vertical position of text
        label.setHorizontalAlignment(label.CENTER); //Set Horizontal position of text

        hetu.add(label);
    }
}
