package exp2;

public class exp2_2 {
    public static class Circle{
        double centerX,centerY,radius;
        static double PI = 3.1415926;

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double getArea(){
            return PI*this.radius*this.radius;
        }
        public static double getArea(double radius){
            return PI*radius*radius;
        }
    }

    public static class TestCircle{
        public static void main(String[] args) {
            Circle circle = new Circle();
            circle.setRadius(10);
            System.out.println("circle的面积是"+circle.getArea());
            System.out.println("Circle的面积是"+Circle.getArea(20));

            Circle c = new Circle();
            System.out.println(c.PI);
            System.out.println(Circle.PI);

            Circle.PI = 3.14;
            System.out.println(c.PI);
            System.out.println(Circle.PI);
        }
    }
}
