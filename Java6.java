Output of the below code


public class A
{
	int i;
	
	
    public A(int i)
    {
		A();
		this.i=i;
		System.out.println(i);
    }
	
	
}
 
class B 
{
	public B(){
		
		System.out.println(10);
	}
}



class C {
	public static void main(String[] s){
			
			B b=new B();
		
	}
	
}
	


























public class A
{
    public A()
    {
        //Either keep this constructor
    }
 
    public A(int i)
    {
 
    }
}
 
class B extends A
{
    public B()
    {
        super(10);   //or else write this statement
		syso(10);
    }
}