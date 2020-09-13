package exp6;

public class exp6_2 {
    /*接口是更为抽象的抽象，强行规定该类下的方法的关键词为public abstract（即默认修饰符）*/
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.climb();
        duck.fly();
        duck.swim();

    }

    interface Swimmable {
        void swim();
    }

    interface Flyable {
        void fly();
    }

    interface FlyClimbable extends Flyable {
        void climb();
    }

    public static class Duck implements Swimmable, FlyClimbable {
        @Override
        public void climb() {
            System.out.println("鸭子可以爬着上树");
        }

        @Override
        public void fly() {
            System.out.println("鸭子可以飞");
        }

        @Override
        public void swim() {
            System.out.println("鸭子可以游泳");
        }


    }
}
