package IO연습;

import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7, 3, 4, 51, -1, 24};
        try{
            FileOutputStream fout = new FileOutputStream("test1.out");
            for(int i=0; i<b.length; i++)
                fout.write(b[i]);
            fout.close();
        }catch (IOException e){
            System.out.println("test1.out에 저장할 수 없었습니다. 경로명을 확인해주세요.");
            return;
        }
        System.out.println("test1.out을 저장하였습니다.");
    }
}
