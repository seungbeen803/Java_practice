package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineFileExam {
    public static void main(String[] args) {
        String fname = "BufferInput.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(fname));
            String s = "";
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
