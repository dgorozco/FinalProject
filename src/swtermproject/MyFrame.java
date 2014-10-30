/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swtermproject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Dalia
 */
public class MyFrame extends JFrame{
    //ImageIcon utblogo = new ImageIcon("utblogo.gif");
    ImageIcon utblogo = new ImageIcon(getClass().getResource("utblogo2.gif"));
    
    public MyFrame()
    {
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(3, 1));

    // Add buttons to the panel
    p1.add(new JButton("Mission"));
    p1.add(new JButton("Vision"));
    p1.add(new JButton("College"));

    // Create panel p2 to hold a text field and p1
    JPanel p2 = new JPanel(new BorderLayout());
    p2.setLayout(new GridLayout(1, 1));
    //p2.add(new JLabel("University of Texas at Brownsville",utblogo,SwingConstants.CENTER));
    JLabel logo = new JLabel("University of Texas at Brownsville",utblogo,SwingConstants.CENTER);
    p2.add(logo);
    logo.setHorizontalTextPosition(SwingConstants.CENTER);
    logo.setVerticalTextPosition(SwingConstants.BOTTOM);
    //p2.add(new JSeparator(JSeparator.HORIZONTAL));

    // add contents into the frame
    add(p1, BorderLayout.WEST);
    add(p2, BorderLayout.NORTH);
    }
}
