import java.util.Scanner;

//class for defining a player
public class Player {
    private String nm;
    private int lvl;
    private int blnc;

    Scanner sc = new Scanner(System.in);


    public Player(String nm, int blnc) {
        this.nm = nm;
        this.blnc = blnc;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl() {
        this.lvl += 1;
        System.out.println("!!!You reached new level "+this.lvl+"!!!");

    }

    public int getBlnc() {
        return blnc;
    }

    public void setBlnc(int blnc) {
        this.blnc = blnc;
    }


}
