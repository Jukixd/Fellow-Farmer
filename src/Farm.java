import java.util.ArrayList;
import java.util.Scanner;

// Class for a delclation of farm

public class Farm {
    private String nm;

    // arraylist for grown crops
    ArrayList<Flowers> flwsite = new ArrayList<>();

    // arraylist for crops that are growing
    ArrayList<Seeds> greenhouse = new ArrayList<>();

    //arraylist for animals you own
    ArrayList<Animals> anmlsite = new ArrayList<>();

    //arraylist for seeds you own
    ArrayList<Seeds> storagsed = new ArrayList<>();
    //arraylist for goodies your animals make
    ArrayList<Goods> godstoraq = new ArrayList<>();


    Scanner sc = new Scanner(System.in);


    // method for checking if some crops or animals produced something
    public void Farmchceck(Cycle d) {
        for (int i = greenhouse.size(); i  > 0; i--) {

            greenhouse.get(i-1).setGrwtim(greenhouse.get(i-1).getGrwtim()-1);

            if (greenhouse.get(i-1).getGrwtim()==0){

                if (greenhouse.get(i-1).getType()==Sedype.CornSeeds){
                    flwsite.add(new Flowers(flwType.Corn, 100));
                    greenhouse.remove(i-1);
                }
                else if (greenhouse.get(i-1).getType()==Sedype.CarrotSeeds){
                    flwsite.add(new Flowers(flwType.Carrot, 200));
                    greenhouse.remove(i-1);
                }
                else if (greenhouse.get(i-1).getType()==Sedype.SunflowerSeeds){
                    flwsite.add(new Flowers(flwType.Sunflower, 300));
                    greenhouse.remove(i-1);
                }
                else {
                    flwsite.add(new Flowers(flwType.Pumpkin, 1000));
                    greenhouse.remove(i-1);
                }
            }


        }
        for (int i = 0; i <anmlsite.size(); i++) {
            anmlsite.get(i).setPastime(anmlsite.get(i).getPastime()-1);
            if (anmlsite.get(i).getPastime() == 0) {
                if (anmlsite.get(i).getType().equals(AnmTpes.Chicken)) {
                    godstoraq.add(new Goods(Godies.Eggs, 20));
                    anmlsite.get(i).setPastime(3);
                } else if (anmlsite.get(i).getType().equals(AnmTpes.Cow)) {
                    godstoraq.add(new Goods(Godies.Milk, 20));
                    anmlsite.get(i).setPastime(4);
                } else if (anmlsite.get(i).getType().equals(AnmTpes.Goat)) {
                    godstoraq.add(new Goods(Godies.Cheese, 20));
                    anmlsite.get(i).setPastime(6);
                } else if (anmlsite.get(i).getType().equals(AnmTpes.Pig)) {
                    godstoraq.add(new Goods(Godies.Pork, 20));
                    anmlsite.get(i).setPastime(8);
                }


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
