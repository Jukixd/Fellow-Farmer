import java.util.ArrayList;
import java.util.Scanner;

public class Farm {
    private String nm;
    ArrayList<Flowers> flwsite = new ArrayList<>();
    ArrayList<Seeds> greenhouse = new ArrayList<>();
    ArrayList<Animals> anmlsite = new ArrayList<>();

    ArrayList<Seeds> storagsed = new ArrayList<>();
    ArrayList<Goods> godstoraq = new ArrayList<>();


    Scanner sc = new Scanner(System.in);

    public void Fmakin() {
        System.out.println("Choose name for your farm: ");
        setNm(sc.next());
    }

    public void Barn(){
        System.out.println("I own these Animals:");
    }

    public void Seeding(Cycle d) {
        if (storagsed.size() > 0) {
            if (greenhouse.size() < 5) {
                while (true) {
                    for (int i = 0; i < storagsed.size(); i++) {
                        System.out.println(i + 1 + ") " + storagsed.get(i));
                    }
                    int u = sc.nextInt();
                    if (0 < u && u <= storagsed.size()) {
                        storagsed.get(u).setDate(d.getCounter());
                        greenhouse.add(storagsed.get(u));
                        storagsed.remove(u);
                    }
                }
            } else {
                System.out.println("Not, enough size of Greenhouse");
            }

        } else {
            System.out.println("Not, enough seeds");
        }

    }


    public void Farmchceck(Cycle d) {
        for (int i = greenhouse.size(); i-1 >= 0; i++) {
            if (greenhouse.get(i).getDate() + greenhouse.get(i).getGrwtim() == d.getCounter()) {
                if (greenhouse.get(i).getType().equals(Sedype.CornSeeds)){
                    flwsite.add(new Flowers(flwType.Corn,50))     ;
                }
                else if (greenhouse.get(i).getType().equals(Sedype.CarrotSeeds)){
                    flwsite.add(new Flowers(flwType.Carrot,75))     ;
                }
                else if (greenhouse.get(i).getType().equals(Sedype.SunflowerSeeds)){
                    flwsite.add(new Flowers(flwType.Sunflower,100))     ;
                }
                else if (greenhouse.get(i).getType().equals(Sedype.PumkinSeeds)){
                    flwsite.add(new Flowers(flwType.Pumpkin,150))     ;
                }
                greenhouse.remove(i);
            }
        }
        for (int i = anmlsite.size(); i-1 >= 0; i++) {
           if (anmlsite.get(i).getBuytim()+anmlsite.get(i).getPastime()==d.getCounter()){
               if (anmlsite.get(i).getType().equals(AnmTpes.Chicken)){
                   godstoraq.add(new Goods(Godies.Eggs,20));
               }
               else if (anmlsite.get(i).getType().equals(AnmTpes.Cow)){
                   godstoraq.add(new Goods(Godies.Milk,20));
               }
               else if (anmlsite.get(i).getType().equals(AnmTpes.Goat)){
                   godstoraq.add(new Goods(Godies.Cheese,20));
               }
               else if (anmlsite.get(i).getType().equals(AnmTpes.Pig)){
                   godstoraq.add(new Goods(Godies.Pork,20));
               }
               anmlsite.get(i).setBuytim(d.getCounter());
           }

        }

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
