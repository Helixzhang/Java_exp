package exp6;

public class exp6_1 {
    /*抽象类是具有抽象方法的类，抽象的关键词为abstract，
    抽象方法的特性是本身只有方法名和方法类型，没有方法体，本身不产生作用，但继承的子类必须实现该方法*/
    public static void main(String[] args) {
        Square square = new Square("s1", 20);
        System.out.println("The Area Of Square is " + square.gerArea());
        System.out.println("The Perimeter Of Square is " + square.getPerimeter() + "\n");

        Circle circle = new Circle("c1", 4);
        System.out.println("The Area Of Circle is " + circle.gerArea());
        System.out.println("The Perimeter Of Circle is " + circle.getPerimeter() + "\n");
    }

    public static abstract class Shape {
        private String name;  //Shape名称

        public Shape() {
        }

        public Shape(String name) {
            this.name = name;
        }

        public abstract double getPerimeter();

        public abstract double gerArea();
    }

    public static class Square extends Shape {

        private double Side_Length;

        public Square() {
            super();
        }

        public Square(String name, double Side_Length) {
            super(name);
            this.Side_Length = Side_Length;
        }

        @Override
        public double getPerimeter() {
            return Side_Length * 4;
        }

        @Override
        public double gerArea() {
            return Side_Length * Side_Length;
        }
    }

    public static class Circle extends Shape {
        private double radius;

        public Circle() {
            super();
        }

        public Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * 3.14 * radius;
        }

        @Override
        public double gerArea() {
            return 3.14 * radius * radius;
        }
    }
}
