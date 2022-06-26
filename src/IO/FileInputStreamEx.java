package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        byte b[] = new byte[6];
        try{
            FileInputStream fin = new FileInputStream("test.out");
            int n = 0;
            int c;
            while((c = fin.read())!=-1){
                b[n] = (byte)c;
                n++;
            }
            for(int i=0; i<b.length;i++)
                System.out.print(b[i] + " ");
            System.out.println();
            fin.close();
        }catch (IOException e){
            System.out.println("test.out에서 읽지 못했습니다. 경로명을 체크해보세요.");
            return;
        }
        System.out.println("test.out을 저장하였습니다.");
    }
}
