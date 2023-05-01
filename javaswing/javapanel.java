import java.util.*;
import javax.swing.*;
import java.awt.*;

public class javapanel {
    public static void main(String[] args){
        JFrame hetu = new JFrame();
        hetu.setVisible(true);
        hetu.setSize(900,900);
        hetu.setLayout(null);
        hetu.setDefaultCloseOperation(hetu.EXIT_ON_CLOSE);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,300,300);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(300,0,300,300);


        hetu.add(redPanel);
        hetu.add(bluePanel);

    }
}
