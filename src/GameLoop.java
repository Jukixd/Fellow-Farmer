import com.sun.source.tree.DoWhileLoopTree;

import java.util.Scanner;

public class GameLoop {

    Scanner sc = new Scanner(System.in);
    Player p1 = new Player();
    Farm fr = new Farm();
    Shop s = new Shop();
    Cycle d = new Cycle();

    Scanner sc =new Scanner(System.in);


    public void Start(){
        fr.Fmakin();
        p1.Pmakin();
        s.shopmakin();
        d.Firstday();

        while(true){
            System.out.println("1) Character info");
            System.out.println("2) Barn");
            System.out.println("3) Greenhouse");
            System.out.println("4) Shop");
            System.out.println(" ");
            System.out.println("5) Exit");



        }


    }



}
