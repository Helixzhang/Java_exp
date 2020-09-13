package exp1;

import java.util.Scanner;

public class exp1_2 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int x = 0;
        for (int i = 0; i < str.length(); i++) {
            x += str.charAt(i) - '0';
        }
        System.out.println(x);
    }
}
