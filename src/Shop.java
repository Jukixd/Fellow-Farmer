import java.util.ArrayList;
import java.util.Scanner;

//class for definition of a shop

public class Shop {


    //method for Player to buy seeds
    public boolean buysed(Player s, Farm k, int a, Cycle d) {
        if (a == 1) {
            if (s.getBlnc() >= 150) {
                s.setBlnc(s.getBlnc() - 150);
                k.storagsed.add(new Seeds(Sedype.SunflowerSeeds, 150, 6));
                return true;
            } else {
                return false;
            }

        } else if (a == 2) {
            if (s.getBlnc() >= 50) {
                s.setBlnc(s.getBlnc() - 50);
                k.storagsed.add(new Seeds(Sedype.CornSeeds, 50, 3));
                return true;
            } else {
                return false;
            }

        } else if (a == 3) {
            if (s.getBlnc() >= 100) {
                s.setBlnc(s.getBlnc() - 100);
                k.storagsed.add(new Seeds(Sedype.CarrotSeeds, 100, 5));
                return true;
            } else {
                return false;
            }

        } else if (a == 4) {
            if (s.getBlnc() >= 250) {
                s.setBlnc(s.getBlnc() - 250);
                k.storagsed.add(new Seeds(Sedype.PumkinSeeds, 250, 10));
                return true;
            } else {
                return false;
            }

        }
        return false;

    }

    //class for player to buy an animal
    public boolean buyanm(Player s, Farm k, Cycle d, int a) {
        if (a == 1) {
            if (s.getBlnc() >= 400) {
                s.setBlnc(s.getBlnc() - 400);
                k.anmlsite.add(new Animals(AnmTpes.Cow, 400, 4));
                return true;
            } else {
                return false;
            }
        } else if (a == 2) {
            if (s.getBlnc() >= 200) {
                s.setBlnc(s.getBlnc() - 200);
                k.anmlsite.add(new Animals(AnmTpes.Chicken, 200, 3));
                return true;
            } else {
                return false;
            }
        } else if (a == 3) {
            if (s.getBlnc() >= 600) {
                s.setBlnc(s.getBlnc() - 600);
                k.anmlsite.add(new Animals(AnmTpes.Goat, 600, 6));
                return true;
            } else {
                return false;
            }
        } else if (a == 4) {
            if (s.getBlnc() >= 1000) {
                s.setBlnc(s.getBlnc() - 1000);
                k.anmlsite.add(new Animals(AnmTpes.Pig, 1000, 8));
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    //class for player to sell an animal
    public boolean selanm(Player m, Farm f, AnmTpes a) {
        if (f.anmlsite.size() > 0) {
            for (int i = f.anmlsite.size(); i > 0; i--) {
                if (f.anmlsite.get(i-1).getType() == a) {

                        m.setBlnc(m.getBlnc() + (f.anmlsite.get(i-1).getPrc() / 2));
                        f.anmlsite.remove(i-1);
                        return true;
                }
            }


        }
        return false;
    }
}
