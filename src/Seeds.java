public class Seeds {
    private String nm;
    private int prc;
    private int grwtim;

    public Seeds(String nm, int prc, int grwtim) {
        this.nm = nm;
        this.prc = prc;
        this.grwtim = grwtim;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
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


    @Override
    public String toString() {
        return "Seeds{" +
                "nm='" + nm + '\'' +
                ", prc=" + prc +
                ", grwtim=" + grwtim +
                '}';
    }
}
