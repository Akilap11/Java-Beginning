package javaapplication15;
public class JavaApplication15 {
    public static void main(String[] args) {
        Bank s=new SBI();
        System.out.println("Rate of interest of SBI is:"+s.getrateofinterset());
        Bank s2=new ICICI();
        System.out.println("Rate of interest of ICICI is:"+s2.getrateofinterset());
        Bank s3=new AXIS();
        System.out.println("Rate of interest of AXIS is:"+s3.getrateofinterset());
        
    }
    
}
