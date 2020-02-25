What will be the output of the below program?


class M
{
    int i=27;
 
    public M(int i=27)
    {
        this.i = i--;
		
    }
}
 
class N extends M
{
    public N(int i)
    {
		
        super(++i);
 
        System.out.println(i);
    }
	
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);
    }
}













27
















