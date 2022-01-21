package normal;

import classs.Dog;

import java.util.*;

/**
 * @author mingtu
 * @create 2022-01-16 11:52
 */
public class Test
{
    public static void main(String [] args){
        Dog dog=new Dog();
        dog.num2=40;

        String str="abc";
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());

        List list=new ArrayList();

        Map map=new HashMap();
        map.put("name","zhangsan");
        map.remove("name");
        map.keySet();
        map.containsKey("age");
        map.containsValue("zhangsan");
        map.clear();
        map.values();
        map.isEmpty();
        map.size();
        map.replace("name",111);
        map.put(null,null);
        map.put(null,11);

        Map map1=new Hashtable();
        map1.put(null,null);
        System.out.println(map1);

        List list1=new ArrayList();


        int [] nums={1,2};
        List<int[]> ints = Arrays.asList(nums);
        Object[] objects = list.toArray();

        System.out.println("git测试");
        System.out.println("testts更新代码");



    }
}
