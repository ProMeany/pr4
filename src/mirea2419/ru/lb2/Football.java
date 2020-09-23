package mirea2419.ru.lb2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Football extends JFrame{

    int mad = 0;
    int bar = 0;
    JPanel panel = new JPanel();
    JButton but1 = new JButton("Madrid");
    JButton but2 = new JButton("Barcelona");
    JLabel text1 = new JLabel("Result: " + mad +" "+ "X" +" "+ bar);
    JLabel text2 = new JLabel("Last Scorer: ");
    JLabel text3 = new JLabel("Winner: ");

    public Football(int a, int b) {
        super("Football match");
        setSize(a, b);
        setVisible(true);
        add(panel);
        panel.setLayout(new GridLayout(5,4));
        panel.add(but1);
        panel.add(but2);
        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        but1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mad+=1;
                text1.setText("Result: " + mad +" "+ "X" +" "+ bar);
                text2.setText("Last Scorer: Madrid");
                if(mad < bar) text3.setText("Winner: Barcelona");
                else if(mad > bar) text3.setText("Winner: Madrid");
                else text3.setText("Winner: No one");
            }
        });
        but2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bar+=1;
                text1.setText("Result: " + mad +" "+ "X" +" "+ bar);
                text2.setText("Last Scorer: Barcelona");
                if(mad < bar) text3.setText("Winner: Barcelona");
                else if(mad > bar) text3.setText("Winner: Madrid");
                else text3.setText("Winner: No one");
            }
        });
    }
}