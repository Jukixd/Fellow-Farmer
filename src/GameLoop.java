import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;

public class GameLoop {

    Scanner sc = new Scanner(System.in);
    Player p1 = new Player();
    Farm fr = new Farm();
    Shop s = new Shop();
    Cycle d = new Cycle();


    public void Start() {
        fr.Fmakin();
        p1.Pmakin();
        s.shopmakin();
        d.Firstday();
        while (true) {

            while (true) {
                System.out.println(d);
                System.out.println("1) Character info");
                System.out.println("2) Barn");
                System.out.println("3) Greenhouse");
                System.out.println("4) Seed Storage");
                System.out.println("5) Silo");
                System.out.println("6) Shop");
                System.out.println("7) Sleep");
                System.out.println(" ");
                System.out.println("8) Exit");
                String j = sc.next();


                if (j.equals("1")) {
                    System.out.println(p1);
                    String s = sc.next();


                } else if (j.equals("2")) {
                    fr.Barn(d);
                    String s = sc.next();


                } else if (j.equals("3")) {
                    fr.Greenhouse(d);
                    String s = sc.next();


                } else if (j.equals("4")) {
                    fr.seedstorag(d);
                    fr.Seeding(d);
                    String s = sc.next();


                } else if (j.equals("5")) {
                    fr.Storage();
                    String s = sc.next();


                } else if (j.equals("6")) {
                    s.timetobuy(p1, fr, d);
                    String s = sc.next();


                } else if (j.equals("7")) {
                    System.out.println("Zzzzzzz");
                    break;


                } else if (j.equals("8")) {
                    System.out.println("See ya later");
                    System.exit(0);


                } else {
                    System.out.println("Not an option");
                }


            }
            d.procceedday(d);
        }


    }


}
