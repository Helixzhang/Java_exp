package exp5;

import java.util.Arrays;
import java.util.Comparator;

public class exp5_1 {

    public static class AnonLam {
        public static void main(String[] args) {
            String[] direct = {"east", "west", "south", "north"};
            Sorter s = new Sorter();
//            {
//                public int compare(String a,String b){
//                    return a.compareTo(b);
//                //匿名写法
//                }
//            };
            for (String s2 : direct) {
                System.out.println(s2 + " ");
            }
            Arrays.sort(direct, (String a, String b) -> {
                return a.compareTo(b);
            });  //Lambda写法
            System.out.println();
            for (String s2 : direct) {
                System.out.println(s2 + " ");
            }
        }

        //        static class Sorter implements Comparator<String>{
//            public int compare(String a, String b){
//                return a.compareTo(b);  //匿名写法
//            }
//        }
        static class Sorter implements Comparator<String> {
            public int compare(String a, String b) {
                return 0;
            }
        }
    }
}
