Output:

interface A
{
   public static final  int i = 111;
}
 
class B implements A 
{
    void methodB()
    {
        i = i++ + i--;
		
		System.out.println(i);
    }
	
	public static void main(String[] args)
	{
		B b=new B();
		b.methodB();
	
	}
}

























No, because interface fields are static and final by default and you can’t change their value once they are initialized. In the above code, methodB() is changing value of interface field A.i. It shows compile time error.