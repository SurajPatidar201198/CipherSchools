import java.util.*;
public class Generic {
	void fun(int num)
	{
		System.out.println((2*num)/3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic obj=new Generic();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		try {
		int n=sc.nextInt();
		obj.fun(n);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter only number ");
		}
	}

}