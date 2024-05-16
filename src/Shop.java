import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    Scanner sc = new Scanner(System.in);
    ArrayList<Seeds> seedsh = new ArrayList<>();
    ArrayList<Animals> goodssh = new ArrayList<>();


    public void shopmakin() {
        seedsh.add(new Seeds("Corn Seeds", 10, 2));
        seedsh.add(new Seeds("Corn Seeds", 10, 2));
        seedsh.add(new Seeds("Corn Seeds", 10, 2));
        seedsh.add(new Seeds("Corn Seeds", 10, 2));
        goodssh.add(new Animals(AnmTpes.Chicken, 200, 4));
        goodssh.add(new Animals(AnmTpes.Chicken, 200, 4));
        goodssh.add(new Animals(AnmTpes.Chicken, 200, 4));
        goodssh.add(new Animals(AnmTpes.Chicken, 200, 4));

    }

    public void buyinsed(Player s, Farm k, Seeds e) {
        if (s.getBlnc() > e.getPrc()) {
            s.setBlnc(s.getBlnc() - e.getPrc());
            k.storagsed.add(e);
            System.out.println("Good choice fella");
        } else {
            System.out.println("You got to have money stranger");
        }

    }

    public void buyinanm(Player s, Farm k, Animals e) {
        if (s.getBlnc() > e.getPrc()) {
            s.setBlnc(s.getBlnc() - e.getPrc());
            k.anmlsite.add(e);
            System.out.println("Good choice fella");
        } else {
            System.out.println("You got to have money stranger");
        }


    }


    public void timetobuy(Player s, Farm e) {
        System.out.println("You Need some good stranger");
        while (true) {
            System.out.println("1) Buy");
            System.out.println("2) Sell");
            System.out.println(s.getBlnc());
            String i = sc.next();


            if (i.equals("1")) {
                while (true) {
                    System.out.println("What ya Buyin Stranger?");
                    System.out.println("1) Seeds");
                    System.out.println("2) Animals");
                    System.out.println(" ");
                    System.out.println("3) Exit");
                    String p = sc.next();
                    if (p.equals("1")) {
                        for (int b = 0; b < seedsh.size(); b++) {
                            System.out.println(b + 1 + ") " + seedsh.get(b));
                        }
                        String r = sc.next();
                        if (r.equals("1")) {
                            buyinsed(s, e, seedsh.get(0));
                            break;
                        } else if (r.equals("2")) {
                            buyinsed(s, e, seedsh.get(1));
                            break;
                        } else if (r.equals("3")) {
                            buyinsed(s, e, seedsh.get(2));
                            break;
                        } else if (r.equals("4")) {
                            buyinsed(s, e, seedsh.get(3));
                            break;
                        } else {
                            System.out.println("Need somethin else???");
                            break;
                        }
                    } else if (p.equals("2")) {
                        for (int b = 0; b < goodssh.size(); b++) {
                            System.out.println(b + 1 + ") " + goodssh.get(b));
                        }
                        String r = sc.next();
                        if (r.equals("1")) {
                            buyinanm(s, e, goodssh.get(0));
                            break;
                        } else if (r.equals("2")) {
                            buyinanm(s, e, goodssh.get(1));
                            break;
                        } else if (r.equals("3")) {
                            buyinanm(s, e, goodssh.get(2));
                            break;
                        } else if (r.equals("4")) {
                            buyinanm(s, e, goodssh.get(3));
                            break;
                        } else {
                            System.out.println("Need somethin else???");
                            break;
                        }


                    } else {
                        System.out.println("Not an option stranger");
                        break;
                    }
                }


            } else if (i.equals("2")) {
                while (true) {
                    System.out.println("What ya sellin?");
                    System.out.println("1) Flowers");
                    System.out.println("2) Goods");
                    System.out.println("3) Animals");
                    String p = sc.next();
                    if (p.equals("1")) {
                        if (e.flwsite.size()>0){
                            for (int j = 0; j < e.flwsite.size(); j++) {
                                s.setBlnc(s.getBlnc() + e.flwsite.get(j).getCost());
                            }
                        for (int j = e.flwsite.size(); j - 1 >= 0; j--) {
                            e.flwsite.remove(j - 1);
                        }

                        System.out.println("Nice Flowers you have");
                        break;
                        }else {
                            System.out.println("You don have any flowers yet stranger");
                        }
                    } else if (p.equals("2")) {
                        if (e.godstoraq.size()>0) {
                            for (int j = 0; j < e.godstoraq.size(); j++) {
                                s.setBlnc(s.getBlnc() + e.godstoraq.get(j).getCost());
                            }
                            for (int j = e.godstoraq.size(); j - 1 >= 0; j--) {
                                e.godstoraq.remove(j - 1);
                            }
                            System.out.println("Yeahhh Goodies");
                            break;
                        }else {
                            System.out.println("Yep, you dont have goodies");
                        }

                    } else if (p.equals("3")) {
                        if (e.anmlsite.size() > 0) {
                            for (int j = 0; j < e.anmlsite.size(); j++) {
                                System.out.println(j + ") " + e.anmlsite.get(j));
                            }
                            int g = sc.nextInt();
                            if (g <= e.anmlsite.size()) {
                                s.setBlnc(s.getBlnc() + e.anmlsite.get(g).getPrc() / 2);
                                e.anmlsite.remove(g);
                                System.out.println("Don worry i will take care of this guy");
                                break;
                            } else {
                                System.out.println("Not an option stranger");
                                break;
                            }
                        } else {
                            System.out.println("Oh but you don have animals");
                        }

                    } else {
                        System.out.println("Not an option stranger");
                        break;
                    }
                }

            } else if (i.equals("3")) {
                System.out.println("See ya later Stranger");
                break;
            } else {
                System.out.println("Not an option stranger");
            }
        }


    }

}
