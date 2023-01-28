package javaapplication89;
public class JavaApplication89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        shape s=new circle();
        s.draw();
        s.erase();        
        shape c=new triangle();
        c.draw();
        c.erase();
        shape t=new square();
        t.draw();
        t.erase();
    }   
}
