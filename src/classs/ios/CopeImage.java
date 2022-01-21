package classs.ios;

import java.io.*;

/**
 * @author mingtu
 * @create 2022-01-16 22:08
 */
public class CopeImage {
    public static void main(String [] args){
        String filepath="src\\classs\\ios\\file\\1.jpg";
        String filepath2="src\\classs\\ios\\file\\2.jpg";
        try {
            InputStream inputStream=new FileInputStream(filepath);
            OutputStream outputStream=new FileOutputStream(filepath2);

            int len=-1;
            byte [] bytes=new byte[1024];
            while ((len=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
            }
            outputStream.close();
            inputStream.close();
            System.out.println("文件复制成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
