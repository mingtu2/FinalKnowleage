package exceptions;

/**
 * @author mingtu
 * @create 2022-01-17 20:58
 */
public class ExceptionsDemo {
    public static void main(String [] args){
        System.out.println("Aa");
        int i=10;
        if(i<20){
            throw new SellException("库存不足");
        }
        System.out.println("Aaaa");

        try{
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :" + e);
            e.printStackTrace();
        }
        System.out.println("Out of the block");
    }
}
