import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class javabutton {
    public static void main(String[] args){
        JFrame hetu = new JFrame();
        hetu.setVisible(true);
        hetu.setSize(700,700);
        hetu.setTitle("Java Buttons");
        hetu.setDefaultCloseOperation(hetu.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        button.setBounds(50,50,100,100);
        button.setFont(new Font("Algerian", Font.BOLD, 20));
        button.setForeground(Color.GREEN);
        button.setBackground(Color.BLUE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Hetan is Grandmaster");
            }
        });
        hetu.add(button);

    }
}
