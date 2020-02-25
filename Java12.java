What will be the output of the following program?

class X
{
    void method(int a)
    {
        System.out.println("ONE");
    }
     
    void method(double d)
    {
        System.out.println("TWO");
    }
}
 
class Y extends X
{
    @Override
    void method(double d)
    {
        System.out.println("THREE");
    }
	
	
}
 
public class MainClass 
{   
    public static void main(String[] args)
    {
        X x=new Y()
		x.method(100);
    }
}












One