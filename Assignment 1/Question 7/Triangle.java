public class Triangle
{
    double area(int a,int b,int c)
    {
        int s=a+b+c;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        int a=3;
        int b=4;
        int c=4;
        System.out.println(obj.area(a, b, c));
    }
}