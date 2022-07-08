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
public class inosuke extends JFrame implements ActionListener {
    // Create new object from JButton constructor
    static JButton homebutton = new JButton();
    inosuke() {
        ImageIcon icon = new ImageIcon("appicondemonslayer.jpg");
        // Resize image
        ImageIcon inosuke_pic = new ImageIcon("inosukehashibira.jpg");
        Image inosuke_pic2 = inosuke_pic.getImage();
        Image inosuke_size = inosuke_pic2.getScaledInstance(289, 395, java.awt.Image.SCALE_SMOOTH);
        inosuke_pic = new ImageIcon(inosuke_size);
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
        label2.setText("Inosuke Hashibira");
        label2.setBounds(180, 15, 340, 50);
        label2.setFont(new Font("EDO SZ", Font.PLAIN, 20));
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setOpaque(true);

        JPanel panel = new JPanel();
        // Sets appearance of JPanel container
        panel.setBackground(Color.white);
        panel.setBounds(20, 150, 300, 410);

        JLabel label = new JLabel();
        // Adds image to JLabel component
        label.setIcon(inosuke_pic);
        // Adds JLabel component to JPanel container
        panel.add(label); 

        JPanel description = new JPanel();
        // Sets appearance of JPanel container
        description.setBounds(330, 150, 350, 400);
        // Adds description of Inosuke Hashibira in the JTextArea component
        JTextArea textArea = new JTextArea(
            "Inosuke is a protagonist of Demon Slayer: Kimetsu no Yaiba. He wears a boar head and usually doesn't wear a shirt and he " +
            "is very short-tempered and doesn't like to think when it comes to battling demons." +
            "He also tends to forget people's names like Tanjiro's and he can refer Tanjiro as Kentaro.", 30, 30
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

