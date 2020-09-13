package exp3;

public class exp3_1 {
    public static class Rectangle{
        private double length,width;
        Rectangle(){}
        Rectangle(double length,double width){
            this.length = length;
            this.width = width;
        }

        public double getPerimeter(){
            return (this.length + this.width) * 2;
        }

        public double getArea(){
            return this.length * this.width;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setWidth(double width) { this.width = width; }

        public double getLength() {
            return this.length;
        }

        public double getWidth() {
            return this.width;
        }
    }

    public static class TestRectangle{
        public static void main(String[] args) {
            Rectangle rectangle_1 = new Rectangle();
            rectangle_1.setLength(4);  //exp3_2
            rectangle_1.setWidth(5);  //exp3_2
            System.out.println("rectangle_1长为："+rectangle_1.getLength());  //exp3_2
            System.out.println("rectangle_1宽为："+rectangle_1.getWidth());  //exp3_2
            System.out.println("rectangle_1周长为："+rectangle_1.getPerimeter());
            System.out.println("rectangle_1面积为"+rectangle_1.getArea());

            Rectangle rectangle_2 = new Rectangle(2,4);
            System.out.println("rectangle_2周长为"+rectangle_2.getPerimeter());
            System.out.println("rectangle_2面积为"+rectangle_2.getArea());
        }
    }
}
