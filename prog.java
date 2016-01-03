import java.util.Scanner;
class calc
{
	static int c;
	static void sum(int a,int b)
	{  
        c=a+b;
        System.out.println(c);
	}
	public static void main(String args[])
	{
		int x,y;
		System.out.println("enter the two numbers");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		sum(x,y);
	}
}
