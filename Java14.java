Why the below code is showing compile time error?


interface X
{
    void methodX();
}
 
class Y implements X
{
    void methodX()
    {
        System.out.println("Method X");
    }
}


























Interface methods must be implemented as public. Because, interface methods are public by default and you should not reduce the visibility of any methods while overriding.