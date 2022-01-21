package classs;

/**
 * @author mingtu
 * @create 2022-01-16 10:32
 */
public class Dog {
    String name;
    int age;
    boolean marry;

    public  int num2=10;
    static  int num;

    private int weight;


    private  String hobby;


    public Dog(){
        System.out.println("这是一个二狗子");
    }

    public Dog(String name2){
        this.name=name2;
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public int getWeight(){
        return  this.weight;
    }


}
