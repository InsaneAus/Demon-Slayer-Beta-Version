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
public class tanjiro extends JFrame implements ActionListener {
    // Create new object from JButton constructor
    static JButton homebutton = new JButton();

    tanjiro() {
        ImageIcon icon = new ImageIcon("appicondemonslayer.jpg");
        // Resize image
        ImageIcon tanjiro_pic = new ImageIcon("tanjirokamado.png");
        Image tanjiro_pic2 = tanjiro_pic.getImage();
        Image tanjiro_size = tanjiro_pic2.getScaledInstance(200, 400, java.awt.Image.SCALE_SMOOTH);
        tanjiro_pic = new ImageIcon(tanjiro_size);
        // Sets appearance of "Return to Character List" button 
        homebutton.setText("Return to Character List");
        homebutton.setHorizontalAlignment(JButton.CENTER);
        homebutton.setFont(new Font("Edo SZ", Font.PLAIN, 10));
        homebutton.setBounds(375, 600, 250, 50);
        homebutton.setFocusable(false);
        // Registers event when the homebutton is clicked.
        homebutton.addActionListener(this);
        // Creates heading titled Tanjiro Kamado, including its appearance and coordinates in the window
        JLabel label2 = new JLabel();
        label2.setBackground(Color.blue);
        label2.setForeground(Color.white);
        label2.setText("Tanjiro Kamado");
        label2.setBounds(180, 15, 340, 50);
        label2.setFont(new Font("EDO SZ", Font.PLAIN, 20));
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setOpaque(true);

        JPanel panel = new JPanel();
        // Sets coordinates and appearance of JPanel container
        panel.setBackground(Color.white);
        panel.setBounds(50, 150, 200, 400);

        JLabel label = new JLabel();
        // Adds image to JLabel component
        label.setIcon(tanjiro_pic);
        // Adds JLabel component to JPanel container
        panel.add(label); 

        JPanel description = new JPanel();
        // Sets appearance of JPanel container
        description.setBounds(300, 150, 350, 400);
        // Adds description of Tanjiro Kamado in the form of a JTextArea component.
        JTextArea textArea = new JTextArea(
            "Tanjiro Kamado is a protagonist from Demon Slayer: Kimetsu no Yaiba and Nezuko Kamado is his sister. After the murder of " +
            "most of his family with the exception of Nezuko who unfortunately turned into a demon, he became a demon slayer and his goals are to " +
            "eliminate Muzan Kibutsuji, the king of the demons, and turn Nezuko back into her human form. His allies include Zenitsu Agatsuma and " +
            "Inosuke Hashibira.", 30, 30
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
        // If the homebutton gets clicked, the current window will close and a new window will open
        // which is about the list of characters from Demon Slayer: Kimetsu no Yaiba
        if (e.getSource() == homebutton) {
            this.dispose();
            new characterslist();
        }
    }
}
