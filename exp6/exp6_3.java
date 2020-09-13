package exp6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exp6_3 {
    public static void main(String[] args) {
        List<String> arraylist = new ArrayList<>();
        arraylist.add("Abc");
        arraylist.add("Bef");
        arraylist.add("Test");
        for (int i=0;i<arraylist.size();i++){  //索引循环遍历
            System.out.println(arraylist.get(i));
        }
        System.out.println();
        Iterator iterator = arraylist.iterator();
        while(iterator.hasNext()){  //Iterator遍历
            System.out.println(iterator.next());
        }
        System.out.println();
        for (int i=0;i<arraylist.size();i++){  //索引循环遍历
            System.out.println(arraylist.get(i).toUpperCase());  //大写转换
        }
    }
}
