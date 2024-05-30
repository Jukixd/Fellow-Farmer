import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    Cycle c = new Cycle();
    Player d = new Player("Karel",1,0,50);
    Farm p = new Farm();
    Shop s = new Shop();
    JPanel strpan = new JPanel();
    JPanel rozpan = new JPanel();
    JPanel barnpan = new JPanel();
    JPanel greenpan = new JPanel();
    JPanel shoppan = new JPanel();
    JPanel sipan = new JPanel();
    JPanel makin = new JPanel();
    JPanel storaq1 = new JPanel();
    JPanel storaq2 = new JPanel();

    JLabel intlabl = new JLabel();
    JLabel pinfo = new JLabel();
    JLabel downpan = new JLabel();
    JLabel downpan2 = new JLabel();
    JLabel downpan3 = new JLabel();
    JLabel downpan4 = new JLabel();
    JLabel rozes = new JLabel();
    JLabel nite = new JLabel();
    JLabel fence = new JLabel();
    JLabel field = new JLabel();
    JLabel downtxt = new JLabel("Where do you want to go next?");
    JLabel dwntext2 = new JLabel("Zzzzzzz");
    JLabel nmawrt = new JLabel("Write your name");
    JLabel dwntext3 = new JLabel("Your animals rest here");
    JLabel dwntext4 = new JLabel("Your plants grow here");
    JLabel storaqes = new JLabel();
    JLabel storages2 = new JLabel();



    JButton str = new JButton("Start!");
    JButton ext = new JButton("Exit!");
    JButton barn = new JButton("Barn");
    JButton green = new JButton("Greenhouse");
    JButton shop = new JButton("Shop");
    JButton slep = new JButton("Sleep");
    JButton procceday = new JButton("Proceed day");
    JButton create = new JButton("Create");
    JButton back1 = new JButton("Back");
    JButton back2 = new JButton("Back");
    JButton back3 = new JButton("Back");
    JButton back4 = new JButton("Back");
    JButton storaq1but = new JButton("Storage");
    JButton storaq2but = new JButton("Storage");
    JButton plant1 = new JButton("plant!");
    JButton plant2 = new JButton("plant!");
    JButton plant3 = new JButton("plant!");
    JButton plant4 = new JButton("plant!");

    JTextField nma = new JTextField();
    int y;
    int l;

    public void trv(JFrame d,JPanel a){
        d.setContentPane(a);
        d.revalidate();
        d.repaint();
    }
    public void godshow(){
        for (int i = 0;i<4;i++){
            if (i==0){
                ImageIcon s = new ImageIcon("pig.png");
                storaq1.add(new JLabel(s)).setBounds(50,70,125,70);
                storaq1.add(new JLabel("Troubo")).setBounds(180,70,200,100);
            }
            else if (i==1){
                ImageIcon s = new ImageIcon("pig.png");
                storaq1.add(new JLabel(s)).setBounds(50,170,125,70);
                storaq1.add(new JLabel("Troubo")).setBounds(180,170,200,100);

            }
            else if (i==2){
                ImageIcon s = new ImageIcon("pig.png");
                storaq1.add(new JLabel(s)).setBounds(50,270,125,70);
                storaq1.add(new JLabel("Troubo")).setBounds(180,270,200,100);
            }
            else if (i==3){
                ImageIcon s = new ImageIcon("pig.png");
                storaq1.add(new JLabel(s)).setBounds(50,370,125,70);
                storaq1.add(new JLabel("Troubo")).setBounds(180,370,200,100);
            }
        }
        storaq1.add(storaqes);
        storaqes.add(back2);
    }
    public void plantshow(){
        for (int i = 0;i<4;i++){
            if (i==0){
                ImageIcon s = new ImageIcon("pig.png");
                storaq2.add(new JLabel(s)).setBounds(50,70,125,70);
                storaq2.add(new JLabel("Troubo")).setBounds(180,70,100,100);
                storaq2.add(new JLabel(s)).setBounds(300,70,125,70);
                storaq2.add(new JLabel("Troubo")).setBounds(450,70,100,100);
                storaq2.add(plant1).setBounds(590,80,120,50);
            }
            else if (i==1){
                ImageIcon s = new ImageIcon("pig.png");
                storaq2.add(new JLabel(s)).setBounds(50,170,125,70);
                storaq2.add(new JLabel("Troubo")).setBounds(180,170,100,100);
                storaq2.add(new JLabel(s)).setBounds(300,170,125,70);
                storaq2.add(new JLabel("Troubo")).setBounds(450,170,100,100);
                storaq2.add(plant2).setBounds(590,180,120,50);

            }
            else if (i==2){
                ImageIcon s = new ImageIcon("pig.png");
                storaq2.add(new JLabel(s)).setBounds(50,270,125,70);
                storaq2.add(new JLabel("Troubo")).setBounds(180,270,100,100);
                storaq2.add(new JLabel(s)).setBounds(300,270,125,70);
                storaq2.add(new JLabel("Troubo")).setBounds(450,270,100,100);
                storaq2.add(plant3).setBounds(590,280,120,50);
            }
            else if (i==3){
                ImageIcon s = new ImageIcon("pig.png");
                storaq2.add(new JLabel(s)).setBounds(50,370,125,70);
                storaq2.add(new JLabel("Troubo")).setBounds(180,370,100,100);
                storaq2.add(new JLabel(s)).setBounds(300,370,125,70);
                storaq2.add(new JLabel("Troubo")).setBounds(450,370,100,100);
                storaq2.add(plant4).setBounds(590,380,120,50);
            }
        }
        storaq2.add(storages2);
        storages2.add(back4);
    }

    public void winmakin(){
        y = 4;
        l = 5;
        c.Firstday();
        JLabel tim = new JLabel(c.toString());
        JFrame frm = new JFrame("Local Farmer");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(800, 600);
        frm.setResizable(false);
        ImageIcon is = new ImageIcon("ifop.png");
        ImageIcon ik = new ImageIcon("downpan.png");
        ImageIcon ig = new ImageIcon("rozns.png");
        ImageIcon ia = new ImageIcon("nite.png");
        ImageIcon ir = new ImageIcon("barn.png");
        ImageIcon iq = new ImageIcon("storaq.png");
        ImageIcon iff = new ImageIcon("field.png");
        rozes.setIcon(ig);
        intlabl.setIcon(is);
        downpan.setIcon(ik);
        downpan2.setIcon(ik);
        downpan3.setIcon(ik);
        downpan4.setIcon(ik);
        fence.setIcon(ir);
        field.setIcon(iff);
        nite.setIcon(ia);
        storaqes.setIcon(iq);
        storages2.setIcon(iq);
        intlabl.setBounds(185,100,430,100);
        downpan.setBounds(0,370,800,200);
        downpan2.setBounds(0,370,800,200);
        downpan3.setBounds(0,370,800,200);
        downpan4.setBounds(0,370,800,200);
        rozes.setBounds(0,0,800,400);
        nite.setBounds(0,0,800,400);
        fence.setBounds(0,-15,800,400);
        field.setBounds(0,-5,800,400);
        tim.setBounds(0,-20,500,50);
        downtxt.setBounds(50,450,200,40);
        dwntext2.setBounds(50,450,200,40);
        dwntext3.setBounds(50,450,200,40);
        dwntext4.setBounds(50,450,200,40);
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
        back1.setBounds(600,450,120,50);
        back2.setBounds(600,450,120,50);
        back3.setBounds(600,450,120,50);
        back4.setBounds(600,500,120,50);
        storaq1but.setBounds(450,450,120,50);
        storaq2but.setBounds(450,450,120,50);
        storaqes.setBounds(-10,0,800,600);
        storages2.setBounds(-10,0,800,600);

        str.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trv(frm,makin);
            }
        });
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setNm(nma.getText());
                pinfo.setText("<html>--- Level: "+d.getLvl()+" ---<br>Name: "+ d.getNm()+"<br>Exp: "+d.getExp()+" / "+d.getLvl()*50+"<br>Balance: "+d.getBlnc()+" Kč");
                trv(frm,rozpan);
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
                for (int i =0;i<l;i++){
                    ImageIcon f = new ImageIcon("sunflow.png");
                    greenpan.add(new JLabel(f)).setBounds(100*i+90,40,75,80);
                }
                greenpan.add(storaq2but);
                greenpan.add(dwntext4);
                greenpan.add(back3);
                greenpan.add(downpan4);
                greenpan.add(field);
                trv(frm,greenpan);
            }
        });
        barn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i =0;i<y;i++){
                    ImageIcon f = new ImageIcon("pig.png");
                    barnpan.add(new JLabel(f)).setBounds(150*i+90,45,125,70);
                }
                barnpan.add(storaq1but);
                barnpan.add(dwntext3);
                barnpan.add(back1);
                barnpan.add(downpan3);
                barnpan.add(fence);
                trv(frm,barnpan);
            }
        });
        shop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trv(frm,shoppan);
            }
        });
        slep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pinfo.setText("<html>--- Level: "+d.getLvl()+" ---<br>Name: "+ d.getNm()+"<br>Exp: "+d.getExp()+" / "+d.getLvl()*50+"<br>Balance: "+d.getBlnc()+" Kč");
                trv(frm,sipan);
            }
        });
        procceday.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.procceedday(c);
                tim.setText(c.toString());
                trv(frm,rozpan);
            }
        });
        back1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                barnpan.removeAll();
                trv(frm,rozpan);
            }
        });
        back2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                barnpan.removeAll();
                storaq1.removeAll();
                trv(frm,rozpan);
            }
        });
        back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                greenpan.removeAll();
                trv(frm,rozpan);
            }
        });
        back4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                greenpan.removeAll();
                storages2.removeAll();
                trv(frm,rozpan);

            }
        });
        storaq1but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                godshow();
                trv(frm,storaq1);
            }
        });
        storaq2but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plantshow();
                trv(frm,storaq2);
            }
        });
        plant1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l=6;
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
        barnpan.setLayout(null);
        storaq1.setLayout(null);
        storaq2.setLayout(null);

        frm.setVisible(true);
    }
}
