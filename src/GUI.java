import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    Cycle c = new Cycle();
    JPanel strpan = new JPanel();
    JPanel rozpan = new JPanel();
    JPanel barnpan = new JPanel();
    JPanel greenpan = new JPanel();
    JPanel shoppan = new JPanel();
    JLabel intlabl = new JLabel();
    JLabel downpan = new JLabel();
    JLabel rozes = new JLabel();

    JLabel downtxt = new JLabel();
    JButton str = new JButton("Start!");
    JButton ext = new JButton("Exit!");
    JButton barn = new JButton("Barn");
    JButton green = new JButton("Greenhouse");
    JButton shop = new JButton("Shop");
    JButton slep = new JButton("Sleep");



    public void winmakin(){
        c.Firstday();
        JLabel tim = new JLabel(c.toString());
        JFrame frm = new JFrame("Local Farmer");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(800, 600);
        frm.setResizable(false);
        ImageIcon s = new ImageIcon("ifop.png");
        ImageIcon k = new ImageIcon("downpan.png");
        ImageIcon g = new ImageIcon("rozns.png");
        rozes.setIcon(g);
        intlabl.setIcon(s);
        downpan.setIcon(k);
        intlabl.setBounds(185,100,430,100);
        downpan.setBounds(0,370,800,200);
        rozes.setBounds(0,0,800,400);
        tim.setBounds(0,-20,500,50);
        downtxt.setBounds(50,450,200,40);
        str.setBounds(350,400,100,50);
        ext.setBounds(350,455,100,50);
        green.setBounds(620,485,120,50);
        barn.setBounds(620,405,120,50);
        shop.setBounds(470,405,120,50);
        slep.setBounds(470,485,120,50);

        str.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                downtxt.setText("Where do you want to go next?");
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
        green.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.setContentPane(greenpan);
                frm.revalidate();
                frm.repaint();
            }
        });
        barn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.setContentPane(barnpan);
                frm.revalidate();
                frm.repaint();
            }
        });
        shop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.setContentPane(shoppan);
                frm.revalidate();
                frm.repaint();
            }
        });
        slep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.procceedday(c);
                tim.setText(c.toString());
                frm.setContentPane(rozpan);
                frm.revalidate();
                frm.repaint();
            }
        });

        strpan.setBackground(Color.WHITE);
        rozpan.setBackground(Color.white);

        rozpan.add(green);
        rozpan.add(shop);
        rozpan.add(barn);
        rozpan.add(slep);
        rozpan.add(tim);
        rozpan.add(downtxt);
        rozpan.add(downpan);
        rozpan.add(rozes);

        strpan.add(str);
        strpan.add(ext);
        strpan.add(intlabl);


        frm.add(strpan);
        strpan.setLayout(null);
        rozpan.setLayout(null);

        frm.setVisible(true);
    }
}
