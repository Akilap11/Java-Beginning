package ta;
public class TA {

    public static void main(String[] args) {
        A a=new A();
        A b=new A();
        A c=new A();
    
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        Thread t3=new Thread(c);
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
    