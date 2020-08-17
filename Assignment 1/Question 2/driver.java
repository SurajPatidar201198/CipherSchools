import java.util.Scanner;
class Rectange
{
    int width;
    int height;
    Rectange(int width,int height)
    {
        this.width=width;
        this.height=height;
    }
    void display()
    {
        System.out.println(this.width+" "+this.height);
    }
}
class RectangleArea extends Rectange
{
    RectangleArea(int width,int height)
    {
        super(width, height);
    }
    void display()
    {
        super.display();
        System.out.println("Area is : "+this.height*this.width);
    }

}
class driver
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1=inp.nextInt();
        int n2=inp.nextInt();
        RectangleArea obj=new RectangleArea(n1, n2);
        obj.display();
    }
}
