package classs;

import java.util.Arrays;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mingtu
 * @create 2022-01-16 10:33
 */
public class ClassTest {
    static String s1;
    static boolean flag;

    static {
        int num9=20;
        String s3="abc";
    }


    public static void main(String [] args){
        Dog dog=new Dog();
        dog.age=10;
        dog.marry=false;
        dog.name="旺财";


        Dog.num=20;



        dog.setWeight(90);
        System.out.println("狗的名称为:"+dog.name+",狗的年龄为:"+dog.age+",数量为:"+Dog.num+",体重为:"+dog.getWeight());

        int num3=2147483647;
        System.out.println(num3);

        //byte长度是8位 short 16,int 32,long 64,float 32,double 64

        //基本数据类型:byte,short,int,long,float,double,boolean,char
        //引用数据类型String,Boolean,Short,Integer,Float,Character,Byte,Long,Integer
        System.out.println("基本类型：byte 二进制位数："+Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE="+Byte.MIN_VALUE);
        System.out.println("最小值：Byte.MIN_VALUE="+Byte.MAX_VALUE);


        System.out.println(s1);
        System.out.println(flag);

        //8进制
        int num4=011;
        System.out.println(num4);

        //16进制
        int num5=0x11;
        System.out.println(num5);

        //超出范围，则内存溢出
        int num6=128;
        byte b=(byte) num6;
        System.out.println(b);

        //内部局部变量声明时,由于没有默认值,要赋值初始值
        int num7;
        num7=8;
        System.out.println(num7);


        String s4="";
        if(s4 instanceof String){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        String color= "red";
        switch (color){
            case "green":
                System.out.println("当前颜色是绿色");
                break;
            case "black":
                System.out.println("当前颜色是黑色色");
                break;
            default:
                System.out.println("当前颜色是红色");

        }

        float f=11.4f;
        //取大的整数
        System.out.println(Math.ceil(f));
        //取小的整数
        System.out.println(Math.floor(f));
        //四舍五入
        System.out.println(Math.round(f));
        //绝对值
        System.out.println(Math.abs(f));
        //random() 方法用于返回一个随机数，随机数范围为 0.0 =< Math.random < 1.0
        System.out.println(Math.random());

        Integer integer = Integer.valueOf("12");
        System.out.println(integer);

        Integer x=2;
        System.out.println(x);

        //装箱
        Character character=new Character('a');
        System.out.println(character);
        System.out.println(Character.isLetter(5));

        //拆箱
        char[]chars={'a','b','c'};
        //for循环
        for (char aChar : chars) {
            System.out.println(aChar);
        }

        String str1="abc";
        System.out.println(str1.compareTo("ab"));

        StringBuffer sb=new StringBuffer(10);
        System.out.println("===:"+sb);

        StringBuffer sb2=new StringBuffer("ab");
        System.out.println("===:"+sb2);


        StringBuffer stringBuffer=new StringBuffer();
        //字符串中追加数据
        stringBuffer.append("aa");
        stringBuffer.append("bb");
        stringBuffer.append("cc");
        System.out.println(stringBuffer);

        //字符串中在指定位置删除元素
        stringBuffer.delete(2,3);
        System.out.println(stringBuffer);

        //在指定位置插入数据
        stringBuffer.insert(2,"d");
        System.out.println(stringBuffer);

        int[] nums={2,3,1,5};
        //取出数组最小的值
        int min=nums[0];
        //数组遍历查询
        for (int i = 1; i <nums.length; i++) {
            if(min>nums[i]){
                min=nums[i];
            }

        }
        System.out.println("数组中最小的值为:"+min);


        char[]chars1={'a','c'};
        String s=new String(chars1);
        System.out.println(s);

        //对数组进行升序排序
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);

        }

        //Date日期
         Date date=new Date();
         System.out.println("当前时间为:"+date);
         System.out.println(date.getTime());

         long l=3600*24*365*52*1000;
         System.out.println(l);
         Date date1=new Date(l);
         System.out.println(date1);

        boolean after = date.after(date1);
        System.out.println(after);

        int i = date1.compareTo(date);
        System.out.println(i);

        //正则表达式
        String s3="13a_bc";
        String regex="^\\d{3}[0-9A-z]*$";
        boolean matches = Pattern.matches(regex, s3);
        System.out.println(matches);

        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(s3);
        boolean flags = matcher.find();
        System.out.println(flags);

        //io


    }
}
