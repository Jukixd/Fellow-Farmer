public class Animals {
    private AnmTpes type;
    private int prc;

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

    @Override
    public String toString() {
        return "Animals{" +
                "nm='" + type + '\'' +
                ", prc=" + prc +
                ", pastime=" + pastime +
                '}';
    }
}
