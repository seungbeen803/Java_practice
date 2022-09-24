package Exception;

import java.io.FileReader;
import java.io.FileWriter;

public class FlleExam {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("datar.txt");
            FileWriter fw = new FileWriter("datar.txt");
            int c;
            while((c = fr.read()) != -1) {
                fw.write(c);
            }
        }catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
