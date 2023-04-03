public class shape_test{  
    public static void main( String args[]){
        Shape f1 = new Circle(10); 
        Shape f2 = new Square(8);  
        Circle c=(Circle)f1;
        Square s=(Square)f2;
        System.out.printf("the sum of areas of objects f1 and f2 : %.2f\n",f1.area()+f2.area());
        System.out.printf("radius of f1 : %d\n",c.getRadius());
        System.out.printf("side of f2 : %d\n",s.getSide());
      } 
}  
abstract class Shape{ 
    public abstract double area( );
}  
class Circle extends Shape{   
    private int radius; 
    public Circle(int radius){
        this.radius=radius;
    }
    public double area(){
        return radius*radius*Math.PI;
    }
    public int getRadius(){
        return radius;
    }
}      
class Square extends Shape{
    private int side;
    public Square(int side){
        this.side=side;
    }
     public double area(){
        return side*side;
    }
    public int getSide(){
        return side;
    }
}  