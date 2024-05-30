import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    Cycle c = new Cycle();
    Player d = new Player("Karel",1,0,50);
    Farm p = new Farm();
    JPanel strpan = new JPanel();
    JPanel rozpan = new JPanel();
    JPanel barnpan = new JPanel();
    JPanel greenpan = new JPanel();
    JPanel shoppan = new JPanel();
    JPanel sipan = new JPanel();
    JPanel makin = new JPanel();

    JLabel intlabl = new JLabel();
    JLabel downpan = new JLabel();
    JLabel downpan2 = new JLabel();
    JLabel rozes = new JLabel();
    JLabel nite = new JLabel();
    JLabel downtxt = new JLabel();
    JLabel dwntext2 = new JLabel();
    JLabel nmawrt = new JLabel("Write your name");

    JButton str = new JButton("Start!");
    JButton ext = new JButton("Exit!");
    JButton barn = new JButton("Barn");
    JButton green = new JButton("Greenhouse");
    JButton shop = new JButton("Shop");
    JButton slep = new JButton("Sleep");
    JButton procceday = new JButton("Proceed day");
    JButton create = new JButton("Create");
    JButton back1 = new JButton("Back");

    JTextField nma = new JTextField();
    int y;
    int l;



    public void winmakin(){
        y = 5;
        l = 20;
        c.Firstday();
        JLabel tim = new JLabel(c.toString());
        JLabel pinfo = new JLabel();
        downtxt.setText("Where do you want to go next?");
        JFrame frm = new JFrame("Local Farmer");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(800, 600);
        frm.setResizable(false);
        ImageIcon s = new ImageIcon("ifop.png");
        ImageIcon k = new ImageIcon("downpan.png");
        ImageIcon g = new ImageIcon("rozns.png");
        ImageIcon a = new ImageIcon("nite.png");
        rozes.setIcon(g);
        intlabl.setIcon(s);
        downpan.setIcon(k);
        downpan2.setIcon(k);
        nite.setIcon(a);
        intlabl.setBounds(185,100,430,100);
        downpan.setBounds(0,370,800,200);
        downpan2 .setBounds(0,370,800,200);
        rozes.setBounds(0,0,800,400);
        nite.setBounds(0,0,800,400);
        tim.setBounds(0,-20,500,50);
        downtxt.setBounds(50,450,200,40);
        dwntext2.setBounds(50,450,200,40);
        pinfo.setBounds(335,50,400,300);
        str.setBounds(350,400,100,50);
        ext.setBounds(350,455,100,50);
        green.setBounds(620,485,120,50);
        barn.setBounds(620,405,120,50);
        shop.setBounds(470,405,120,50);
        slep.setBounds(470,485,120,50);
        procceday.setBounds(495,445,120,50);
        nma.setBounds(200,125,100,50);
        create.setBounds(550,400,120,50);
        nmawrt.setBounds(200,100,100,25);
        back1.setBounds(500,300,120,50);

        str.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frm.setContentPane(makin);
                frm.revalidate();
                frm.repaint();
            }
        });
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setNm(nma.getText());
                pinfo.setText("<html>--- Level: "+d.getLvl()+" ---<br>Name: "+ d.getNm()+"<br>Exp: "+d.getExp()+" / "+d.getLvl()*50+"<br>Balance: "+d.getBlnc()+" Kč");
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
                for (int i =0;i<y;i++){
                    greenpan.add(new Label("Pepa")).setBounds(l,20*i,20,20);
                }
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
                pinfo.setText("<html>--- Level: "+d.getLvl()+" ---<br>Name: "+ d.getNm()+"<br>Exp: "+d.getExp()+" / "+d.getLvl()*50+"<br>Balance: "+d.getBlnc()+" Kč");
                dwntext2.setText("Zzzzzzz");
                frm.setContentPane(sipan);
                frm.revalidate();
                frm.repaint();
            }
        });
        procceday.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.procceedday(c);
                tim.setText(c.toString());
                frm.setContentPane(rozpan);
                frm.revalidate();
                frm.repaint();
            }
        });
        back1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i =y;i>0;i--) {
                    greenpan.remove(i);
                }
                y = 3;
                l = 50;
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

        greenpan.add(back1);

        sipan.add(dwntext2);
        sipan.add(procceday);
        sipan.add(pinfo);
        sipan.add(downpan2);
        sipan.add(nite);

        makin.add(create);
        makin.add(nma);
        makin.add(nmawrt);

        frm.add(strpan);
        strpan.setLayout(null);
        rozpan.setLayout(null);
        makin.setLayout(null);
        sipan.setLayout(null);
        greenpan.setLayout(null);

        frm.setVisible(true);
    }
}
