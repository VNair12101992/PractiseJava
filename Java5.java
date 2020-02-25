
Output of the following code

public class A

{
	
    public A()
    {
        
		System.out.println(1);
		super();
        System.out.println(2);
    }
	
	
	public static void main(String[] args){
		
		new A();
	}
}


























Constructor calling statements ( super() or this() ), if written, must be the first statements in the constructor.Correct Code…


public class A
{
    public A()
    {
        super();         
 
        System.out.println(1);
 
        System.out.println(2);
    }
}