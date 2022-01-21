package classs.ios.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author mingtu
 * @create 2022-01-16 22:17
 */
public class FileReaderDemo {
    public static void main(String [] args){
        String filepath="src\\classs\\ios\\file\\重要资料.txt";
        try {
            Reader reader=new FileReader(filepath);
            System.out.println(reader.read());
            char[] chars=new char[1024];
            int len=-1;
            while ((len=reader.read(chars))!=-1){
                System.out.println(new String(chars));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
