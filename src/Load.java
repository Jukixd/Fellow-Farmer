import java.io.*;
import java.util.ArrayList;


public class Load {

    private String path = "dat";
    private ArrayList<String> sl = new ArrayList<>();

    BufferedReader br;
    FileWriter fw;

    {
        try {
            fw = new FileWriter(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    BufferedWriter wr = new BufferedWriter(fw);

    {
        try {
            br = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void data() {
        String s;
        while (true) {
            try {
                s = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            sl.add(s);
            if (s == null) {
                break;

            }
        }
    }

    public void save(Farm f, Player d, Cycle c) {
        System.out.println(sl.size());


        try {
            for (String line : sl) {
                wr.write(line);
                wr.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
