package ta;
class A implements Runnable  //2nd method-implement runnable interface
{
public void run()
{
int x;
for(x=1;x<=5;x++)
System.out.println("x "+x);
}
}
