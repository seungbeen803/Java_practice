package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력 받기
        FileWriter fout = null; // 초기화
        int c;
        try {
            fout = new FileWriter("test.txt"); // 파일과 연결된 출력 문자
            while(true) {
                String line = scanner.nextLine();
                if(line.length() == 0) // 한 줄에 <Enter>키만 입력한 경우
                    break;
                fout.write(line, 0, line.length());
                fout.write("\r\n", 0, 2);
            }
            fout.close();
        }catch (IOException e) {
            System.out.println("입출력 오류");
        }
        scanner.close();
    }
}
