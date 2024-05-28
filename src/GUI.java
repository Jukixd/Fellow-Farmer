import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    JPanel strpan = new JPanel();
    JPanel rozpan = new JPanel();

    JLabel intlabl = new JLabel();

    JButton str = new JButton("Start!");
    JButton ext = new JButton("Exit!");


    public void winmakin(){
        JFrame frm = new JFrame("Local Farmer");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(800, 600);
        frm.setResizable(false);
        ImageIcon s = new ImageIcon("ifop.png");
        intlabl.setIcon(s);
        intlabl.setBounds(185,100,430,100);
        str.setBounds(350,400,100,50);
        ext.setBounds(350,455,100,50);

        str.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.setContentPane(rozpan);
                frm.revalidate();
                frm.repaint();
            }
        });
        ext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frm, "See ya Later");
                System.exit(0);
            }
        });



        strpan.setBackground(Color.WHITE);
        rozpan.setBackground(Color.RED);

        strpan.add(str);
        strpan.add(ext);
        strpan.add(intlabl);


        frm.add(strpan);
        strpan.setLayout(null);

        frm.setVisible(true);
    }
}
