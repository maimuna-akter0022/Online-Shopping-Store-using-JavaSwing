package projectattmt1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Projectattmt1 extends JFrame {

    private JLabel userLabe1, passLabel;
    private JTextField tf;
    private JPasswordField pf;
    private JButton loginButton, clearButton;
    private Container c;
    private Font f;

    Projectattmt1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 500, 300);
        this.setTitle("Please Log in ");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f = new Font("Arial", Font.BOLD, 18);

        JLabel userLabel = new JLabel("Username: ");
        userLabel.setBounds(50, 50, 150, 50);
        userLabel.setFont(f);
        c.add(userLabel);

        tf = new JTextField();
        tf.setBounds(170, 50, 200, 50);
        c.add(tf);

        JLabel passLabel = new JLabel("Password: ");
        passLabel.setBounds(50, 120, 150, 50);
        passLabel.setFont(f);
        c.add(passLabel);

        pf = new JPasswordField();
        pf.setBounds(170, 120, 200, 50);
        pf.setEchoChar('*');
        pf.setFont(f);
        c.add(pf);

        loginButton = new JButton("Login");
        loginButton.setBounds(170, 190, 90, 50);
        loginButton.setFont(f);
        c.add(loginButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(280, 190, 90, 50);
        clearButton.setFont(f);
        c.add(clearButton);

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                tf.setText("");
                pf.setText("");
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String userName = tf.getText();
                String password = pf.getText(); //might change something
                if (userName.equals("Maimuna") && password.equals("123")) {
                    JOptionPane.showMessageDialog(null, "You are successfully loged in");
                    dispose();
                    Newframe frame = new Newframe();
                    frame.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalied Username or Password", "", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

    }

    public static void main(String[] args) {
        Projectattmt1 frame = new Projectattmt1();
        frame.setVisible(true);

    }
}
