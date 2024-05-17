import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Player p1 = new Player();
        p1.Pmakin();
        System.out.println(p1);
        Farm fr = new Farm();
        Shop s = new Shop();
        Cycle d = new Cycle();
        s.shopmakin();

        for (int r =0;r<5;r++){
            fr.flwsite.add(new Flowers(flwType.Corn,50));
        }

        System.out.println(fr.flwsite);
        s.timetobuy(p1,fr,d);






    }
}