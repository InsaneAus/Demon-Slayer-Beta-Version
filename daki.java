import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Image;
// ActionListener is implemented for the button to work when clicked.
public class daki extends JFrame implements ActionListener {
    // Create new object from JButton constructor
    static JButton homebutton = new JButton();
    daki() {
        ImageIcon icon = new ImageIcon("appicondemonslayer.jpg");
        // Resize image
        ImageIcon daki_pic = new ImageIcon("dakidemonslayer.jpg");
        Image daki_pic2 = daki_pic.getImage();
        Image daki_size = daki_pic2.getScaledInstance(300, 150, java.awt.Image.SCALE_SMOOTH);
        daki_pic = new ImageIcon(daki_size);
        // Sets appearance of "Return to Character List" button
        homebutton.setText("Return to Character List");
        homebutton.setHorizontalAlignment(JButton.CENTER);
        homebutton.setFont(new Font("Edo SZ", Font.PLAIN, 10));
        homebutton.setBounds(375, 600, 250, 50);
        homebutton.setFocusable(false);
        // Registers event when homebutton is clicked
        homebutton.addActionListener(this);

        JLabel label2 = new JLabel();
        // Sets appearance of JLabel component
        label2.setBackground(Color.blue);
        label2.setForeground(Color.white);
        label2.setText("Daki");
        label2.setBounds(180, 15, 340, 50);
        label2.setFont(new Font("EDO SZ", Font.PLAIN, 20));
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setOpaque(true);

        JPanel panel = new JPanel();
        // Sets appearance of JPanel container
        panel.setBackground(Color.white);
        panel.setBounds(50, 150, 350, 175);

        JLabel label = new JLabel();
        // Adds image to JLabel component
        label.setIcon(daki_pic);
        // Adds JLabel component to JPanel container
        panel.add(label); 

        JPanel description = new JPanel();
        // Sets appearance of JPanel container
        description.setBounds(450, 150, 250, 400);
        // Adds description of Daki in the JTextArea component
        JTextArea textArea = new JTextArea(
            "Daki is an antagonist in the Entertainment District arc of Demon Slayer: Kimetsu no Yaiba. " +
            "She worked as a courtesan in Yoshiwara, Tokyo for hundreds of years as a demon and she had killed and eaten many people. " +
            "Her brother was Gyutaro who was also a demon.", 20, 20
        );
        // Sets appearance of JTextArea component
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        // Adds JTextArea component to JPanel container
        description.add(textArea);
        // Sets appearance of window
        this.setTitle("Demon Slayer: Kimetsu no Yaiba Characters");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 720);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(123, 234, 125));
        this.setLayout(null);
        // Adds components and containers to JFrame container
        this.add(panel);
        this.add(label2);
        this.add(homebutton);
        this.add(description);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // If the button is clicked, the current window will close and it will open a new window
        // which is about the list of characters from Demon Slayer: Kimetsu no Yaiba.
        if (e.getSource() == homebutton) {
            this.dispose();
            new characterslist();
        }
    }
}

