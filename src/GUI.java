import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    Cycle c = new Cycle();
    Player d = new Player("Karel", 1, 0, 50);
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
    JLabel downpan5 = new JLabel();
    JLabel rozes = new JLabel();
    JLabel nite = new JLabel();
    JLabel fence = new JLabel();
    JLabel field = new JLabel();
    JLabel downtxt = new JLabel("Where do you want to go next?");
    JLabel dwntext2 = new JLabel("Zzzzzzz");
    JLabel nmawrt = new JLabel("Write your name");
    JLabel dwntext3 = new JLabel("Your animals rest here");
    JLabel dwntext4 = new JLabel("Your plants grow here");
    JLabel dwntext5 = new JLabel("You Need some goods stranger?");
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

    JButton back5 = new JButton("Back");
    JButton buy = new JButton("Buy");
    JButton sell = new JButton("Sell");
    JButton sedbuy = new JButton("Seeds");
    JButton anibuy = new JButton("Animals");
    JButton pigbuy = new JButton("Pig");
    JButton chibuy = new JButton("Chicken");
    JButton cowbuy = new JButton("Cow");
    JButton goabuy = new JButton("Goat");
    JButton godies = new JButton("Goodies");
    JLabel balancecon = new JLabel();
    JButton eggsel = new JButton("Eggs");
    JButton milksel = new JButton("Milk");
    JButton chesel = new JButton("Cheese");
    JButton bacosel = new JButton("Bacon");
    JButton cornbuy = new JButton();
    JButton carrotbuy = new JButton();
    JButton sunflobuy = new JButton();
    JButton pumpbuy = new JButton();

    JTextField nma = new JTextField();

    int l;
    int busecon = 0;

    public void trv(JFrame d, JPanel a) {
        d.setContentPane(a);
        d.revalidate();
        d.repaint();
    }

    public void godshow() {
        int milk=0;
        int egg=0;
        int bacon=0;
        int chese=0;

        for (int i = 0;i<p.godstoraq.size();i++){
            if (p.godstoraq.get(i).getType()==Godies.Eggs){
                egg++;
            }
            else if (p.godstoraq.get(i).getType()==Godies.Milk){
                milk++;
            }
            else if (p.godstoraq.get(i).getType()==Godies.Cheese){
                chese++;
            }
            else if (p.godstoraq.get(i).getType()==Godies.Pork){
                bacon++;
            }
        }

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                ImageIcon s = new ImageIcon("egg.png");
                storaq1.add(new JLabel(s)).setBounds(50, 70, 125, 70);
                storaq1.add(new JLabel("Egg: " + egg + "x")).setBounds(180, 70, 200, 100);
            } else if (i == 1) {
                ImageIcon s = new ImageIcon("cheese.png");
                storaq1.add(new JLabel(s)).setBounds(50, 170, 125, 70);
                storaq1.add(new JLabel("Cheese: " + chese + "x")).setBounds(180, 170, 200, 100);

            } else if (i == 2) {
                ImageIcon s = new ImageIcon("milk.png");
                storaq1.add(new JLabel(s)).setBounds(50, 270, 125, 70);
                storaq1.add(new JLabel("Milk: " + milk + "x")).setBounds(180, 270, 200, 100);
            } else if (i == 3) {
                ImageIcon s = new ImageIcon("bacon.png");
                storaq1.add(new JLabel(s)).setBounds(50, 370, 125, 70);
                storaq1.add(new JLabel("Bacon: " + bacon + "x")).setBounds(180, 370, 200, 100);
            }
        }
        storaq1.add(storaqes);
        storaqes.add(back2);
    }

    public void plantshow() {
        int sesuflo = 0;
        int sepumki = 0;
        int secorn = 0;
        int secarrot = 0;
        int suflo = 0;
        int pumpi = 0;
        int corn = 0;
        int carrot = 0;

        for (int g = 0; g < p.storagsed.size(); g++) {
            if (p.storagsed.get(g).getType() == Sedype.SunflowerSeeds) {
                sesuflo++;
            } else if (p.storagsed.get(g).getType() == Sedype.PumkinSeeds) {
                sepumki++;
            } else if (p.storagsed.get(g).getType() == Sedype.CarrotSeeds) {
                secarrot++;
            } else if (p.storagsed.get(g).getType() == Sedype.CornSeeds) {
                secorn++;
            }
        }
        for (int g = 0; g < p.flwsite.size(); g++) {
            if (p.flwsite.get(g).getType() == flwType.Sunflower) {
                suflo++;
            } else if (p.flwsite.get(g).getType() == flwType.Pumpkin) {
                pumpi++;
            } else if (p.flwsite.get(g).getType() == flwType.Carrot) {
                carrot++;
            } else if (p.flwsite.get(g).getType() == flwType.Corn) {
                corn++;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                ImageIcon s = new ImageIcon("pig.png");
                storaq2.add(new JLabel(s)).setBounds(50, 70, 125, 70);
                storaq2.add(new JLabel("Seeds: " + secorn + " Crops: " + corn)).setBounds(180, 70, 200, 100);
                storaq2.add(plant1).setBounds(590, 80, 120, 50);
            } else if (i == 1) {
                ImageIcon s = new ImageIcon("pig.png");
                storaq2.add(new JLabel(s)).setBounds(50, 170, 125, 70);
                storaq2.add(new JLabel("Seeds: " + secarrot + " Crops: " + carrot)).setBounds(180, 170, 200, 100);
                storaq2.add(plant2).setBounds(590, 180, 120, 50);
            } else if (i == 2) {
                ImageIcon s = new ImageIcon("sunflow.png");
                storaq2.add(new JLabel(s)).setBounds(50, 270, 125, 70);
                storaq2.add(new JLabel("Seeds: " + sesuflo + " Crops: " + suflo)).setBounds(180, 270, 200, 100);
                storaq2.add(plant3).setBounds(590, 280, 120, 50);
            } else if (i == 3) {
                ImageIcon s = new ImageIcon("pig.png");
                storaq2.add(new JLabel(s)).setBounds(50, 370, 125, 70);
                storaq2.add(new JLabel("Seeds: " + sepumki + " Crops: " + pumpi)).setBounds(180, 370, 200, 100);
                storaq2.add(plant4).setBounds(590, 380, 120, 50);
            }

        }
        storaq2.add(back4);
        storaq2.add(storages2);

    }

    public void winmakin() {

        l = 5;
        c.Firstday();
        JLabel tim = new JLabel(c.toString());
        JFrame frm = new JFrame("Local Farmer");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(800, 600);
        frm.setResizable(false);
        ImageIcon is = new ImageIcon("ifop.png");
        ImageIcon ik = new ImageIcon("downpan.png");
        ImageIcon ig = new ImageIcon("rozes.png");
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
        downpan5.setIcon(ik);
        fence.setIcon(ir);
        field.setIcon(iff);
        nite.setIcon(ia);
        storaqes.setIcon(iq);
        storages2.setIcon(iq);
        intlabl.setBounds(185, 100, 430, 100);
        downpan.setBounds(0, 370, 800, 200);
        downpan2.setBounds(0, 370, 800, 200);
        downpan3.setBounds(0, 370, 800, 200);
        downpan4.setBounds(0, 370, 800, 200);
        downpan5.setBounds(0, 370, 800, 200);
        rozes.setBounds(0, 0, 800, 400);
        nite.setBounds(0, 0, 800, 400);
        fence.setBounds(0, -15, 800, 400);
        field.setBounds(0, -5, 800, 400);
        tim.setBounds(0, -15, 500, 50);
        downtxt.setBounds(50, 450, 200, 40);
        dwntext2.setBounds(50, 450, 200, 40);
        dwntext3.setBounds(50, 450, 200, 40);
        dwntext4.setBounds(50, 450, 200, 40);
        dwntext5.setBounds(35, 450, 300, 40);
        pinfo.setBounds(335, 50, 400, 300);
        str.setBounds(350, 400, 100, 50);
        ext.setBounds(350, 455, 100, 50);
        green.setBounds(620, 485, 120, 50);
        barn.setBounds(620, 405, 120, 50);
        shop.setBounds(470, 405, 120, 50);
        slep.setBounds(470, 485, 120, 50);
        procceday.setBounds(495, 445, 120, 50);
        nma.setBounds(200, 125, 100, 50);
        create.setBounds(550, 400, 120, 50);
        nmawrt.setBounds(200, 100, 100, 25);
        back1.setBounds(600, 450, 120, 50);
        back2.setBounds(600, 450, 120, 50);
        back3.setBounds(600, 450, 120, 50);
        back4.setBounds(600, 500, 120, 50);
        back5.setBounds(600, 450, 120, 50);
        storaq1but.setBounds(450, 450, 120, 50);
        storaq2but.setBounds(450, 450, 120, 50);
        storaqes.setBounds(-10, 0, 800, 600);
        storages2.setBounds(-10, 0, 800, 600);
        buy.setBounds(450, 450, 120, 50);
        sell.setBounds(300, 450, 120, 50);
        anibuy.setBounds(300, 450, 120, 50);
        pigbuy.setBounds(450, 485, 120, 50);
        cowbuy.setBounds(450, 405, 120, 50);
        chibuy.setBounds(300, 405, 120, 50);
        goabuy.setBounds(300, 485, 120, 50);
        balancecon.setBounds(620, 390, 200, 40);
        godies.setBounds(450, 410, 120, 50);
        cornbuy.setBounds(250, 405, 150, 50);
        carrotbuy.setBounds(425, 405, 150, 50);
        sunflobuy.setBounds(250, 485, 150, 50);
        pumpbuy.setBounds(425, 485, 150, 50);
        eggsel.setBounds(300, 405, 120, 50);
        milksel.setBounds(405, 405, 120, 50);
        chesel.setBounds(300, 485, 120, 50);
        bacosel.setBounds(450, 485, 120, 50);


        str.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trv(frm, makin);
            }
        });
        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setNm(nma.getText());
                pinfo.setText("<html>--- Level: " + d.getLvl() + " ---<br>Name: " + d.getNm() + "<br>Exp: " + d.getExp() + " / " + d.getLvl() * 50 + "<br>Balance: " + d.getBlnc() + " Kč");
                trv(frm, rozpan);
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
                for (int i = 0; i < p.greenhouse.size(); i++) {
                    if (p.greenhouse.get(i).getType() == Sedype.CornSeeds) {
                        ImageIcon d = new ImageIcon("sunflow.png");
                        if (i > 11) {
                            greenpan.add(new JLabel(d)).setBounds(100 * i + 90 - 1200, 235, 75, 80);
                        } else if (i > 5) {
                            greenpan.add(new JLabel(d)).setBounds(100 * i + 90 - 600, 135, 75, 80);
                        } else {
                            greenpan.add(new JLabel(d)).setBounds(100 * i + 90, 40, 75, 80);
                        }
                    }


                }
                greenpan.add(storaq2but);
                greenpan.add(dwntext4);
                greenpan.add(back3);
                greenpan.add(downpan4);
                greenpan.add(field);
                trv(frm, greenpan);
            }
        });
        barn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < p.anmlsite.size(); i++) {
                    if (p.anmlsite.get(i).getType() == AnmTpes.Pig) {
                        ImageIcon f = new ImageIcon("pig.png");
                        if (i > 3) {
                            barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 600, 125, 125, 70);
                        } else {
                            barnpan.add(new JLabel(f)).setBounds(150 * i + 90, 45, 125, 70);
                        }
                    } else if (p.anmlsite.get(i).getType() == AnmTpes.Cow) {
                        ImageIcon f = new ImageIcon("cow.png");
                        if (i > 3) {
                            barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 600, 125, 125, 70);
                        } else {
                            barnpan.add(new JLabel(f)).setBounds(150 * i + 90, 45, 125, 70);
                        }
                    } else if (p.anmlsite.get(i).getType() == AnmTpes.Chicken) {
                        ImageIcon f = new ImageIcon("cow.png");
                        if (i > 3) {
                            barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 600, 125, 125, 70);
                        } else {
                            barnpan.add(new JLabel(f)).setBounds(150 * i + 90, 45, 125, 70);
                        }
                    } else if (p.anmlsite.get(i).getType() == AnmTpes.Goat) {
                        ImageIcon f = new ImageIcon("cow.png");
                        if (i > 3) {
                            barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 600, 125, 125, 70);
                        } else {
                            barnpan.add(new JLabel(f)).setBounds(150 * i + 90, 45, 125, 70);
                        }
                    }
                }
                barnpan.add(storaq1but);
                barnpan.add(dwntext3);
                barnpan.add(back1);
                barnpan.add(downpan3);
                barnpan.add(fence);
                trv(frm, barnpan);
            }
        });
        slep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pinfo.setText("<html>--- Level: " + d.getLvl() + " ---<br>Name: " + d.getNm() + "<br>Exp: " + d.getExp() + " / " + d.getLvl() * 50 + "<br>Balance: " + d.getBlnc() + " Kč");
                trv(frm, sipan);
            }
        });
        procceday.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.procceedday(c,p);
                tim.setText(c.toString());
                trv(frm, rozpan);
            }
        });
        back1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                barnpan.removeAll();
                trv(frm, rozpan);
            }
        });
        back2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                barnpan.removeAll();
                trv(frm, rozpan);
            }
        });
        back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                greenpan.removeAll();
                storaq2.removeAll();
                trv(frm, rozpan);
            }
        });
        back4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                greenpan.removeAll();
                storaq2.removeAll();
                trv(frm, rozpan);

            }
        });
        storaq1but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                godshow();
                trv(frm, storaq1);
            }
        });
        storaq2but.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plantshow();
                trv(frm, storaq2);
            }
        });
        plant1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l = 6;
            }
        });


        shop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                balancecon.setText("Ballance: " + d.getBlnc());
                shoppan.add(balancecon);
                shoppan.add(dwntext5);
                shoppan.add(buy);
                shoppan.add(sell);
                shoppan.add(back5);
                shoppan.add(downpan5);
                trv(frm, shoppan);
            }
        });
        back5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dwntext5.setText("You Need some goods stranger?");
                shoppan.removeAll();
                busecon = 0;
                trv(frm, rozpan);
            }
        });
        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shoppan.remove(buy);
                shoppan.remove(sell);
                shoppan.remove(downpan5);
                shoppan.add(sedbuy);
                sedbuy.setBounds(450, 450, 120, 50);
                shoppan.add(anibuy);
                dwntext5.setText("What ya buyin stranger?");
                shoppan.add(downpan5);
                frm.revalidate();
                frm.repaint();
            }
        });
        sell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shoppan.remove(buy);
                shoppan.remove(sell);
                shoppan.remove(downpan5);
                shoppan.add(sedbuy);
                sedbuy.setBounds(450, 490, 120, 50);
                sedbuy.setText("Crops");
                shoppan.add(godies);
                shoppan.add(anibuy);
                dwntext5.setText("What ya sellin stranger?");
                shoppan.add(downpan5);
                frm.revalidate();
                frm.repaint();
                busecon++;
            }
        });
        anibuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shoppan.remove(anibuy);
                shoppan.remove(sedbuy);
                shoppan.remove(downpan5);
                shoppan.add(pigbuy);
                shoppan.add(goabuy);
                shoppan.add(cowbuy);
                shoppan.add(chibuy);
                if (busecon == 0) {
                    dwntext5.setText("Which one of these Animals ya buyin?");
                } else {
                    dwntext5.setText("Which one of these Animals ya sellin?");
                }
                shoppan.add(downpan5);
                frm.revalidate();
                frm.repaint();
            }
        });
        sedbuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (busecon == 0) {
                    shoppan.remove(anibuy);
                    shoppan.remove(sedbuy);
                    shoppan.remove(downpan5);
                    dwntext5.setText("Which seeds are you buyin ?");
                    shoppan.add(cornbuy);
                    cornbuy.setText("Corn seeds: 50");
                    shoppan.add(carrotbuy);
                    carrotbuy.setText("Carrot seeds: 100");
                    shoppan.add(sunflobuy);
                    sunflobuy.setText("Sunflwr seeds: 150");
                    shoppan.add(pumpbuy);
                    pumpbuy.setText("Pumpkin seeds: 250");
                    shoppan.add(downpan5);
                    frm.revalidate();
                    frm.repaint();
                } else {
                    shoppan.remove(anibuy);
                    shoppan.remove(sedbuy);
                    shoppan.remove(godies);
                    shoppan.remove(downpan5);
                    dwntext5.setText("Which crops are you buyin ?");
                    shoppan.add(cornbuy);
                    cornbuy.setText("Corns: 100");
                    shoppan.add(carrotbuy);
                    carrotbuy.setText("Carrots: 200");
                    shoppan.add(sunflobuy);
                    sunflobuy.setText("Sunflwr: 300");
                    shoppan.add(pumpbuy);
                    pumpbuy.setText("Pumpkins: 500");
                    shoppan.add(downpan5);
                    frm.revalidate();
                    frm.repaint();
                }
            }
        });
        pigbuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (busecon == 0) {
                    if (s.buyanm(d, p, c, 4) == false) {
                        JOptionPane.showMessageDialog(frm, "You dont have enough money stranger");
                    }
                    balancecon.setText("Ballance: " + d.getBlnc());
                    frm.revalidate();
                    frm.repaint();

                } else {

                }
            }
        });
        goabuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.setBlnc(d.getBlnc() + 500);
                balancecon.setText("Ballance: " + d.getBlnc());
                frm.revalidate();
                frm.repaint();
            }
        });
        cowbuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (s.buyanm(d, p, c, 1) == false) {
                    JOptionPane.showMessageDialog(frm, "You dont have enough money stranger");
                }
                balancecon.setText("Ballance: " + d.getBlnc());
                frm.revalidate();
                frm.repaint();
            }
        });
        chibuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (s.buyanm(d, p, c, 2) == false) {
                    JOptionPane.showMessageDialog(frm, "You dont have enough money stranger");
                }
                balancecon.setText("Ballance: " + d.getBlnc());
                frm.revalidate();
                frm.repaint();
            }
        });
        cornbuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (s.buysed(d, p, 2, c) == false) {
                    JOptionPane.showMessageDialog(frm, "You dont have enough money stranger");
                }
                balancecon.setText("Ballance: " + d.getBlnc());
                frm.revalidate();
                frm.repaint();
            }
        });
        carrotbuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (s.buysed(d, p, 3, c) == false) {
                    JOptionPane.showMessageDialog(frm, "You dont have enough money stranger");
                }
                balancecon.setText("Ballance: " + d.getBlnc());
                frm.revalidate();
                frm.repaint();
            }
        });
        pumpbuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (s.buysed(d, p, 4, c) == false) {
                    JOptionPane.showMessageDialog(frm, "You dont have enough money stranger");
                }
                balancecon.setText("Ballance: " + d.getBlnc());
                frm.revalidate();
                frm.repaint();
            }
        });
        sunflobuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (s.buysed(d, p, 1, c) == false) {
                    JOptionPane.showMessageDialog(frm, "You dont have enough money stranger");
                }
                balancecon.setText("Ballance: " + d.getBlnc());
                frm.revalidate();
                frm.repaint();
            }
        });
        plant1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int zs = 0;
                if (p.greenhouse.size()<18) {
                    for (int i = 0; i < p.storagsed.size(); i++) {
                        if (p.storagsed.get(i).getType() == Sedype.CornSeeds) {
                            p.greenhouse.add(p.storagsed.get(i));
                            p.storagsed.remove(p.storagsed.get(i));
                            JOptionPane.showMessageDialog(frm, "Plant successfully planted");
                            zs++;
                            storaq2.removeAll();
                            plantshow();
                            break;
                        }
                    }
                    if (zs == 0) {
                        JOptionPane.showMessageDialog(frm, "You don have any Corn seeds");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(frm, "You cant plant more seeds your field is full");
                }

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

        shoppan.add(dwntext5);
        shoppan.add(downpan5);

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
        shoppan.setLayout(null);

        frm.setVisible(true);
    }
}
