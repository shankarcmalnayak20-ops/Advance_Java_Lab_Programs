/* 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).
*/
package hc1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Image Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new FlowLayout());

        // Create a JLabel to display the message
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        // Load images for buttons (ensure images are in project folder)
        ImageIcon digitalClockIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hour_glass.png");

        // Create buttons with images
        JButton digitalClockButton = new JButton(digitalClockIcon);
        JButton hourGlassButton = new JButton(hourGlassIcon);

        // Add ActionListener to Digital Clock button
        digitalClockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        // Add ActionListener to Hour Glass button
        hourGlassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        frame.add(digitalClockButton);
        frame.add(hourGlassButton);
        frame.add(messageLabel);

        // Make frame visible
        frame.setVisible(true);
    }
}

