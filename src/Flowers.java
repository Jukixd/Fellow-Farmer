import java.lang.reflect.Type;
// class for definiton of Crops
public class Flowers {
    private flwType type;
    private int cost;

    public Flowers(flwType type, int cost) {
        this.type = type;
        this.cost = cost;
    }

    public flwType getType() {
        return type;
    }

    public void setType(flwType type) {
        this.type = type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return type.name()+" Selling price: "+cost;
    }
}
