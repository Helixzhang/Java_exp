package exp2;

public class exp2_1 {
    public static class Triangle{
        double a,b,c;

        public void setA(double a) {
            this.a = a;
        }

        public void setB(double b) {
            this.b = b;
        }

        public void setC(double c) {
            this.c = c;
        }

        public boolean isTriangle(){
            return (this.a + this.b > this.c) & (this.a + this.c > this.b);
        }

        public double area() {
            double s = (this.a + this.b + this.c)/2;
            return Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }

        public double perimeter(){
            if (isTriangle()) return this.a + this.b + this.c;
            return 0;
        }
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle();
        tri.setA(3);
        tri.setB(4);
        tri.setC(5);
        System.out.println(tri.isTriangle());
        System.out.println("三角形面积为"+tri.area());
        System.out.println("三角形周长为"+tri.perimeter());
    }
}
