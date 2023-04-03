public class Shape_test {
    public static void main(String[] args){
        Shape f1 = new Circle(10);
        Shape f2 = new Square(8);
        Circle c = (Circle)f1;
        Square s = (Square)f2;
        System.out.printf("The sum of areas of f1 and f2 is %.2f\n", f1.area()+f2.area());
        System.out.printf("The radius of f1 is %d, and side of f2 is %d\n", c.getRadius(), s.getSide());
    }
}

abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    
    public double area(){
        return radius * radius * Math.PI;
    }
    
}

class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    
    public double area(){
        return side * side;
    }
}