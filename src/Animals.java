public class Animals {
    private AnmTpes type;
    private int prc;
    private int buytim;
    private int pastime;

    public Animals(AnmTpes type, int prc, int pastime) {
        this.type = type;
        this.prc = prc;
        this.pastime = pastime;
    }

    public int getPrc() {
        return prc;
    }

    public void setPrc(int prc) {
        this.prc = prc;
    }

    public int getPastime() {
        return pastime;
    }

    public void setPastime(int pastime) {
        this.pastime = pastime;
    }

    public AnmTpes getType() {
        return type;
    }

    public void setType(AnmTpes type) {
        this.type = type;
    }

    public int getBuytim() {
        return buytim;
    }

    public void setBuytim(int buytim) {
        this.buytim = buytim;
    }

    @Override
    public String toString() {
        return type.name();
    }
}
