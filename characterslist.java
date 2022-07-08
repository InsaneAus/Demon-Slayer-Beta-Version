import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Image;
// ActionListener is implemented for the button to work when clicked.
public class characterslist extends JFrame implements ActionListener {
    // Create objects from JButton constructor
    static JButton tanjiro = new JButton();
    static JButton nezuko = new JButton();
    static JButton inosuke = new JButton();
    static JButton zenitsu = new JButton();
    static JButton daki = new JButton();
    characterslist() {
        // Create objects from JPanel constructor
        JPanel panel_tanjiro = new JPanel();
        JPanel panel_nezuko = new JPanel();
        JPanel panel_inosuke = new JPanel();
        JPanel panel_zenitsu = new JPanel();
        JPanel panel_daki = new JPanel();
        // Resize image (Tanjiro, Nezuko, Inosuke, Zenitsu, Daki)
        ImageIcon tanjiro_pic = new ImageIcon("tanjirokamado.png");
        Image tanjiro_pic2 = tanjiro_pic.getImage();
        Image tanjiro_size = tanjiro_pic2.getScaledInstance(100, 200, java.awt.Image.SCALE_SMOOTH);
        tanjiro_pic = new ImageIcon(tanjiro_size);

        ImageIcon nezuko_pic = new ImageIcon("nezukokamado.jpg");
        Image nezuko_pic2 = nezuko_pic.getImage();
        Image nezuko_size = nezuko_pic2.getScaledInstance(100, 200, java.awt.Image.SCALE_SMOOTH);
        nezuko_pic = new ImageIcon(nezuko_size);

        ImageIcon inosuke_pic = new ImageIcon("inosukehashibira.jpg");
        Image inosuke_pic2 = inosuke_pic.getImage();
        Image inosuke_size = inosuke_pic2.getScaledInstance(100, 200, java.awt.Image.SCALE_SMOOTH);
        inosuke_pic = new ImageIcon(inosuke_size);

        ImageIcon zenitsu_pic = new ImageIcon("zenitsuagatsuma.jpg");
        Image zenitsu_pic2 = zenitsu_pic.getImage();
        Image zenitsu_size = zenitsu_pic2.getScaledInstance(100, 200, java.awt.Image.SCALE_SMOOTH);
        zenitsu_pic = new ImageIcon(zenitsu_size);

        ImageIcon daki_pic = new ImageIcon("dakidemonslayer.jpg");
        Image daki_pic2 = daki_pic.getImage();
        Image daki_size = daki_pic2.getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH);
        daki_pic = new ImageIcon(daki_size);
        // Create JLabel component to add pictures to it as well as the positioning of the JLabel
        JLabel show_tanjiro = new JLabel();
        show_tanjiro.setIcon(tanjiro_pic);
        show_tanjiro.setHorizontalAlignment(JLabel.CENTER);
        show_tanjiro.setVerticalAlignment(JLabel.BOTTOM);

        JLabel show_nezuko = new JLabel();
        show_nezuko.setIcon(nezuko_pic);
        show_nezuko.setHorizontalAlignment(JLabel.CENTER);
        show_nezuko.setVerticalAlignment(JLabel.BOTTOM);

        JLabel show_inosuke = new JLabel();
        show_inosuke.setIcon(inosuke_pic);
        show_inosuke.setHorizontalAlignment(JLabel.CENTER);
        show_inosuke.setVerticalAlignment(JLabel.BOTTOM);

        JLabel show_zenitsu = new JLabel();
        show_zenitsu.setIcon(zenitsu_pic);
        show_zenitsu.setHorizontalAlignment(JLabel.CENTER);
        show_zenitsu.setVerticalAlignment(JLabel.BOTTOM);

        JLabel show_daki = new JLabel();
        show_daki.setIcon(daki_pic);
        show_daki.setHorizontalAlignment(JLabel.CENTER);
        show_daki.setVerticalAlignment(JLabel.BOTTOM);



        // Sets coordinates and appearance for JPanel container (Tanjiro Kamado)
        panel_tanjiro.setBackground(Color.white);
        panel_tanjiro.setBounds(50, 90, 150, 240);
        // Sets appearance of Tanjiro Kamado button
        tanjiro.setText("Tanjiro Kamado");
        tanjiro.setHorizontalAlignment(JButton.CENTER);
        tanjiro.setVerticalAlignment(JButton.TOP);
        tanjiro.setFocusable(false);
        tanjiro.setFont(new Font("MV Boli", Font.PLAIN, 10));
        // Registers event when Tanjiro Kamado button gets clicked
        tanjiro.addActionListener(this);
        // Adds button and JLabel component to the JPanel container
        panel_tanjiro.add(tanjiro);
        panel_tanjiro.add(show_tanjiro);

        // Sets coordinates and appearance for JPanel container (Nezuko Kamado)
        panel_nezuko.setBackground(Color.white);
        panel_nezuko.setBounds(250, 90, 150, 240);
        // Sets appearance of Nezuko Kamado button
        nezuko.setText("Nezuko Kamado");
        nezuko.setHorizontalAlignment(JButton.CENTER);
        nezuko.setVerticalAlignment(JButton.TOP);
        nezuko.setFocusable(false);
        nezuko.setFont(new Font("MV Boli", Font.PLAIN, 10));
        // Registers event when Nezuko Kamado button gets clicked
        nezuko.addActionListener(this);
        // Adds button and JLabel component to the JPanel container
        panel_nezuko.add(nezuko);
        panel_nezuko.add(show_nezuko);
        // Sets coordinates and appearance for JPanel container (Inosuke Hashibira)
        panel_inosuke.setBackground(Color.white);
        panel_inosuke.setBounds(50, 380, 150, 240);
        // Sets appearance of Inosuke Hashibira button
        inosuke.setText("Inosuke Hashibira");
        inosuke.setHorizontalAlignment(JButton.CENTER);
        inosuke.setVerticalAlignment(JButton.TOP);
        inosuke.setFocusable(false);
        inosuke.setFont(new Font("MV Boli", Font.PLAIN, 10));
        // Registers event when Inosuke Hashibira button gets clicked
        inosuke.addActionListener(this);
        // Adds button and JLabel component to the JPanel container
        panel_inosuke.add(inosuke);
        panel_inosuke.add(show_inosuke);
        // Sets coordinates and appearance for JPanel container (Zenitsu Agatsuma)
        panel_zenitsu.setBackground(Color.white);
        panel_zenitsu.setBounds(250, 380, 150, 240);
        // Sets appearance of Zenitsu Agatsuma button
        zenitsu.setText("Zenitsu Agatsuma");
        zenitsu.setHorizontalAlignment(JButton.CENTER);
        zenitsu.setVerticalAlignment(JButton.TOP);
        zenitsu.setFocusable(false);
        zenitsu.setFont(new Font("MV Boli", Font.PLAIN, 10));
        // Registers event when Zenitsu Agatsuma button gets clicked
        zenitsu.addActionListener(this);
        // Adds button and JLabel component to the JPanel container
        panel_zenitsu.add(zenitsu);
        panel_zenitsu.add(show_zenitsu);
        // Sets coordinates and appearance for JPanel container (Daki)
        panel_daki.setBackground(Color.white);
        panel_daki.setBounds(450, 90, 240, 150);
        // Sets appearance of Daki button
        daki.setText("Daki");
        daki.setHorizontalAlignment(JButton.CENTER);
        daki.setVerticalAlignment(JButton.TOP);
        daki.setFocusable(false);
        daki.setFont(new Font("MV Boli", Font.PLAIN, 10));
        daki.addActionListener(this);
        // Adds button and JLabel component to the JPanel container
        panel_daki.add(daki);
        panel_daki.add(show_daki);
        // main_title object that is created from JLabel class
        JLabel main_title = new JLabel();
        // Sets coordinates for main_title
        main_title.setText("Characters from Demon Slayer");
        main_title.setBounds(180, 15, 340, 50);
        main_title.setFont(new Font("EDO SZ", Font.PLAIN, 20));
        main_title.setBackground(Color.blue);
        main_title.setForeground(Color.white);
        main_title.setHorizontalAlignment(JLabel.CENTER);
        main_title.setOpaque(true);
        
        ImageIcon icon = new ImageIcon("appicondemonslayer.jpg");
        // Appearance of window
        this.setTitle("Demon Slayer: Kimetsu no Yaiba Characters");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720, 720);
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(new Color(123, 234, 125));
        this.setLayout(null);
        this.setVisible(true);
        // Adds JPanel containers and JLabel component to window
        this.add(main_title);
        this.add(panel_tanjiro);
        this.add(panel_nezuko);
        this.add(panel_inosuke);
        this.add(panel_zenitsu);
        this.add(panel_daki);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // When either button gets clicked (tanjiro, nezuko, inosuke, zenitsu, daki), current window will close and a new window will
        // open which depends on the button that is clicked. For example, if the Tanjiro button is clicked, it will open a new window 
        // about Tanjiro Kamado.
        if (e.getSource() == tanjiro) {
            this.dispose();
            new tanjiro();
        } 
        if (e.getSource() == nezuko) {
            this.dispose();
            new nezuko();
        }
        if (e.getSource() == inosuke) {
            this.dispose();
            new inosuke();
        }
        if (e.getSource() == zenitsu) {
            this.dispose();
            new zenitsu();
        }
        if (e.getSource() == daki) {
            this.dispose();
            new daki();
        }
        
    }
}
