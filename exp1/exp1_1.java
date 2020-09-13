package exp1;

import java.util.Scanner;

public class exp1_1 {
    public static void main(final String[] args) {
        final char b = 't';
        System.out.println("请输入要加密的字符：");
        final var input = new Scanner(System.in);
        final String str = input.next();
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            final int temp = b ^ str.charAt(i);
            final char t = (char) temp;
            output += t;
        }
        System.out.println("加密结果为："+output);
    }
}
