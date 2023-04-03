public class Quad{
    protected int width;
    protected int length;
    public Quad(int width ,int length){
        this.width = width;
        this.length = length;
    }
    public int area(){
        return width * length;
    }
}