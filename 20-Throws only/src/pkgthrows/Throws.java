package pkgthrows;
public class Throws {
    public int divideNum(int m,int n) throws ArithmeticException 
//if we use throws only, there will  be a error saying arithmetic exception
//Thats why we use catch to give a simple error message
//there are 2 types of exception handling
            //1.Java throws
            //2.Java throws/throw example
        {
            int div=m/n;
            return div;
            
        }
    public static void main(String[] args) {
        Throws t=new Throws();
        try
        {
            System.out.println("Answer is "+t.divideNum(4,0));    
        }
        catch(ArithmeticException e)
        {
            System.out.println("Number Divide By 0 Error");
        }
}
}