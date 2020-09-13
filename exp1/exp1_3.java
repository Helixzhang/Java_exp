package exp1;

import java.util.Scanner;

public class exp1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入头的数量：");
        int h = input.nextInt();
        System.out.println("请输入脚的数量：");
        int f = input.nextInt();
        int chicken = 0;
        int rabbit = h - chicken;
        while (chicken * 2 + (rabbit) * 4 != f) {
            chicken++;
            rabbit--;
        }

        System.out.println("鸡的数量为" + chicken + ",兔的数量为" + rabbit);
    }
}
