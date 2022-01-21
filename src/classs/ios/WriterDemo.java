package classs.ios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author mingtu
 * @create 2022-01-16 22:20
 */
public class WriterDemo {
    public static void main(String [] args){
        String filepath="src\\classs\\ios\\file\\重要资料2.txt";
        try {
            Writer writer=new FileWriter(filepath,true);
            writer.write("勿以善小而不为");
            writer.write("勿以恶小而为之");
            writer.write("\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
