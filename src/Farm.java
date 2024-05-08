import java.util.ArrayList;
import java.util.Scanner;

public class Farm {
    private String nm;
    ArrayList<Greenhouse> flwsite = new ArrayList<>();
    ArrayList<Barn> anmlsite = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void Fmakin(){
        System.out.println("Zadejte jméno farmy: ");
        setNm(sc.next());
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "nm='" + nm + '\'' +
                ", flwsite=" + flwsite +
                ", anmlsite=" + anmlsite +
                '}';
    }
}
