import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Image;
// ActionListener is implemented for the button to work when clicked.
public class mainframe extends JFrame implements ActionListener {
    static JButton button = new JButton();
    mainframe() {
        // Set coordinates for the "Click to open" button.
        button.setBounds(500, 360, 150, 50);
        // Register event when the button is clicked.
        button.addActionListener(this);
        button.setText("Click to open");
        button.setFocusable(false);
        // Resize image
        ImageIcon icon = new ImageIcon("appicondemonslayer.jpg");
        Image icon2 = icon.getImage();
        Image sizedown = icon2.getScaledInstance(300, 600, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(sizedown);
        // Set JLabel component for the heading of the window as well as its appearance
        JLabel title = new JLabel();
        title.setText("Demon Slayer Characters");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(180, 30, 360, 50);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("EDO SZ", Font.PLAIN, 30));
        title.setBackground(Color.blue);
        title.setForeground(Color.white);
        title.setOpaque(true);
        // Set JLabel component to add picture as well as its coordinates, width and height
        JLabel mainpic = new JLabel();
        mainpic.setIcon(icon);
        mainpic.setBounds(100, 120, 300, 600);

        // Appearance of window
        // this keyword is used as the current class inherits the JFrame class which is the super class in this case
        // Therefore, I don't need to create an object.
        this.setTitle("Demon Slayer: Kimetsu no Yaiba Characters");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 720);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(123, 234, 125));
        this.setLayout(null);
        this.setVisible(true);
        // Adds components to JFrame container
        this.add(title);
        this.add(button);
        this.add(mainpic);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // When the button is clicked, it will dispose the current window and it will open a new window that is about
        // the list of Demon Slayer characters.
        if(e.getSource() == button) {
            this.dispose();
            new characterslist();
        }
    }
}
