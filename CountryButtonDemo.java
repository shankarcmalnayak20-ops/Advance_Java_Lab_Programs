/* 4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the event handling mechanism with addActionListener( ).*/
package hc1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Country Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create a JLabel to display the message
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create two buttons: Srilanka and India
        JButton srilankaButton = new JButton("Srilanka");
        JButton indiaButton = new JButton("India");

        // Add ActionListener to Srilanka button
        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        // Add ActionListener to India button
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        // Add components to frame
        frame.add(srilankaButton);
        frame.add(indiaButton);
        frame.add(messageLabel);

        // Make frame visible
        frame.setVisible(true);
    }
}
