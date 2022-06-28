package IO연습;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputReaderStreamExam {
    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        try{
            while(true){
                int i = reader.read();
                if(i == -1)
                    break;
                char c = (char)i;
                System.out.print(c);
            }
        }catch (IOException e){
            System.out.println(e);
        }
        System.out.println();
    }
}
