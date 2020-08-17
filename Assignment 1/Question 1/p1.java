@FunctionalInterface
interface Addition
{
    public void add(int a,int b);
};
@FunctionalInterface
interface Multiplication
{
    public void product(int a,int b);
}
@FunctionalInterface
interface Difference
{
    public void difference(int a,int b);
}
@FunctionalInterface
interface Division
{
    public void safeDivision(int a,int b);
}
public class p1
{
    public static void main(String[] args) {
        Addition a1 = (a,b)->{
            System.out.println("Addition is : "+(a+b));
        };
        a1.add(3, 4);
        Difference d1 = (a,b)->{
            System.out.println("Difference is :"+(a-b));
        };
        d1.difference(2, 3);
        Multiplication m1 = (a,b)->{
            System.out.println("Product is :"+(a*b));
        };
        m1.product(3, 2);
        Division div1=(a,b)->{
            System.out.println("Division is :"+(a/b));
        };
        div1.safeDivision(4, 2);
    }
};