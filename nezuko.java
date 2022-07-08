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
public class nezuko extends JFrame implements ActionListener {
    // Create new object from JButton constructor
    static JButton homebutton = new JButton();
    nezuko() {
        ImageIcon icon = new ImageIcon("appicondemonslayer.jpg");
        // Resize image
        ImageIcon nezuko_pic = new ImageIcon("nezukokamado.jpg");
        Image nezuko_pic2 = nezuko_pic.getImage();
        Image nezuko_size = nezuko_pic2.getScaledInstance(250, 350, java.awt.Image.SCALE_SMOOTH);
        nezuko_pic = new ImageIcon(nezuko_size);
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
        label2.setText("Nezuko Kamado");
        label2.setBounds(180, 15, 340, 50);
        label2.setFont(new Font("EDO SZ", Font.PLAIN, 20));
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setOpaque(true);

        JPanel panel = new JPanel();
        // Sets appearance of JPanel container
        panel.setBackground(Color.white);
        panel.setBounds(10, 150, 270, 400);

        JLabel label = new JLabel();
        // Adds image to JLabel component
        label.setIcon(nezuko_pic);
        // Adds JLabel component to JPanel container
        panel.add(label); 

        JPanel description = new JPanel();
        // Sets appearance of JPanel container
        description.setBounds(300, 150, 350, 400);
        // Adds description of Nezuko Kamado in the JTextArea component
        JTextArea textArea = new JTextArea(
            "Nezuko Kamado is a supporting character of Demon Slayer and is the sister of Tanjiro Kamado. " +
            "Despite being a demon, Nezuko helped Tanjiro and his allies to fight against the demons, controlled by Muzan Kibutsuji. " +
            "She was found to be very attractive by Zenitsu.", 30, 30
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
        // If the homebutton is clicked, the current window will be closed and a new window will open
        // which is about the list of characters from Demon Slayer: Kimetsu no Yaiba.
        if (e.getSource() == homebutton) {
            this.dispose();
            new characterslist();
        }
    }
}
