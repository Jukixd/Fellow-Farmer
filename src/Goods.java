import java.util.ArrayList;

public class Goods {
    private Godies type;
    private int cost;

    public Goods(Godies type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    public Godies getType() {
        return type;
    }

    public void setType(Godies type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
