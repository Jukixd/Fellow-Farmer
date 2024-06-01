//class for  definition of seeds
public class Seeds {
    private Sedype type;
    private int prc;
    private int grwtim;

    private int date;



    public Seeds(Sedype type, int prc, int grwtim) {
        this.type = type;
        this.prc = prc;
        this.grwtim = grwtim;
    }

    public Sedype getType() {
        return type;
    }

    public void setType(Sedype type) {
        this.type = type;
    }

    public int getPrc() {
        return prc;
    }

    public void setPrc(int prc) {
        this.prc = prc;
    }

    public int getGrwtim() {
        return grwtim;
    }

    public void setGrwtim(int grwtim) {
        this.grwtim = grwtim;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return type.name();
    }
}
