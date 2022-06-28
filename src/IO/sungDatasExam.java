package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class sungDatasExam {
    public void readingData(String fname) throws IOException{
        try{
            BufferedReader br = new BufferedReader(new FileReader(fname));
            String csvStr = "";
            String tmpStr = "";
            do{
                tmpStr = br.readLine();
                if(tmpStr != null) {
                    csvStr += tmpStr + "\t";
                }
            }while(tmpStr != null);
            StringTokenizer parse = new StringTokenizer(csvStr, "\t");
            int length = parse.countTokens() / 4;
            String[] name = new String[length];
            String[] address = new String[length];
            double[] math = new double[length];
            double[] english = new double[length];
            double[] total = new double[length];
            double[] avg = new double[length];
            for(int i=0; i<length; i++){
                name[i] = parse.nextToken();
                address[i] = parse.nextToken();
                math[i] = Double.valueOf(parse.nextToken()).doubleValue();
                english[i] = Double.valueOf(parse.nextToken()).doubleValue();
                total[i] = math[i] + english[i];
                avg[i] = total[i] / 2.0;
            }
            for(int i=0; i<length; i++){
                System.out.println(name[i] + "\t" + address[i] + "\t" + math[i] + "\t" + english[i] + "\t" + total[i] + "\t" + avg[i]);
            }
        }catch (FileNotFoundException e){
            System.out.println("잘못된 파일 이름을 입력했습니다.");
        }
    }
}

class  sungDatasMain{
    public static void main(String[] args) {
        sungDatasExam wd = new sungDatasExam();
        try{
            wd.readingData("writed.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
