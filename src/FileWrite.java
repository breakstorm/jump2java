import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws IOException {
//        FileOutputStream output = new FileOutputStream("out.txt");
//        FileWriter fw = new FileWriter("out.txt", true);
        PrintWriter pw = new PrintWriter(new FileWriter("out.txt", true));

        for(int i = 1; i < 11; i ++) {
//            String data = i +  " 번쨰  줄 입니다. \r\n";
//            output.write(data.getBytes());

//            String data = i + " 번째 줄 입니다.";
//            fw.write(data);

            String data = i + " 번째 줄 입니다.";
            pw.println(data);
        }

//        output.close();
//        fw.close();
        pw.close();
    }
}
