import java.util.Scanner;

public class Player {
    private String nm;
    private int lvl;
    private int exp;
    private int blnc;

    Scanner sc = new Scanner(System.in);

    public void Pmakin(){
        System.out.println("Zadejte jméno Farmáře:");
        setNm(sc.next());
        lvl = 1;
        setExp(0);
        setBlnc(500);
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
        System.out.println("!!!Dosáhl jsi nového Levlu "+this.lvl+"!!!");

    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        int nwexp = this.exp+exp;
        if (nwexp>50*lvl){
            this.exp = nwexp-(50*lvl);
            setLvl();
            setExp(0);
        }
        else {
            this.exp = nwexp;
        }

    }

    public int getBlnc() {
        return blnc;
    }

    public void setBlnc(int blnc) {
        this.blnc = blnc;
    }

    @Override
    public String toString() {
        return "--- Level: "+lvl+" --- ("+exp+"/"+lvl*50+")\n"+" Jméno: "+nm+"\n"+" Level: "+lvl+"\n"+"Balanc: "+blnc+" Kč";
    }
}
