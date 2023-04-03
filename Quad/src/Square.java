public class Square extends Quad{
    public Square(int a){
        super(a,a);
    }
    public int perimeter(){
        return 4 * width;
    }
}
