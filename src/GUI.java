import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;

// class for GUI to work
public class GUI {

    Cycle c = new Cycle();
    Player d = new Player("Karel", 150);
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
    JLabel shopback = new JLabel();
    JLabel mail = new JLabel();
    JLabel intlabl = new JLabel();


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
    JButton pigbuy = new JButton("Pig: 1000");
    JButton chibuy = new JButton("Chicken: 200");
    JButton cowbuy = new JButton("Cow: 400");
    JButton goabuy = new JButton("Goat: 600");
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
    JButton payup = new JButton("Debt: 100 000");

    JTextField nma = new JTextField();
    JTextField farmnma = new JTextField();


    int busecon = 0;


    // method to make travel easy
    public void trv(JFrame d, JPanel a) {
        d.setContentPane(a);
        d.revalidate();
        d.repaint();
    }


    // method for showing the storage for animal goodies
    public void godshow() {
        int milk = 0;
        int egg = 0;
        int bacon = 0;
        int chese = 0;

        for (int i = 0; i < p.godstoraq.size(); i++) {
            if (p.godstoraq.get(i).getType() == Godies.Eggs) {
                egg++;
            } else if (p.godstoraq.get(i).getType() == Godies.Milk) {
                milk++;
            } else if (p.godstoraq.get(i).getType() == Godies.Cheese) {
                chese++;
            } else if (p.godstoraq.get(i).getType() == Godies.Pork) {
                bacon++;
            }
        }

        for (int i = 0; i < 4; i++) {
                if (i == 0) {
                    try (InputStream inputStream = Main.class.getResourceAsStream("egg.png")) {
                        if (inputStream != null) {
                            ImageIcon s = new ImageIcon(ImageIO.read(inputStream));
                            storaq1.add(new JLabel(s)).setBounds(50, 70, 125, 70);
                        } else {
                            System.err.println("Not there :(");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    storaq1.add(new JLabel("Egg: " + egg + "x")).setBounds(180, 70, 200, 100);
                } else if (i == 1) {
                    try (InputStream inputStream = Main.class.getResourceAsStream("cheese.png")) {
                        if (inputStream != null) {
                            ImageIcon s = new ImageIcon(ImageIO.read(inputStream));
                            storaq1.add(new JLabel(s)).setBounds(50, 170, 125, 70);
                        } else {
                            System.err.println("Not there :(");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    storaq1.add(new JLabel("Cheese: " + chese + "x")).setBounds(180, 170, 200, 100);
                } else if (i == 2) {
                    try (InputStream inputStream = Main.class.getResourceAsStream("milk.png")) {
                        if (inputStream != null) {
                            ImageIcon s = new ImageIcon(ImageIO.read(inputStream));
                            storaq1.add(new JLabel(s)).setBounds(50, 270, 125, 70);
                        } else {
                            System.err.println("Not there :(");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    storaq1.add(new JLabel("Milk: " + milk + "x")).setBounds(180, 270, 200, 100);
                } else if (i == 3) {
                    try (InputStream inputStream = Main.class.getResourceAsStream("bacon.png")) {
                        if (inputStream != null) {
                            ImageIcon s = new ImageIcon(ImageIO.read(inputStream));
                            storaq1.add(new JLabel(s)).setBounds(50, 370, 125, 70);
                        } else {
                            System.err.println("Not there :(");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    storaq1.add(new JLabel("Bacon: " + bacon + "x")).setBounds(180, 370, 200, 100);

            }
        }
        storaq1.add(back2);
        storaq1.add(storaqes);
    }

    //method for showing the grown crops and seeds
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
                try (InputStream inputStream = Main.class.getResourceAsStream("corn.png")) {
                    if (inputStream != null) {
                        ImageIcon s = new ImageIcon(ImageIO.read(inputStream));
                        storaq2.add(new JLabel(s)).setBounds(50, 70, 125, 70);
                    } else {
                        System.err.println("Not there :(");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                storaq2.add(new JLabel("Seeds: " + secorn + " Crops: " + corn)).setBounds(180, 70, 200, 100);
                storaq2.add(plant1).setBounds(590, 80, 120, 50);
            } else if (i == 1) {
                try (InputStream inputStream = Main.class.getResourceAsStream("carrot.png")) {
                    if (inputStream != null) {
                        ImageIcon s = new ImageIcon(ImageIO.read(inputStream));
                        storaq2.add(new JLabel(s)).setBounds(50, 170, 125, 70);
                    } else {
                        System.err.println("Not there :(");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                storaq2.add(new JLabel("Seeds: " + secarrot + " Crops: " + carrot)).setBounds(180, 170, 200, 100);
                storaq2.add(plant2).setBounds(590, 180, 120, 50);
            } else if (i == 2) {
                try (InputStream inputStream = Main.class.getResourceAsStream("sunflow.png")) {
                    if (inputStream != null) {
                        ImageIcon s = new ImageIcon(ImageIO.read(inputStream));
                        storaq2.add(new JLabel(s)).setBounds(50, 270, 125, 70);
                    } else {
                        System.err.println("Not there :(");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                storaq2.add(new JLabel("Seeds: " + sesuflo + " Crops: " + suflo)).setBounds(180, 270, 200, 100);
                storaq2.add(plant3).setBounds(590, 280, 120, 50);
            } else if (i == 3) {
                try (InputStream inputStream = Main.class.getResourceAsStream("pumper.png")) {
                    if (inputStream != null) {
                        ImageIcon s = new ImageIcon(ImageIO.read(inputStream));
                        storaq2.add(new JLabel(s)).setBounds(50, 370, 125, 70);
                    } else {
                        System.err.println("Not there :(");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                storaq2.add(new JLabel("Seeds: " + sepumki + " Crops: " + pumpi)).setBounds(180, 370, 200, 100);
                storaq2.add(plant4).setBounds(590, 380, 120, 50);
            }

        }
        storaq2.add(back4);
        storaq2.add(storages2);

    }


    //method for making the window
    public void winmakin() throws IOException {

        c.Firstday();
        JLabel tim = new JLabel(c.toString());
        JFrame frm = new JFrame("Local Farmer");
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(800, 600);
        frm.setResizable(false);


        try (InputStream inputStream = Main.class.getResourceAsStream("ifop.png")) {
            if (inputStream != null) {
                ImageIcon ia = new ImageIcon(ImageIO.read(inputStream));
                intlabl.setIcon(ia);
            } else {
                System.err.println("Not there :(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = Main.class.getResourceAsStream("downpan.png")) {
            if (inputStream != null) {
                ImageIcon ik = new ImageIcon(ImageIO.read(inputStream));
                downpan.setIcon(ik);
                downpan2.setIcon(ik);
                downpan3.setIcon(ik);
                downpan4.setIcon(ik);
                downpan5.setIcon(ik);
            } else {
                System.err.println("Not there :(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = Main.class.getResourceAsStream("rozes.png")) {
            if (inputStream != null) {
                ImageIcon ig = new ImageIcon(ImageIO.read(inputStream));
                rozes.setIcon(ig);
            } else {
                System.err.println("Not there :(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = Main.class.getResourceAsStream("nite.png")) {
            if (inputStream != null) {
                ImageIcon ifd = new ImageIcon(ImageIO.read(inputStream));
                nite.setIcon(ifd);
            } else {
                System.err.println("Not there :(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = Main.class.getResourceAsStream("barn.png")) {
            if (inputStream != null) {
                ImageIcon ir = new ImageIcon(ImageIO.read(inputStream));
                fence.setIcon(ir);
            } else {
                System.err.println("Not there :(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = Main.class.getResourceAsStream("storaq.png")) {
            if (inputStream != null) {
                ImageIcon iq = new ImageIcon(ImageIO.read(inputStream));
                storaqes.setIcon(iq);
                storages2.setIcon(iq);
            } else {
                System.err.println("Not there :(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = Main.class.getResourceAsStream("field.png")) {
            if (inputStream != null) {
                ImageIcon iff = new ImageIcon(ImageIO.read(inputStream));
                field.setIcon(iff);
            } else {
                System.err.println("Not there :(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = Main.class.getResourceAsStream("merchant.png")) {
            if (inputStream != null) {
                ImageIcon im = new ImageIcon(ImageIO.read(inputStream));
                shopback.setIcon(im);
            } else {
                System.err.println("Not there :(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = Main.class.getResourceAsStream("mail.png")) {
            if (inputStream != null) {
                ImageIcon imai = new ImageIcon(ImageIO.read(inputStream));
                mail.setIcon(imai);
            } else {
                System.err.println("Not there :(");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        intlabl.setBounds(0, 0, 800, 600);
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
        shopback.setBounds(0, 0, 800, 400);
        mail.setBounds(-5, -5, 800, 600);
        nma.setBounds(150, 60, 330, 40);
        farmnma.setBounds(370, 215, 215, 30);
        create.setBounds(620, 50, 120, 50);
        payup.setBounds(550, 30, 220, 50);



        // lot of action listeners for button to do something
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
                p.setNm(farmnma.getText());
                if (nma.getText().length() > 0 && nma.getText().length() < 9) {
                    if ((farmnma.getText().length() > 0 && farmnma.getText().length() < 9)) {
                        pinfo.setText("<html>--- Level: " + p.getNm() + " ---<br>Name: " + d.getNm() + "<br>Season: " + c.getSeason() + "<br>Balance: " + d.getBlnc() + " Kč");
                        trv(frm, rozpan);
                    } else {
                        JOptionPane.showMessageDialog(frm, "Farm can have max 8 chars and min 1 char");
                    }
                } else {
                    JOptionPane.showMessageDialog(frm, "Name can have max 8 chars and min 1 char");
                }

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
                        try (InputStream inputStream = Main.class.getResourceAsStream("corn.png")) {
                            if (inputStream != null) {
                                ImageIcon d = new ImageIcon(ImageIO.read(inputStream));
                                if (i > 11) {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90 - 1200, 235, 75, 80);
                                } else if (i > 5) {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90 - 600, 135, 75, 80);
                                } else {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90, 40, 75, 80);
                                }
                            } else {
                                System.err.println("Not there :(");
                            }
                        } catch (IOException c) {
                            c.printStackTrace();
                        }
                    } else if (p.greenhouse.get(i).getType() == Sedype.CarrotSeeds) {
                        try (InputStream inputStream = Main.class.getResourceAsStream("carrot.png")) {
                            if (inputStream != null) {
                                ImageIcon d = new ImageIcon(ImageIO.read(inputStream));
                                if (i > 11) {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90 - 1200, 235, 75, 80);
                                } else if (i > 5) {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90 - 600, 135, 75, 80);
                                } else {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90, 40, 75, 80);
                                }
                            } else {
                                System.err.println("Not there :(");
                            }
                        } catch (IOException c) {
                            c.printStackTrace();
                        }
                    } else if (p.greenhouse.get(i).getType() == Sedype.SunflowerSeeds) {
                        try (InputStream inputStream = Main.class.getResourceAsStream("sunflow.png")) {
                            if (inputStream != null) {
                                ImageIcon d = new ImageIcon(ImageIO.read(inputStream));
                                if (i > 11) {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90 - 1200, 235, 75, 80);
                                } else if (i > 5) {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90 - 600, 135, 75, 80);
                                } else {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90, 40, 75, 80);
                                }
                            } else {
                                System.err.println("Not there :(");
                            }
                        } catch (IOException c) {
                            c.printStackTrace();
                        }
                    } else if (p.greenhouse.get(i).getType() == Sedype.PumkinSeeds) {
                        try (InputStream inputStream = Main.class.getResourceAsStream("pumper.png")) {
                            if (inputStream != null) {
                                ImageIcon d = new ImageIcon(ImageIO.read(inputStream));
                                if (i > 11) {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90 - 1200, 235, 75, 80);
                                } else if (i > 5) {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90 - 600, 135, 75, 80);
                                } else {
                                    greenpan.add(new JLabel(d)).setBounds(100 * i + 90, 40, 75, 80);
                                }
                            } else {
                                System.err.println("Not there :(");
                            }
                        } catch (IOException c) {
                            c.printStackTrace();
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
                        try (InputStream inputStream = Main.class.getResourceAsStream("pig.png")) {
                            if (inputStream != null) {
                                ImageIcon f = new ImageIcon(ImageIO.read(inputStream));
                                if (i > 7) {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 1200, 205, 125, 70);
                                } else if (i > 3) {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 600, 125, 125, 70);
                                } else {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90, 45, 125, 70);
                                }
                            } else {
                                System.err.println("Not there :(");
                            }
                        } catch (IOException c) {
                            c.printStackTrace();
                        }
                    } else if (p.anmlsite.get(i).getType() == AnmTpes.Cow) {

                        try (InputStream inputStream = Main.class.getResourceAsStream("cow.png")) {
                            if (inputStream != null) {
                                ImageIcon f = new ImageIcon(ImageIO.read(inputStream));
                                if (i > 7) {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 1200, 205, 125, 70);
                                } else if (i > 3) {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 600, 125, 125, 70);
                                } else {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90, 45, 125, 70);
                                }
                            } else {
                                System.err.println("Not there :(");
                            }
                        } catch (IOException c) {
                            c.printStackTrace();
                        }
                    } else if (p.anmlsite.get(i).getType() == AnmTpes.Chicken) {
                        try (InputStream inputStream = Main.class.getResourceAsStream("chiken.png")) {
                            if (inputStream != null) {
                                ImageIcon f = new ImageIcon(ImageIO.read(inputStream));
                                if (i > 7) {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 1200, 205, 125, 70);
                                } else if (i > 3) {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 600, 125, 125, 70);
                                } else {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90, 45, 125, 70);
                                }
                            } else {
                                System.err.println("Not there :(");
                            }
                        } catch (IOException c) {
                            c.printStackTrace();
                        }
                    } else if (p.anmlsite.get(i).getType() == AnmTpes.Goat) {
                        try (InputStream inputStream = Main.class.getResourceAsStream("goat.png")) {
                            if (inputStream != null) {
                                ImageIcon f = new ImageIcon(ImageIO.read(inputStream));
                                if (i > 7) {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 1200, 205, 125, 70);
                                } else if (i > 3) {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90 - 600, 125, 125, 70);
                                } else {
                                    barnpan.add(new JLabel(f)).setBounds(150 * i + 90, 45, 125, 70);
                                }
                            } else {
                                System.err.println("Not there :(");
                            }
                        } catch (IOException c) {
                            c.printStackTrace();
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
                pinfo.setText("<html>--- Farm: " + p.getNm() + " ---<br>Name: " + d.getNm() + "<br>Season: " + c.getSeason() + "<br>Balance: " + d.getBlnc() + " Kč");
                trv(frm, sipan);
            }
        });
        procceday.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.procceedday(c, p);
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
        shop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                balancecon.setText("Ballance: " + d.getBlnc());
                shoppan.add(payup);
                shoppan.add(balancecon);
                shoppan.add(dwntext5);
                shoppan.add(buy);
                shoppan.add(sell);
                shoppan.add(back5);
                shoppan.add(downpan5);
                shoppan.add(shopback);
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
                shoppan.remove(shopback);
                shoppan.add(sedbuy);
                sedbuy.setBounds(450, 450, 120, 50);
                shoppan.add(anibuy);
                dwntext5.setText("What ya buyin stranger?");
                shoppan.add(downpan5);
                shoppan.add(shopback);
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
                shoppan.remove(shopback);
                shoppan.add(sedbuy);
                sedbuy.setBounds(450, 490, 120, 50);
                sedbuy.setText("Crops");
                shoppan.add(godies);
                shoppan.add(anibuy);
                dwntext5.setText("What ya sellin stranger?");
                shoppan.add(downpan5);
                shoppan.add(shopback);
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
                shoppan.remove(godies);
                shoppan.remove(downpan5);
                shoppan.remove(shopback);
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
                shoppan.add(shopback);
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
                    shoppan.remove(shopback);
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
                    shoppan.add(shopback);
                    frm.revalidate();
                    frm.repaint();
                } else {
                    int selamot = 0;
                    for (int i = p.flwsite.size(); 0 < i; i--) {
                        selamot += p.flwsite.get(i - 1).getCost();
                        p.flwsite.remove(i - 1);
                    }
                    if (selamot == 0) {
                        JOptionPane.showMessageDialog(frm, "You have no Crops");

                    } else {
                        d.setBlnc(d.getBlnc() + selamot);
                        balancecon.setText("Ballance: " + d.getBlnc());
                        JOptionPane.showMessageDialog(frm, "Crops successfully sold");
                        frm.revalidate();
                        frm.repaint();
                    }

                }
            }
        });
        godies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selamot = 0;
                for (int i = p.godstoraq.size(); 0 < i; i--) {
                    selamot += p.godstoraq.get(i - 1).getCost();
                    p.godstoraq.remove(i - 1);
                }
                if (selamot == 0) {
                    JOptionPane.showMessageDialog(frm, "You have no Goodies");

                } else {
                    d.setBlnc(d.getBlnc() + selamot);
                    balancecon.setText("Ballance: " + d.getBlnc());
                    JOptionPane.showMessageDialog(frm, "Goodies successfully sold");
                    frm.revalidate();
                    frm.repaint();
                }
            }
        });
        pigbuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p.anmlsite.size() < 12) {
                    if (busecon == 0) {
                        if (s.buyanm(d, p, c, 4) == false) {
                            JOptionPane.showMessageDialog(frm, "You dont have enough money stranger");
                        }
                        balancecon.setText("Ballance: " + d.getBlnc());
                        frm.revalidate();
                        frm.repaint();

                    } else {
                        if (s.selanm(d, p, AnmTpes.Pig) == false) {
                            JOptionPane.showMessageDialog(frm, "You dont have any Pigs stranger");
                        }
                        balancecon.setText("Ballance: " + d.getBlnc());
                        frm.revalidate();
                        frm.repaint();
                    }
                } else {
                    JOptionPane.showMessageDialog(frm, "Your ranch is full");
                }
            }
        });
        goabuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p.anmlsite.size() < 12) {
                    if (busecon == 0) {
                        if (s.buyanm(d, p, c, 3) == false) {
                            JOptionPane.showMessageDialog(frm, "You dont have enough money stranger");
                        }
                        balancecon.setText("Ballance: " + d.getBlnc());
                        frm.revalidate();
                        frm.repaint();

                    } else {
                        if (s.selanm(d, p, AnmTpes.Goat) == false) {
                            JOptionPane.showMessageDialog(frm, "You dont have any Goats stranger");
                        }
                        balancecon.setText("Ballance: " + d.getBlnc());
                        frm.revalidate();
                        frm.repaint();
                    }
                } else {
                    JOptionPane.showMessageDialog(frm, "Your ranch is full");
                }
            }
        });
        cowbuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p.anmlsite.size() < 12) {
                    if (busecon == 0) {
                        if (s.buyanm(d, p, c, 1) == false) {
                            JOptionPane.showMessageDialog(frm, "You dont have enough money stranger");
                        }
                        balancecon.setText("Ballance: " + d.getBlnc());
                        frm.revalidate();
                        frm.repaint();

                    } else {
                        if (s.selanm(d, p, AnmTpes.Cow) == false) {
                            JOptionPane.showMessageDialog(frm, "You dont have any Cows stranger");
                        }
                        balancecon.setText("Ballance: " + d.getBlnc());
                        frm.revalidate();
                        frm.repaint();
                    }
                } else {
                    JOptionPane.showMessageDialog(frm, "Your ranch is full");
                }
            }
        });
        chibuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p.anmlsite.size() < 12) {
                    if (busecon == 0) {
                        if (s.buyanm(d, p, c, 2) == false) {
                            JOptionPane.showMessageDialog(frm, "You dont have enough money stranger");
                        }
                        balancecon.setText("Ballance: " + d.getBlnc());
                        frm.revalidate();
                        frm.repaint();

                    } else {
                        if (s.selanm(d, p, AnmTpes.Chicken) == false) {
                            JOptionPane.showMessageDialog(frm, "You dont have any Chiks stranger");
                        }
                        balancecon.setText("Ballance: " + d.getBlnc());
                        frm.revalidate();
                        frm.repaint();
                    }
                } else {
                    JOptionPane.showMessageDialog(frm, "Your ranch is full");
                }
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
                if (p.greenhouse.size() < 18) {
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
                } else {
                    JOptionPane.showMessageDialog(frm, "You cant plant more seeds your field is full");
                }

            }
        });
        plant2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int zs = 0;
                if (p.greenhouse.size() < 18) {
                    for (int i = 0; i < p.storagsed.size(); i++) {
                        if (p.storagsed.get(i).getType() == Sedype.CarrotSeeds) {
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
                        JOptionPane.showMessageDialog(frm, "You don have any Carrot seeds");
                    }
                } else {
                    JOptionPane.showMessageDialog(frm, "You cant plant more seeds your field is full");
                }

            }
        });
        plant3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int zs = 0;
                if (p.greenhouse.size() < 18) {
                    for (int i = 0; i < p.storagsed.size(); i++) {
                        if (p.storagsed.get(i).getType() == Sedype.SunflowerSeeds) {
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
                        JOptionPane.showMessageDialog(frm, "You don have any Sunflower seeds");
                    }
                } else {
                    JOptionPane.showMessageDialog(frm, "You cant plant more seeds your field is full");
                }

            }
        });
        plant4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int zs = 0;
                if (p.greenhouse.size() < 18) {
                    for (int i = 0; i < p.storagsed.size(); i++) {
                        if (p.storagsed.get(i).getType() == Sedype.PumkinSeeds) {
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
                        JOptionPane.showMessageDialog(frm, "You don have any Pumpkin seeds");
                    }
                } else {
                    JOptionPane.showMessageDialog(frm, "You cant plant more seeds your field is full");
                }

            }
        });
        payup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (d.getBlnc() >= 100000) {
                    JOptionPane.showMessageDialog(frm, "<html>Thank you for Playing my game<br>(and for paying my debts ;))</html>");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(frm, "Not Enough money, come back when you have full amount");
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
        makin.add(farmnma);
        makin.add(mail);

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
