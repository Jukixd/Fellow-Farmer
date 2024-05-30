import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    Scanner sc = new Scanner(System.in);
    ArrayList<Seeds> seedsh = new ArrayList<>();
    ArrayList<Animals> goodssh = new ArrayList<>();


    public void shopmakin() {
        seedsh.add(new Seeds(Sedype.CornSeeds, 50, 2));
        seedsh.add(new Seeds(Sedype.CarrotSeeds, 100, 5));
        seedsh.add(new Seeds(Sedype.SunflowerSeeds, 150, 6));
        seedsh.add(new Seeds(Sedype.PumkinSeeds, 250, 10));
        goodssh.add(new Animals(AnmTpes.Chicken, 200, 3));
        goodssh.add(new Animals(AnmTpes.Cow, 400, 4));
        goodssh.add(new Animals(AnmTpes.Goat, 600, 6));
        goodssh.add(new Animals(AnmTpes.Pig, 1000, 7));

    }

    public void buyinsed(Player s, Farm k, Seeds e, Cycle d) {
        if (s.getBlnc() > e.getPrc()) {
            s.setBlnc(s.getBlnc() - e.getPrc());
            e.setDate(d.getCounter());
            k.storagsed.add(e);
            System.out.println("Good choice fella");
        } else {
            System.out.println("You got to have money stranger");
        }

    }

    public boolean buyanm(Player s, Farm k,Cycle d,int a) {
        if (a==1) {
            if (s.getBlnc() > 400) {
                s.setBlnc(s.getBlnc() - 400);
                k.anmlsite.add(new Animals(AnmTpes.Cow, 400, 40));
                return true;
            } else {
                return false;
            }
        }
        else if (a==2){
            if (s.getBlnc() > 200) {
                s.setBlnc(s.getBlnc() - 200);
                k.anmlsite.add(new Animals(AnmTpes.Chicken, 200, 40));
                return true;
            } else {
                return false;
            }
        }
        else if (a==3){
            if (s.getBlnc() > 600) {
                s.setBlnc(s.getBlnc() - 600);
                k.anmlsite.add(new Animals(AnmTpes.Goat, 600, 40));
                return true;
            } else {
                return false;
            }
        }
        else if (a==4){
            if (s.getBlnc() > 1000) {
                s.setBlnc(s.getBlnc() - 1000);
                k.anmlsite.add(new Animals(AnmTpes.Pig, 1000, 40));
                return true;
            } else {
                return false;
            }
        }
        return false;
    }




}
