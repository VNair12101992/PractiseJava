What will be the output of this program?

class A
{
	
}

class B extends A
{
	int i = 20;
}

public class MainClass
{
	public static void main(String[] args)
	{
		A a = new B();

		System.out.println(a.i);   //Compile time error 
	}
}

































10