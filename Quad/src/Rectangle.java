public class Rectangle extends Quad{
    public Rectangle(int width, int length){
        super(width, length);
    }
    public int perimeter(){
        return 2 * (width + length);
    }
}
