package projectattmt1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Newframe extends JFrame {

    private Container c;
    private Font f;
    private JLabel imgLabel;//image
    private ImageIcon img;
    private JRadioButton product1, product2, product3, product4, product5, product6;
    private JButton order;
    private JLable nm;
    private JTextField tf1, tf2, tf3;
    private JButton add1, add2, add3;
    private JTextArea ta;
    private int sum = 0;
    private JTextField ad;

    Newframe() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 3000, 3000);
        this.setTitle("Welcome to LazyShoppingBD ");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f = new Font("Arial", Font.BOLD, 18);

        JLabel headerLabel = new JLabel(" Choose Product:");
        headerLabel.setBounds(50, 50, 180, 50);
        headerLabel.setFont(f);
        c.add(headerLabel);
        headerLabel.setOpaque(true);
        headerLabel.setBackground(Color.WHITE);

        initComponents();

        JLabel cstm = new JLabel(" Customer Details:");
        cstm.setBounds(1200, 50, 180, 50);
        cstm.setFont(f);
        c.add(cstm);
        cstm.setOpaque(true);
        cstm.setBackground(Color.WHITE);

        JLabel nm = new JLabel("Name: ");
        nm.setBounds(1200, 130, 180, 50);
        nm.setFont(f);
        c.add(nm);
        nm.setOpaque(true);
        nm.setBackground(Color.PINK);
        JLabel mbl = new JLabel("Mobila Number: ");
        mbl.setBounds(1200, 190, 180, 60);
        mbl.setFont(f);
        c.add(mbl);
        mbl.setOpaque(true);
        mbl.setBackground(Color.PINK);

        JLabel adrs = new JLabel("Address:");
        adrs.setBounds(1200, 250, 180, 80);
        adrs.setFont(f);
        c.add(adrs);
        adrs.setOpaque(true);
        adrs.setBackground(Color.PINK);
    }

    public void initComponents() {
        c = this.getContentPane();

        img = new ImageIcon(getClass().getResource("test.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(50, 140, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        img = new ImageIcon(getClass().getResource("test1.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(50, 500, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        img = new ImageIcon(getClass().getResource("test2.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(400, 140, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        img = new ImageIcon(getClass().getResource("test3.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(400, 500, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        img = new ImageIcon(getClass().getResource("test4.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(750, 140, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        img = new ImageIcon(getClass().getResource("test5.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(750, 500, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        product1 = new JRadioButton("Product no 1, price:1000");
        product1.setBounds(50, 380, 200, 50);
        c.add(product1);

        product2 = new JRadioButton("Product no 2, price:1200");
        product2.setBounds(50, 740, 200, 50);
        c.add(product2);

        product3 = new JRadioButton("Product no 3, price:1200");
        product3.setBounds(400, 380, 200, 50);
        c.add(product3);

        product4 = new JRadioButton("Product no 4, price:1200");
        product4.setBounds(400, 740, 200, 50);
        c.add(product4);

        product5 = new JRadioButton("Product no 5, price:1200");
        product5.setBounds(750, 380, 200, 50);
        c.add(product5);

        product6 = new JRadioButton("Product no 6 is out of Stock");
        product6.setBounds(750, 740, 200, 50);
        product6.setEnabled(false);
        c.add(product6);

        tf1 = new JTextField();
        tf1.setBounds(1400, 130, 300, 50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(1400, 200, 300, 50);
        c.add(tf2);

        tf3 = new JTextField();
        tf3.setBounds(1400, 270, 300, 50);
        c.add(tf3);

        add1 = new JButton("Add Name");
        add1.setBounds(1720, 130, 180, 50);
        add1.setFont(f);
        c.add(add1);
        add2 = new JButton("Add Mobile no");
        add2.setBounds(1720, 200, 180, 50);
        add2.setFont(f);
        c.add(add2);

        add3 = new JButton("Add Address");
        add3.setBounds(1720, 270, 180, 50);
        add3.setFont(f);
        c.add(add3);

        ta = new JTextArea();
        ta.setBounds(1300, 400, 500, 500);
        c.add(ta);
        Handler handler = new Handler();
        product1.addActionListener(handler);
        product2.addActionListener(handler);
        product3.addActionListener(handler);
        product4.addActionListener(handler);
        product5.addActionListener(handler);
        product6.addActionListener(handler);

        /* tf1 = new JTextField();
        ad.setBounds(170, 50, 200, 50);
        c.add(ad);*/
        add1.addActionListener(new ActionListener() {
            String nm = "";

            @Override
            public void actionPerformed(ActionEvent ae) {
                String addinfo = tf1.getText();
                ta.setFont(ta.getFont().deriveFont(Font.BOLD, 20f));
                ta.append("Customer Name: " + addinfo + "\n");
                nm = nm + "Customer Name: " + addinfo + "\n";
            }

        });
        add2.addActionListener(new ActionListener() {
            String nm1 = "";

            @Override

            public void actionPerformed(ActionEvent ae) {

                String addinfo = tf2.getText();
                ta.setFont(ta.getFont().deriveFont(Font.BOLD, 20f));
                ta.append("Customer Mobile no: " + addinfo + "\n");
                nm1 = nm1 + "Customer Mobile no: " + addinfo + "\n";
            }

        });

        add3.addActionListener(new ActionListener() {
            String nm2 = "";

            @Override
            public void actionPerformed(ActionEvent ae) {
                String addinfo = tf3.getText();
                ta.setFont(ta.getFont().deriveFont(Font.BOLD, 20f));
                ta.append("Customer Address: " + addinfo + "\n");
                nm2 = nm2 + "Customer Address: " + addinfo + "\n";
            }

        });

        order = new JButton("Place order");
        order.setBounds(1450, 900, 180, 50);
        order.setFont(f);
        c.add(order);

        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                BufferedWriter writer;
                try {
                    writer = new BufferedWriter(new FileWriter("SimpleText.txt",
                            true));
                    ta.write(writer);
                    writer.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error Occured");
                    e.printStackTrace();
                }

                JOptionPane.showMessageDialog(null, "The order has been placed");
                dispose();
            }

        });

    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String ss = "";
            if (ae.getSource() == product1) {
                ss = ss + "Product no 1, Price:   1000\n";
                ta.append("Product no 1, Price:   1000\n");
                ta.setFont(ta.getFont().deriveFont(Font.BOLD, 20f));
                sum = sum + 1000;

            }
            if (ae.getSource() == product2) {
                ss = ss + "Product no 2, Price:   1200\n";
                sum = sum + 1200;
                ta.append("Product no 2, Price:   1200\n");

            }
            if (ae.getSource() == product3) {
                ss = ss + "Product no 3, Price:   1200\n";
                sum = sum + 1200;
                ta.append("Product no 3, Price:   1200\n");

            }
            if (ae.getSource() == product4) {
                ss = ss + "Product no 4, Price:   1200\n";
                sum = sum + 1200;
                ta.append("Product no 4, Price:   1200\n");

            }
            if (ae.getSource() == product5) {
                ss = ss + "Product no 5, Price:   1200\n";
                ta.append("Product no 5, Price:   1200\n");
                sum = sum + 1200;
            }

            //JOptionPane.showMessageDialog(null,"Payment " +sum);
            ta.append("the current payment is " + sum + "\n");
        }

    }

    public static void main(String[] args) {
        Newframe fr = new Newframe();
        fr.setVisible(true);
    }
}
