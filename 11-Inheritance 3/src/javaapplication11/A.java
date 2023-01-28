package javaapplication11;
public class A {
    private int a,b;
    
    //only public void can access by child class
   //parameterized constructors
    public A(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void displayA()
    {
        System.out.println("A:"+a+" B:"+b);
    }
    
}
