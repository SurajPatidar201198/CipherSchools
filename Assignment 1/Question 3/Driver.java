
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Employee
{
    int empID;
    String empName;
    String empDesignation;
    int empSalary;
    String empLocation;
    List<String>a1=new ArrayList<String>();
    List<Integer>a2=new ArrayList<Integer>();
    List<String>a3=new ArrayList<String>();
    List<String>a4=new ArrayList<String>();
    Employee()
    {
        Scanner inp = new Scanner(System.in);
        this.empID = inp.nextInt();
        this.empName = inp.nextLine();
        this.empDesignation = inp.nextLine();
        this.empSalary=inp.nextInt();
        this.empLocation = inp.nextLine();
        System.out.println("JJ");
        a1.add(this.empName);
        if(this.empSalary >50000)
        {
            a2.add(this.empSalary);
        }
        if(this.empLocation.charAt(0)=='M')
        {
            a3.add(this.empLocation);
        }
        if(this.empDesignation.endsWith("E"))
        {
            a4.add(this.empDesignation);
        }
    }
    void getters()
    {
        for(int i=0;i<a3.size();i++)
        {
            System.out.println(a3.get(i));
        }
    }
}
public class Driver
{
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.getters();
    }
}