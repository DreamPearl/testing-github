import java.util.Scanner;
class calc
{
	
	public static void main(String args[])
	{
		int x,y,z;
		System.out.println("enter the two numbers");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=x+y;
		System.out.println(z);
	}
}
