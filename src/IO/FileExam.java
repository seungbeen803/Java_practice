package IO;


import java.io.FileReader;
import java.io.FileWriter;

public class FileExam {
    public static void main(String[] args) {
        char buffer[] = new char[100];
        try{
            FileReader fr = new FileReader("datar.txt");
            FileWriter fw = new FileWriter("dataw.txt");
            fr.read();
            fw.write(buffer, 0, 100);
            fw.flush();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
