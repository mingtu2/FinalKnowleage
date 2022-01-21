package classs.ios;

import java.io.*;

/**
 * @author mingtu
 * @create 2022-01-16 21:02
 */
public class InputStreamDemo {
    public static void main(String [] args){
        String filepath="src\\classs\\ios\\file\\重要资料.txt";
        File file=new File(filepath);
        if(file.exists()){
            System.out.println("当前文件是存在的");
            System.out.println("文件名为:"+file.getName());
            System.out.println("文件相对路径:"+file.getPath());
            System.out.println("文件的绝对路径:"+file.getAbsolutePath());
            System.out.println("文件字节的大小:"+file.length());
        }

        if(file.isDirectory()){
            System.out.println("是一个目录");
        }else if(file.isFile()){
            System.out.println("是一个文件");
        }else{
            System.out.println("啥也不是");
        }

        System.out.println("==========");
        String filepath2="src\\classs\\ios\\file";
        File file2=new File(filepath2);
        String[] list = file2.list();
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("==========");
        File[] listFiles = file2.listFiles();
        for (File listFile : listFiles) {
            System.out.println(listFile);
        }

        System.out.println("==========当目录存在且文件不存在时，为true");
        String filepath3="src\\classs\\ios\\file\\c";
        File file3=new File(filepath3);
        boolean mkdir = file3.mkdir();
        System.out.println(mkdir);

        System.out.println("==========mkdir 当文件已存在时，报错");
        String filepath4="src\\classs\\ios\\file2\\d";
        File file4=new File(filepath4);
        boolean mkdir4 = file4.mkdir();
        System.out.println(mkdir4);

        System.out.println("==========mkdir 当目录不存在时报错");
        String filepath5="src\\classs\\ios\\file2\\d";
        File file5=new File(filepath5);
        boolean mkdir5 = file5.mkdir();
        System.out.println(mkdir5);

        System.out.println("==========mkdirs 当目录不存在时也可以创建");
        String filepath6="src\\classs\\ios\\file2\\d";
        File file6=new File(filepath6);
        boolean mkdir6 = file6.mkdirs();
        System.out.println(mkdir6);

        System.out.println("==========mkdirs 当目录不存在时.且文件存在时，报错");
        String filepath7="src\\classs\\ios\\file2\\d";
        File file7=new File(filepath7);
        boolean mkdir7= file7.mkdirs();
        System.out.println(mkdir7);



        try {
            //读取文件,字节输入流
           // String filepath9="aa";
            InputStream inputStream=new FileInputStream(filepath);
            int read = inputStream.read();
            System.out.println(read);

            byte[] bytes=new byte[1024];
            int len=-1;
            while ((len=inputStream.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }



            //字节输出流
            String filepath10="src\\classs\\ios\\file\\out.txt";
            OutputStream outputStream=new FileOutputStream(filepath10,true);
            outputStream.write(88);
            outputStream.write("没有错".getBytes());

            outputStream.close();





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
